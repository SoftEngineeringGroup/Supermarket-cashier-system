package hib;

/**
 * Counter entity. @author MyEclipse Persistence Tools
 */

public class Counter implements java.io.Serializable {

	// Fields

	private String counterId;
	private String counterName;
	private String counterSex;
	private String salary;
	private String workday;
	private String tel;

	// Constructors

	/** default constructor */
	public Counter() {
	}

	/** full constructor */
	public Counter(String counterName, String counterSex, String salary,
			String workday, String tel) {
		this.counterName = counterName;
		this.counterSex = counterSex;
		this.salary = salary;
		this.workday = workday;
		this.tel = tel;
	}

	// Property accessors

	public String getCounterId() {
		return this.counterId;
	}

	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}

	public String getCounterName() {
		return this.counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public String getCounterSex() {
		return this.counterSex;
	}

	public void setCounterSex(String counterSex) {
		this.counterSex = counterSex;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getWorkday() {
		return this.workday;
	}

	public void setWorkday(String workday) {
		this.workday = workday;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}