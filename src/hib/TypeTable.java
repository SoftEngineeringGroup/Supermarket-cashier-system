package hib;

import java.util.HashSet;
import java.util.Set;

/**
 * TypeTable entity. @author MyEclipse Persistence Tools
 */

public class TypeTable implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private Double amerceAmount;
	private Set attendTables = new HashSet(0);
	private Set appTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public TypeTable() {
	}

	/** minimal constructor */
	public TypeTable(String typeName, Double amerceAmount) {
		this.typeName = typeName;
		this.amerceAmount = amerceAmount;
	}

	/** full constructor */
	public TypeTable(String typeName, Double amerceAmount, Set attendTables,
			Set appTables) {
		this.typeName = typeName;
		this.amerceAmount = amerceAmount;
		this.attendTables = attendTables;
		this.appTables = appTables;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Double getAmerceAmount() {
		return this.amerceAmount;
	}

	public void setAmerceAmount(Double amerceAmount) {
		this.amerceAmount = amerceAmount;
	}

	public Set getAttendTables() {
		return this.attendTables;
	}

	public void setAttendTables(Set attendTables) {
		this.attendTables = attendTables;
	}

	public Set getAppTables() {
		return this.appTables;
	}

	public void setAppTables(Set appTables) {
		this.appTables = appTables;
	}

}