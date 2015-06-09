package hib;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AttendTable entity. @author MyEclipse Persistence Tools
 */

public class AttendTable implements java.io.Serializable {

	// Fields

	private Integer attendId;
	private TypeTable typeTable;
	private EmpTable empTable;
	private String dutyDay;
	private Timestamp punchTime;
	private Boolean isCome;
	private Set appTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public AttendTable() {
	}

	/** minimal constructor */
	public AttendTable(TypeTable typeTable, EmpTable empTable, String dutyDay,
			Boolean isCome) {
		this.typeTable = typeTable;
		this.empTable = empTable;
		this.dutyDay = dutyDay;
		this.isCome = isCome;
	}

	/** full constructor */
	public AttendTable(TypeTable typeTable, EmpTable empTable, String dutyDay,
			Timestamp punchTime, Boolean isCome, Set appTables) {
		this.typeTable = typeTable;
		this.empTable = empTable;
		this.dutyDay = dutyDay;
		this.punchTime = punchTime;
		this.isCome = isCome;
		this.appTables = appTables;
	}

	// Property accessors

	public Integer getAttendId() {
		return this.attendId;
	}

	public void setAttendId(Integer attendId) {
		this.attendId = attendId;
	}

	public TypeTable getTypeTable() {
		return this.typeTable;
	}

	public void setTypeTable(TypeTable typeTable) {
		this.typeTable = typeTable;
	}

	public EmpTable getEmpTable() {
		return this.empTable;
	}

	public void setEmpTable(EmpTable empTable) {
		this.empTable = empTable;
	}

	public String getDutyDay() {
		return this.dutyDay;
	}

	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay;
	}

	public Timestamp getPunchTime() {
		return this.punchTime;
	}

	public void setPunchTime(Timestamp punchTime) {
		this.punchTime = punchTime;
	}

	public Boolean getIsCome() {
		return this.isCome;
	}

	public void setIsCome(Boolean isCome) {
		this.isCome = isCome;
	}

	public Set getAppTables() {
		return this.appTables;
	}

	public void setAppTables(Set appTables) {
		this.appTables = appTables;
	}

}