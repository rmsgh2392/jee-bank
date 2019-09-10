package com.web.bank.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomains(domains);
		setAction(request.getParameter("action")==null ?
				 "move" : request.getParameter("action"));
		execute();
	}

	
	@Override
	public void execute() {
		super.execute();
		request.setAttribute("page",request.getParameter("page"));
	}
}
