package org.olahammed;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append(" this test");
		
		String param = request.getParameter("page");
		
		if(param != null) {
			if (param.equals("login")) {
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				response.getWriter().append("Served at:").append(param);
			} else if(param.equals("about")) {
				getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
			} else if(param.equals("signUp")) {
				getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
			} else {
				getServletContext().getRequestDispatcher("/default.jsp").forward(request, response);
			}
		}
	}

}
