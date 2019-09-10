package com.web.bank.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bank.domains.CustomerBean;
import com.web.bank.services.MemberService;
import com.web.bank.servicesImpl.MemberServiceImpl;

public class LoginCommand extends MoveCommand{
	public LoginCommand(HttpServletRequest request) {
		super(request);
	}
	@Override
	public void execute() {
		CustomerBean customer = new CustomerBean();
		MemberService sc = new MemberServiceImpl();
		super.execute();
		customer = new CustomerBean();
		customer.setId(request.getParameter("id"));
		customer.setPw(request.getParameter("pw"));
		CustomerBean param = sc.login(customer);
		Receiver.cmd.setPage("login");
	}
}
