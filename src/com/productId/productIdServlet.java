package com.productId;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.RetrieveDetail;

/**
 * Servlet implementation class productIdServlet
 */
@WebServlet("/productIdServlet")
public class productIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String prodId = request.getParameter("productid");
		
		RetrieveDetail detail = new  RetrieveDetail();
		
			out.println("Details " + detail.getRecordById(Integer.parseInt(prodId)));
		
		
		
	}

}
