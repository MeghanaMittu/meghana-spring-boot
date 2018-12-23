package com.springboot.employee;

public class EmploymentDetails {
	
	private String empID;
	private String companyID;
	private String personID;
	private String employmentStatus;
	private String serviceDate;
	private String workPhone;
	private String compTpye;
	
	public EmploymentDetails() {
		super();
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getCompTpye() {
		return compTpye;
	}
	public void setCompTpye(String compTpye) {
		this.compTpye = compTpye;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compTpye == null) ? 0 : compTpye.hashCode());
		result = prime * result + ((companyID == null) ? 0 : companyID.hashCode());
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		result = prime * result + ((employmentStatus == null) ? 0 : employmentStatus.hashCode());
		result = prime * result + ((personID == null) ? 0 : personID.hashCode());
		result = prime * result + ((serviceDate == null) ? 0 : serviceDate.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
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
		EmploymentDetails other = (EmploymentDetails) obj;
		if (compTpye == null) {
			if (other.compTpye != null)
				return false;
		} else if (!compTpye.equals(other.compTpye))
			return false;
		if (companyID == null) {
			if (other.companyID != null)
				return false;
		} else if (!companyID.equals(other.companyID))
			return false;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		if (employmentStatus == null) {
			if (other.employmentStatus != null)
				return false;
		} else if (!employmentStatus.equals(other.employmentStatus))
			return false;
		if (personID == null) {
			if (other.personID != null)
				return false;
		} else if (!personID.equals(other.personID))
			return false;
		if (serviceDate == null) {
			if (other.serviceDate != null)
				return false;
		} else if (!serviceDate.equals(other.serviceDate))
			return false;
		if (workPhone == null) {
			if (other.workPhone != null)
				return false;
		} else if (!workPhone.equals(other.workPhone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "employmentdetails [empID=" + empID + ", companyID=" + companyID + ", personID=" + personID
				+ ", employmentStatus=" + employmentStatus + ", serviceDate=" + serviceDate + ", workPhone=" + workPhone
				+ ", compTpye=" + compTpye + "]";
	}
	

}
