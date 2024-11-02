package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serviceController.ContentServiceProvider;

/**
 * Servlet implementation class ContentDetails
 */

public class ContentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContentServiceProvider serviceProvider= new ContentServiceProvider();
		int id=Integer.parseInt(request.getParameter("id"));
		request.setAttribute("content", serviceProvider.getElementById(id));
		response.getWriter().print(serviceProvider.getElementById(id));
//		RequestDispatcher dispatcher=request.getRequestDispatcher("ContentDetails.jsp");
//		dispatcher.forward(request, response);
//		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
