package mine.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mine.entity.User;
import mine.model.UserModel;

/**
 * Servlet implementation class Site
 */
@WebServlet("/site")
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("page").toLowerCase();
		switch (page) {
			case "listusers":
				
				listusers(request, response);
				break;
			case "adduser":
				addUser(request, response);
				break;
			case "updateuser": 
				updateuser(request, response);
				break;
			case "deleteuser":
				new UserModel().deleteUser(Integer.parseInt(request.getParameter("user_id")));
				listusers(request, response);
				break;
			default:
				request.setAttribute("title", "Error page");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String form = request.getParameter("form").toLowerCase();
		switch (form) {
		
			case "adduseroperation":
				User user = new User(request.getParameter("username"), request.getParameter("email"));
				new UserModel().addUser(user);
				listusers(request, response);
				break;
			case "updateuseroperation":
				User updated_user = new User(Integer.parseInt(request.getParameter("user_id")) ,request.getParameter("username"), request.getParameter("email"));
				new UserModel().updateUser(updated_user);
				listusers(request, response);
				break;
				
			default:
				request.setAttribute("title", "Error page");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				break;
			
		
			
		}
	}
	protected void listusers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		users = new UserModel().listuser();
		request.setAttribute("listusers", users);
		request.setAttribute("title", "List users");
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
	}
	protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("title", "Add user");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
	protected void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "update user");
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);
	}
}
