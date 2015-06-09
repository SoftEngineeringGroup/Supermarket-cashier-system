package action;

import javax.servlet.*;

import java.util.*;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import hib.*;
import service.*;
import service.impl.*;
public class PrintAction extends ActionSupport {
 private List list;
 private GoodsService us;

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
	us=(GoodsService) ac.getBean("GoodsService");
	list=us.findallgoods();
	System.out.println("check");
	System.out.println(((Goods)list.get(0)).getGoodsId());
	return "success";
	

}
}


