package action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import hib.*;
import service.*;
import service.impl.*;
public class ShouYin2Action extends ActionSupport {
	
	private Client emp;
	private ClientService us;
	private GoodsService us1;
	private SalegoodsService us2;
	private MemberService us3;
	public ClientService getUs() {
		return us;
	}
	public void setUs(ClientService us) {
		this.us = us;
	}
	public Client getEmp() {
		return emp;
	}
	public void setEmp(Client emp) {
		this.emp = emp;
	}
	public GoodsService getUs1() {
		return us1;
	}
	public void setUs1(GoodsService us1) {
		this.us1 = us1;
	}
	public SalegoodsService getUs2() {
		return us2;
	}
	public void setUs2(SalegoodsService us2) {
		this.us2 = us2;
	}
	public MemberService getUs3() {
		return us3;
	}
	public void setUs2(MemberService us3) {
		this.us3 = us3;
	}




	public String execute() throws Exception {
		//TODO Auto-generated method stub
		
		ServletContext sc= ServletActionContext.getRequest().getSession().getServletContext();
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sc);
		us=(ClientService) ac.getBean("ClientService");
		ServletContext sc1= ServletActionContext.getRequest().getSession().getServletContext();
		ApplicationContext ac1=WebApplicationContextUtils.getWebApplicationContext(sc1);
		us1=(GoodsService) ac1.getBean("GoodsService");
		ServletContext sc2= ServletActionContext.getRequest().getSession().getServletContext();
		ApplicationContext ac2=WebApplicationContextUtils.getWebApplicationContext(sc2);
		us2=(SalegoodsService) ac2.getBean("SalegoodsService");
		ServletContext sc3= ServletActionContext.getRequest().getSession().getServletContext();
		ApplicationContext ac3=WebApplicationContextUtils.getWebApplicationContext(sc3);
		us3=(MemberService) ac3.getBean("MemberService");
       //System.out.println(ServletActionContext.getRequest().getAttribute("EmpDAO"));
		System.out.println(this.getEmp().getCounterId()+this.getEmp().getTradeId()+this.getEmp().getBuyDate()+this.getEmp().getGoodsId()+this.getEmp().getSaleQuantity());
		this.getEmp().setPrice(us1.findGoodsprice(this.getEmp().getGoodsId()));
		double t=this.getEmp().getSaleQuantity()*this.getEmp().getPrice();
		this.getEmp().setTotalPrice(t);
		System.out.println(this.getEmp().getPrice());
		System.out.println(this.getEmp().getTotalPrice());
		us.addClient(this.getEmp());
		int idofgoods=this.getEmp().getGoodsId();
		Goods goods=new Goods();
		System.out.println("check"+idofgoods);
		goods.setGoodsName(us1.findGoodsname(idofgoods));
		goods.setGoodsId(idofgoods);
		goods.setPrice(us1.findGoodsprice(idofgoods));
		goods.setMemberPrice(us1.findGoodsmemberprice(idofgoods));
		goods.setTotal(us1.findGoods(idofgoods).getTotal());
		goods.setCurrentQuantity(us1.findGoods(idofgoods).getCurrentQuantity()-this.getEmp().getSaleQuantity());
		us1.updateGoods(goods);
		
		Salegoods salegoods=new Salegoods();
		
		salegoods.setGoodsName(us2.findSalegoods(idofgoods).getGoodsName());
		salegoods.setGoodsId(idofgoods);
		System.out.println("check"+idofgoods);
		salegoods.setTotal(us2.findSalegoods(idofgoods).getTotal());
		salegoods.setSaleQuantity(us2.findSalegoods(idofgoods).getSaleQuantity()+this.getEmp().getSaleQuantity());
		salegoods.setCurrentQuantity(us2.findSalegoods(idofgoods).getCurrentQuantity()-this.getEmp().getSaleQuantity());
		salegoods.setSumPrice(us2.findSalegoods(idofgoods).getSumPrice()+t);
		us2.updateSalegoods(salegoods);
		if(t<=200)
	    return "success";
		else {
	
			us3.addmember();
			return "success";
			}
		}
		
		
	}
