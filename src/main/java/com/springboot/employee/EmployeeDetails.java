package com.springboot.employee;

import java.util.List;

public class EmployeeDetails {
	
	private String companyID;
	private String employeeID;
	private String phoneNumber;
	private String workEmail;
	private PrimaryNameDetails primaryName;
	private EmploymentDetails employment;
	private PositionDefinitionDetails positionDefinition;
	private List<DirectReportsDetails> directReports;
	
	
	public EmployeeDetails() {
		super();
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	public PrimaryNameDetails getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(PrimaryNameDetails primaryName) {
		this.primaryName = primaryName;
	}

	public EmploymentDetails getEmployment() {
		return employment;
	}

	public void setEmployment(EmploymentDetails employment) {
		this.employment = employment;
	}

	public PositionDefinitionDetails getPositionDefinition() {
		return positionDefinition;
	}

	public void setPositionDefinition(PositionDefinitionDetails positionDefinition) {
		this.positionDefinition = positionDefinition;
	}

	public List<DirectReportsDetails> getDirectReports() {
		return directReports;
	}

	public void setDirectReports(List<DirectReportsDetails> directReports) {
		this.directReports = directReports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyID == null) ? 0 : companyID.hashCode());
		result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((workEmail == null) ? 0 : workEmail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		if (companyID == null) {
			if (other.companyID != null)
				return false;
		} else if (!companyID.equals(other.companyID))
			return false;
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (workEmail == null) {
			if (other.workEmail != null)
				return false;
		} else if (!workEmail.equals(other.workEmail))
			return false;
		return true;
	}

	public String toString() {
		return "employeedetails [companyID=" + companyID + ", employeeID=" + employeeID + ", phoneNumber=" + phoneNumber
				+ ", workEmail=" + workEmail + "]";
	}

}
