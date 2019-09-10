package com.web.bank.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bank.enums.*;
public class Receiver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		try {
			switch (Action.valueOf(request.getParameter("action"))) {
			case LOGIN:
				cmd = new LoginCommand(request);
				break;
			case JOIN:
				cmd = new CreateCommand(request);
				break;
			default:
				cmd = new MoveCommand(request);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
