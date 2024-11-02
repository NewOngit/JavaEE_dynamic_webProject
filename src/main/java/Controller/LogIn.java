package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import serviceController.ContentServiceProvider;

/**
 * Servlet implementation class LogIn
 */

public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category=request.getParameter("category");
		HttpSession session =request.getSession();
		session.setAttribute("username", request.getParameter("username"));
		session.setAttribute("password", request.getParameter("password"));
		
		ContentServiceProvider serviceProvider=new ContentServiceProvider() ;
		
		if(category!=null) {
//			response.getWriter().print("Hey "+request.getParameter("category"));
			if(category.equals("cart")&&serviceProvider.getCart().size()!=0) {
				
				request.setAttribute("content",serviceProvider.getCart());
				RequestDispatcher dispatcher=request.getRequestDispatcher("homePage.jsp");
				dispatcher.forward(request, response);
			}
			else {
				request.setAttribute("content",serviceProvider.findByCategories(category));
				RequestDispatcher dispatcher=request.getRequestDispatcher("homePage.jsp");
				dispatcher.forward(request, response);	
					
			}
			
		}
		else {
		 
		
		request.setAttribute("content",serviceProvider.getAll());
		
		
			RequestDispatcher dispatcher=request.getRequestDispatcher("homePage.jsp");
			dispatcher.forward(request, response);	
		
		//else response.getWriter().print("No content Available");
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
