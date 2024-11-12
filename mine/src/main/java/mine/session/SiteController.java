package mine.session;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/mineSiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
    	switch (action) {
			case "login": {
				request.getRequestDispatcher("session/login.jsp").forward(request, response);
				break;
			}
			default:
				request.getRequestDispatcher("session/index.jsp").forward(request, response);
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
    	switch (action) {
		case "authenticate": {
			authenticate(request, response);
			break;
		}
		default:
			request.getRequestDispatcher("session/index.jsp").forward(request, response);
			break;
		}
		
	}
	
	
	protected void authenticate(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("vctduong") && password.equals("vctduong")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			newSession.setAttribute("username", username);
		    response.sendRedirect(request.getContextPath()+"/mineMemberAreaController?action=memberArea");
		}else {
			response.sendRedirect(request.getContextPath()+"/mineSiteController?action=login");
		}
		
	}

}
