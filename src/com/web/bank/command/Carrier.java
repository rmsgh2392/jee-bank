package com.web.bank.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrier {
	public static void forward(HttpServletRequest request,HttpServletResponse response){
		
		try {
			request.getRequestDispatcher(Receiver.cmd.getViews())
			.forward(request, response);;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
