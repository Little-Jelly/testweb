package com.youfa.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.youfa.TestData.Bookdata;

/**
 * Servlet implementation class Booklist
 */
public class Booklist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booklist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String url = "";
		out.println(Bookdata.getBook("1").getName()+","+Bookdata.getBook("1").getPrice()+","+Bookdata.getBook("1").getCategory()+"<a href'"+ url + "'>buy</a>"+"\n"+
		Bookdata.getBook("2").getName()+","+Bookdata.getBook("2").getPrice()+","+Bookdata.getBook("2").getCategory()+"\n"+
		Bookdata.getBook("3").getName()+","+Bookdata.getBook("3").getPrice()+","+Bookdata.getBook("3").getCategory()+"\n"+
		Bookdata.getBook("4").getName()+","+Bookdata.getBook("4").getPrice()+","+Bookdata.getBook("4").getCategory());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
