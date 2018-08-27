package com.ex.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book b = new Book();
		b.setTitle("Web Programming for Dummies");
		b.setAuthor("Curious, George");
		b.setPubYear("2020");
		
		String bJson = new ObjectMapper().writeValueAsString(b);
		resp.getWriter().write(bJson);
		resp.setStatus(200);
		resp.set
		
	}
	
}
