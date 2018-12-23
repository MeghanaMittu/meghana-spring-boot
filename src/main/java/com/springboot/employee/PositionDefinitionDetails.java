package com.springboot.employee;

public class PositionDefinitionDetails {
	
	private String positionDesc;
	private String departmentID;
	private String departmentDesc;
	private String locationID;
	private String locationDesc;
	
	public PositionDefinitionDetails() {
		super();
	}

	public String getPositionDesc() {
		return positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentDesc() {
		return departmentDesc;
	}

	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getLocationDesc() {
		return locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentDesc == null) ? 0 : departmentDesc.hashCode());
		result = prime * result + ((departmentID == null) ? 0 : departmentID.hashCode());
		result = prime * result + ((locationDesc == null) ? 0 : locationDesc.hashCode());
		result = prime * result + ((locationID == null) ? 0 : locationID.hashCode());
		result = prime * result + ((positionDesc == null) ? 0 : positionDesc.hashCode());
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
		PositionDefinitionDetails other = (PositionDefinitionDetails) obj;
		if (departmentDesc == null) {
			if (other.departmentDesc != null)
				return false;
		} else if (!departmentDesc.equals(other.departmentDesc))
			return false;
		if (departmentID == null) {
			if (other.departmentID != null)
				return false;
		} else if (!departmentID.equals(other.departmentID))
			return false;
		if (locationDesc == null) {
			if (other.locationDesc != null)
				return false;
		} else if (!locationDesc.equals(other.locationDesc))
			return false;
		if (locationID == null) {
			if (other.locationID != null)
				return false;
		} else if (!locationID.equals(other.locationID))
			return false;
		if (positionDesc == null) {
			if (other.positionDesc != null)
				return false;
		} else if (!positionDesc.equals(other.positionDesc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Positiondefinitiondetails [positionDesc=" + positionDesc + ", departmentID=" + departmentID
				+ ", departmentDesc=" + departmentDesc + ", locationID=" + locationID + ", locationDesc=" + locationDesc
				+ "]";
	}
	
	
	

}
