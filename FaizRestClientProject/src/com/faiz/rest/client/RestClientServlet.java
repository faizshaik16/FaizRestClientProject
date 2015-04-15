package com.faiz.rest.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

/**
 * Servlet implementation class RestClientServlet
 */
@WebServlet("/RestClientServlet")
public class RestClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		Client client = Client.create();
		
		String userName =(String) request.getParameter("username");
		System.out.println(" userName = " + userName);
		String emailId =(String) request.getParameter("emailid");
		System.out.println(" emailId = " + emailId);
		Form form = new Form();
		form.add("username", userName);
		
		//WebResource webResource = client.resource("http://localhost:8080/FaizRestProject/api/v2/status/empdb");
		WebResource webResource = client.resource("http://localhost:8080/FaizRestProject/api/v3/status/fp");
		//ClientResponse clientResponse = webResource.accept("text/html").get(ClientResponse.class);
		ClientResponse clientResponse = webResource.accept("text/html").post(ClientResponse.class, form);
		
		if(clientResponse.getStatus() == 200){
			String output = clientResponse.getEntity(String.class);
			out.println(output);
				
		}
	}

}
