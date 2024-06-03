package org.olahammed;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FormsUnderJSP extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
   
    public FormsUnderJSP() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println(request.getParameter("fullname") + "<br/>");
		response.getWriter().println(request.getParameter("gender") + "<br/>");
		
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if(languages != null){
			for(int i = 0; i < languages.length; i++){
				 
				out.print("<br/>");
				out.print(languages[i]);
			}
		} else {
			out.print("None selected");
		}
		response.getWriter().println(request.getParameter("country") + "<br/> ");
	}

}
