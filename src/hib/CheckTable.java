package hib;

/**
 * CheckTable entity. @author MyEclipse Persistence Tools
 */

public class CheckTable implements java.io.Serializable {

	// Fields

	private Integer checkId;
	private AppTable appTable;
	private EmpTable empTable;
	private Boolean checkResult;
	private String checkReason;

	// Constructors

	/** default constructor */
	public CheckTable() {
	}

	/** minimal constructor */
	public CheckTable(AppTable appTable, EmpTable empTable, Boolean checkResult) {
		this.appTable = appTable;
		this.empTable = empTable;
		this.checkResult = checkResult;
	}

	/** full constructor */
	public CheckTable(AppTable appTable, EmpTable empTable,
			Boolean checkResult, String checkReason) {
		this.appTable = appTable;
		this.empTable = empTable;
		this.checkResult = checkResult;
		this.checkReason = checkReason;
	}

	// Property accessors

	public Integer getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public AppTable getAppTable() {
		return this.appTable;
	}

	public void setAppTable(AppTable appTable) {
		this.appTable = appTable;
	}

	public EmpTable getEmpTable() {
		return this.empTable;
	}

	public void setEmpTable(EmpTable empTable) {
		this.empTable = empTable;
	}

	public Boolean getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}

	public String getCheckReason() {
		return this.checkReason;
	}

	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
	}

}