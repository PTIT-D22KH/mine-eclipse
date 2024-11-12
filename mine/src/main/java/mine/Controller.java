package mine;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/mineController")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name") + "<br/>");
		response.getWriter().println(request.getParameter("gender") + "<br/>");

		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i < languages.length; i++) {

				out.print(languages[i]);
				out.print("<br/>");
			}
		} else {
			out.print("None Selected");
		}

		response.getWriter().println(request.getParameter("country") + "<br/>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name") + "<br/>");
		response.getWriter().println(request.getParameter("gender") + "<br/>");

		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i < languages.length; i++) {

				out.print(languages[i]);
				out.print("<br/>");
			}
		} else {
			out.print("None Selected");
		}

		response.getWriter().println(request.getParameter("country") + "<br/>");
	}

}
