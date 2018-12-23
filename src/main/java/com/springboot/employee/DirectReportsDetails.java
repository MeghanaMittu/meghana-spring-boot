package com.springboot.employee;

public class DirectReportsDetails {
	
	private String name;
	private String positionDefinition;
	
	public DirectReportsDetails() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getPositionDefinition() {
		return positionDefinition;
	}

	public void setPositionDefinition(String positionDefinition) {
		this.positionDefinition = positionDefinition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((positionDefinition == null) ? 0 : positionDefinition.hashCode());
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
		DirectReportsDetails other = (DirectReportsDetails) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (positionDefinition == null) {
			if (other.positionDefinition != null)
				return false;
		} else if (!positionDefinition.equals(other.positionDefinition))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directreportsdetails [name=" + name + ", positionDefinition=" + positionDefinition + "]";
	}

}
