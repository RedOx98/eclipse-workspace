package org.olahammed;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SiteController() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getParameter("action");
    	switch (action) {
		case "login": {
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "authenticate": {
			
			authenticate(request, response);
			break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
	}

	protected void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("olaide") && password.equals("123456")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			newSession.setAttribute("username", username);
			response.sendRedirect(request.getContextPath() + "/MemberAreaController?action=memberArea");
		} else {
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
		}
	}
}
///SiteController
