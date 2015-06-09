package action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import hib.*;
import service.*;
import java.util.*;
import service.impl.*;
public class StockAction extends ActionSupport {
 private List list;
 private SalegoodsService us;

public List getList() {
	return list;
}

public void setList(List<Goods> list) {
	this.list = list;
}
public String execute() throws Exception {
	ServletContext sc= ServletActionContext.getRequest().getSession().getServletContext();
	ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sc);
	//us=(EmpValide) ctx.getSession().get("EmpValide");	
	us=(SalegoodsService) ac.getBean("SalegoodsService");
	list=us.findall();
	System.out.println("check");

	return "success";
	

}
}