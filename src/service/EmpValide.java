package service;

import hib.EmpTable;

public interface EmpValide {
	public EmpTable getUserByEmpName(String userName);
	public void addEmp(EmpTable user);
	public boolean validEmp(EmpTable user);
}
