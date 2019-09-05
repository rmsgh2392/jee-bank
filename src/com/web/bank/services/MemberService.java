package com.web.bank.services;

import java.util.List;

import com.web.bank.domains.*;


public interface MemberService {
	void join(CustomerBean param);
	public CustomerBean login(MemberBean param); 
	public void register(EmployeeBean param);
	
	
}
