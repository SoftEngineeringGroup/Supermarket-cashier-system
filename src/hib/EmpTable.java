package hib;

import java.util.HashSet;
import java.util.Set;

/**
 * EmpTable entity. @author MyEclipse Persistence Tools
 */

public class EmpTable implements java.io.Serializable {

	// Fields

	private Integer empId;
	private EmpTable empTable;
	private Integer empType;
	private String empName;
	private String empPass;
	private Double empSalary;
	private String deptName;
	private Set empTables = new HashSet(0);
	private Set payTables = new HashSet(0);
	private Set attendTables = new HashSet(0);
	private Set checkTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public EmpTable() {
	}

	/** minimal constructor */
	public EmpTable(String empName, String empPass, Double empSalary) {
		this.empName = empName;
		this.empPass = empPass;
		this.empSalary = empSalary;
	}

	/** full constructor */
	public EmpTable(EmpTable empTable, Integer empType, String empName,
			String empPass, Double empSalary, String deptName, Set empTables,
			Set payTables, Set attendTables, Set checkTables) {
		this.empTable = empTable;
		this.empType = empType;
		this.empName = empName;
		this.empPass = empPass;
		this.empSalary = empSalary;
		this.deptName = deptName;
		this.empTables = empTables;
		this.payTables = payTables;
		this.attendTables = attendTables;
		this.checkTables = checkTables;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public EmpTable getEmpTable() {
		return this.empTable;
	}

	public void setEmpTable(EmpTable empTable) {
		this.empTable = empTable;
	}

	public Integer getEmpType() {
		return this.empType;
	}

	public void setEmpType(Integer empType) {
		this.empType = empType;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPass() {
		return this.empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public Double getEmpSalary() {
		return this.empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set getEmpTables() {
		return this.empTables;
	}

	public void setEmpTables(Set empTables) {
		this.empTables = empTables;
	}

	public Set getPayTables() {
		return this.payTables;
	}

	public void setPayTables(Set payTables) {
		this.payTables = payTables;
	}

	public Set getAttendTables() {
		return this.attendTables;
	}

	public void setAttendTables(Set attendTables) {
		this.attendTables = attendTables;
	}

	public Set getCheckTables() {
		return this.checkTables;
	}

	public void setCheckTables(Set checkTables) {
		this.checkTables = checkTables;
	}

}