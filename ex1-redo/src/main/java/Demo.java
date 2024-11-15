

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param = request.getParameter("page");
		switch (param) {
		case "login":
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			break;
		case "signup":
			getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
			break;
		case "about":
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

}
