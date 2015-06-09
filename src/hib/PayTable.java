package hib;

/**
 * PayTable entity. @author MyEclipse Persistence Tools
 */

public class PayTable implements java.io.Serializable {

	// Fields

	private Integer payId;
	private EmpTable empTable;
	private String payMonth;
	private Double payAmount;

	// Constructors

	/** default constructor */
	public PayTable() {
	}

	/** full constructor */
	public PayTable(EmpTable empTable, String payMonth, Double payAmount) {
		this.empTable = empTable;
		this.payMonth = payMonth;
		this.payAmount = payAmount;
	}

	// Property accessors

	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public EmpTable getEmpTable() {
		return this.empTable;
	}

	public void setEmpTable(EmpTable empTable) {
		this.empTable = empTable;
	}

	public String getPayMonth() {
		return this.payMonth;
	}

	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}

	public Double getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

}