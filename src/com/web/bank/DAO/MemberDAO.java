package com.web.bank.DAO;

import com.web.bank.domains.*;


public interface MemberDAO {
	public void insertCustomer(CustomerBean param);
	public void insertEmployee(EmployeeBean param);
	public CustomerBean login();
	
}
