package com.web.bank.servicesImpl;

import java.util.List;

import com.web.bank.DAO.MemberDAO;
import com.web.bank.DAOImpl.MemberDAOImpl;
import com.web.bank.domains.CustomerBean;
import com.web.bank.domains.EmployeeBean;
import com.web.bank.domains.MemberBean;
import com.web.bank.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAOImpl();
	}
	@Override
	public void join(CustomerBean param) {
		dao.insertCustomer(param);
	}

	@Override
	public CustomerBean login(MemberBean param) {
		CustomerBean cb = dao.login();
		if(cb.getId().equals(param.getId())&&cb.getPw().equals(param.getPw())) {
			
		}else {
			cb = null;
		}
		return cb;
	}

	@Override
	public void register(EmployeeBean param) {
		// TODO Auto-generated method stub
		
	}

	


}
