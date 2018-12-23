package com.springboot.employee;

public class PrimaryNameDetails {
	
	private String nameType;
	private String firstName;
	private String lastName;
	
	public PrimaryNameDetails() {
		super();
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((nameType == null) ? 0 : nameType.hashCode());
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
		PrimaryNameDetails other = (PrimaryNameDetails) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (nameType == null) {
			if (other.nameType != null)
				return false;
		} else if (!nameType.equals(other.nameType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Primarynamedetails [nameType=" + nameType + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
