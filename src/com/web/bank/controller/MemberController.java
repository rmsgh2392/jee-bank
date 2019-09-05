package com.web.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bank.constants.Constant;
import com.web.bank.domains.CustomerBean;
import com.web.bank.domains.MemberBean;
import com.web.bank.services.MemberService;
import com.web.bank.servicesImpl.MemberServiceImpl;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerBean customer = null;
		MemberBean member = new MemberBean();
		MemberService sc = null;
		switch (request.getParameter("action")) {
		case "move":
			request.getRequestDispatcher
			(String.format(Constant.VIEW_PATH,"customers",request.getParameter("dest")))
			.forward(request, response);
			break;
		case "join":
			customer = new CustomerBean();
			customer.setId(request.getParameter("id"));
			customer.setPw(request.getParameter("pw"));
			customer.setName( request.getParameter("name"));
			customer.setSsn( request.getParameter("ssn"));
			customer.setCredit(request.getParameter("credit"));
			sc = new MemberServiceImpl();
			sc.join(customer);
			break;
		case "login":
			customer.setId(request.getParameter("id"));
			customer.setPw(request.getParameter("pw"));
			CustomerBean bean = sc.login(customer);
			
			
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
