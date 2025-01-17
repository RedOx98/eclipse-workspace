package org.olahammed;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberAreaController() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch (action) {
		case "destroy": {
			
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
			break;
//			Cookie[] cookies = request.getCookies();
//			for(Cookie cookie: cookies) {
//				if(cookie.getName().equals("username")) {
//					cookie.setValue(null);
//					cookie.setMaxAge(0);
//					response.addCookie(cookie);
//				}
//				
//			}
		}
		case "memberArea": {
			request.getRequestDispatcher("member.jsp").forward(request, response);
			break;
		}
		}
	}

}
