package com.web.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.regexp.internal.recompile;
import com.web.bank.command.Carrier;
import com.web.bank.command.Receiver;
import com.web.bank.constants.Constant;
import com.web.bank.domains.CustomerBean;
import com.web.bank.domains.MemberBean;
import com.web.bank.services.MemberService;
import com.web.bank.servicesImpl.MemberServiceImpl;


@WebServlet("/customers.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request);
		Receiver.cmd.execute();
		switch (Receiver.cmd.getAction()) {
		case "join":
			break;
		case "login":
			break;
		}
		Carrier.forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
