package com.shoppingcart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoppingcart.buslogic.ItemManager;

/**
 * Servlet implementation class ShoppingServlet
 */
@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	ItemManager itemManager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>");
		out.println("Shopping cart");
		out.println("</title></head>");
		out.println("<body>");       
		out.println("<h1>");
		out.println("Hello");
		
		 out.println(itemManager.getItemName());
		out.println("</h1>");
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>");
		out.println("Shopping cart");
		out.println("</title></head>");
		out.println("<body>");       
		out.println("<h1>");
		out.println("Hello");
		
		 out.println(itemManager.getItemName());
		out.println("</h1>");
	}

}
