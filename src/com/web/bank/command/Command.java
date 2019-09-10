package com.web.bank.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bank.constants.Constant;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action,domains,views,page;
	
	
	@Override
	public void execute() {
		setDomains();
		setPage();
		setView();
		System.out.println("request경로:"+ this.views);
	}
	public void setDomains() {
		String path = request.getServletPath();//-->  /customer.do
		domains = path.replace(".do","");//--> .do제거 하는 메서드 
		domains = domains.substring(1);//--> /customer에서  /을 제거한 모양 --> customer <==최종 결과 
	}
	public void setPage() {
		page = request.getParameter("page");
	}
	public void setView() {
		views = String.format(Constant.VIEW_PATH,domains,page);
//		public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
//	    1.%s = customer , 2.%s = .jsp파일(login,join,mypage)중 하나  
	}
	
}
