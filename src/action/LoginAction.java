package action;

import javax.servlet.*;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import hib.*;
import service.*;
import service.impl.*;

public class LoginAction extends ActionSupport {
	private User emp;
	private UserService us;
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	public User getEmp() {
		return emp;
	}
	public void setEmp(User emp) {
		this.emp = emp;
	}

	@Override
	public String execute() throws Exception {
		//TODO Auto-generated method stub
		
		ServletContext sc= ServletActionContext.getRequest().getSession().getServletContext();
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sc);
		//us=(EmpValide) ctx.getSession().get("EmpValide");	
		us=(UserService) ac.getBean("UserService");
		System.out.println(getEmp().getUserName()+getEmp().getPassword());		
       //System.out.println(ServletActionContext.getRequest().getAttribute("EmpDAO"));
		//System.out.println(us.validEmp(getEmp()));
		//if (us.validEmp(getEmp()))
		boolean a=us.validUser(emp);
		if(a==false)
		
	
			return "error";
		else return "success";
		
	}

}

