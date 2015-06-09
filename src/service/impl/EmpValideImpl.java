package service.impl;
import java.util.List;
import service.*;
import hib.*;
public class EmpValideImpl implements EmpValide{
	private EmpTableDAO empDao;
	public EmpTableDAO getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpTableDAO empDao) {
		this.empDao = empDao;
	}

	public EmpTable getUserByEmpName(String userName) {
		// TODO Auto-generated method stub
		List a= empDao.findByEmpName(userName);
		System.out.println("test4");
		if (!(a.size()==0) )
			return (EmpTable) a.get(0);
		else
			return null;
		
	}

	@Override
	public void addEmp(EmpTable user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validEmp(EmpTable user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmpName());
		EmpTable e=getUserByEmpName(user.getEmpName());
		System.out.println(e.getEmpPass());
		if (e==null) 
		{return false;}
		else
		{
			return e.getEmpPass().equals(user.getEmpPass());
		}
	}
}


	


