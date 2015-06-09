package hib;

import java.util.HashSet;
import java.util.Set;

/**
 * AppTable entity. @author MyEclipse Persistence Tools
 */

public class AppTable implements java.io.Serializable {

	// Fields

	private Integer appId;
	private TypeTable typeTable;
	private AttendTable attendTable;
	private String appReason;
	private Boolean appResult;
	private Set checkTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public AppTable() {
	}

	/** minimal constructor */
	public AppTable(TypeTable typeTable, AttendTable attendTable) {
		this.typeTable = typeTable;
		this.attendTable = attendTable;
	}

	/** full constructor */
	public AppTable(TypeTable typeTable, AttendTable attendTable,
			String appReason, Boolean appResult, Set checkTables) {
		this.typeTable = typeTable;
		this.attendTable = attendTable;
		this.appReason = appReason;
		this.appResult = appResult;
		this.checkTables = checkTables;
	}

	// Property accessors

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public TypeTable getTypeTable() {
		return this.typeTable;
	}

	public void setTypeTable(TypeTable typeTable) {
		this.typeTable = typeTable;
	}

	public AttendTable getAttendTable() {
		return this.attendTable;
	}

	public void setAttendTable(AttendTable attendTable) {
		this.attendTable = attendTable;
	}

	public String getAppReason() {
		return this.appReason;
	}

	public void setAppReason(String appReason) {
		this.appReason = appReason;
	}

	public Boolean getAppResult() {
		return this.appResult;
	}

	public void setAppResult(Boolean appResult) {
		this.appResult = appResult;
	}

	public Set getCheckTables() {
		return this.checkTables;
	}

	public void setCheckTables(Set checkTables) {
		this.checkTables = checkTables;
	}

}