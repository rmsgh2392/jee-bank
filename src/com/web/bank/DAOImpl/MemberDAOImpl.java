package com.web.bank.DAOImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.web.bank.DAO.MemberDAO;
import com.web.bank.constants.Constant;
import com.web.bank.domains.CustomerBean;
import com.web.bank.domains.EmployeeBean;

public class MemberDAOImpl implements MemberDAO{
	File file = new File(Constant.FILE_PATH + "customer.txt");
	@Override
	public void insertCustomer(CustomerBean param) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(String.format("%s,%s,%s,%s,%s"
					,param.getId(),param.getPw(),param.getName(),param.getSsn(),param.getCredit()));
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertEmployee(EmployeeBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerBean login() {
			CustomerBean customer = new CustomerBean();
			try {
				String temp = "";
				BufferedReader reader = new BufferedReader(new FileReader(file));
				temp = reader.readLine();
				String[] arr = temp.split(",");
				customer.setId(arr[0]);
				customer.setPw(arr[1]);
				customer.setName(arr[2]);
				customer.setSsn(arr[3]);
				customer.setCredit(arr[4]);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		return customer;
	}

}
