package com.springboot.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employeedetails")
	public static Employees getEmployees() {
		
		DirectReportsDetails reportDetails = new DirectReportsDetails();
		reportDetails.setName("john 1");
		reportDetails.setPositionDefinition("Senior Engineer");
		
		DirectReportsDetails reportDetails1 = new DirectReportsDetails();
		reportDetails1.setName("john 2");
		reportDetails1.setPositionDefinition("principal Engineer");
		
		DirectReportsDetails reportDetails2 = new DirectReportsDetails();
		reportDetails2.setName("john 3");
		reportDetails2.setPositionDefinition("Senior Engineer");
		
		DirectReportsDetails reportDetails3 = new DirectReportsDetails();
		reportDetails3.setName("john 4");
		reportDetails3.setPositionDefinition("principal Engineer");
		
		List<DirectReportsDetails> directvalue = new ArrayList<DirectReportsDetails>();
		directvalue.add(reportDetails);
		directvalue.add(reportDetails2);
		
		List<DirectReportsDetails> directvalue1 = new ArrayList<DirectReportsDetails>();
		directvalue1.add(reportDetails1);
		directvalue1.add(reportDetails3);
		
		PositionDefinitionDetails positionDefinitionDetails = new PositionDefinitionDetails();
		positionDefinitionDetails.setPositionDesc("Manager");
		positionDefinitionDetails.setDepartmentID("9KBP100");
		positionDefinitionDetails.setDepartmentDesc("ALL STAFF");
		positionDefinitionDetails.setLocationDesc("00000021GK");
		positionDefinitionDetails.setLocationDesc("Trinet INC HQ");
		
		PositionDefinitionDetails positionDefinitionDetails1 = new PositionDefinitionDetails();
		positionDefinitionDetails1.setPositionDesc("Team Lead");
		positionDefinitionDetails1.setDepartmentID("9KBP101");
		positionDefinitionDetails1.setDepartmentDesc("ALL STAFF");
		positionDefinitionDetails1.setLocationDesc("00000021GB");
		positionDefinitionDetails1.setLocationDesc("Trinet INC HQ");
		
		EmploymentDetails employmentDetails = new EmploymentDetails();
		employmentDetails.setEmpID("123456789");
		employmentDetails.setCompanyID("Q6W");
		employmentDetails.setPersonID("00002112639");
		employmentDetails.setEmploymentStatus("A");
		employmentDetails.setServiceDate("12-March-2018");
		employmentDetails.setWorkPhone("null");
		employmentDetails.setCompTpye("H");
		
		EmploymentDetails employmentDetails1 = new EmploymentDetails();
		employmentDetails1.setEmpID("123456790");
		employmentDetails1.setCompanyID("Q7W");
		employmentDetails1.setPersonID("142423423432");
		employmentDetails1.setEmploymentStatus("B");
		employmentDetails1.setServiceDate("12-APRIL-2018");
		employmentDetails1.setWorkPhone("null");
		employmentDetails1.setCompTpye("S");
		
		PrimaryNameDetails nameDetails = new PrimaryNameDetails();
		nameDetails.setNameType("PRI");
		nameDetails.setFirstName("Meghana");
		nameDetails.setLastName("Kanneganti");
		
		PrimaryNameDetails nameDetails1 = new PrimaryNameDetails();
		nameDetails1.setNameType("PRI");
		nameDetails1.setFirstName("Krishna");
		nameDetails1.setLastName("Puppy");
				
		EmployeeDetails emplDetails = new EmployeeDetails();
		emplDetails.setCompanyID("Q6W");
		emplDetails.setEmployeeID("123456789");
		emplDetails.setPhoneNumber("9402734575");
		emplDetails.setWorkEmail("meghanakanneganti@gmail.com");
		emplDetails.setPrimaryName(nameDetails);
		emplDetails.setEmployment(employmentDetails);
		emplDetails.setPositionDefinition(positionDefinitionDetails);
		emplDetails.setDirectReports(directvalue);
		
		EmployeeDetails emplDetails1 = new EmployeeDetails();
		emplDetails1.setCompanyID("Q7W");
		emplDetails1.setEmployeeID("123456790");
		emplDetails1.setPhoneNumber("3182437801");
		emplDetails1.setWorkEmail("chaitanyapamulapati@gmail.com");
		emplDetails1.setPrimaryName(nameDetails1);
		emplDetails1.setEmployment(employmentDetails1);
		emplDetails1.setPositionDefinition(positionDefinitionDetails1);
		emplDetails1.setDirectReports(directvalue1);
		
		List<EmployeeDetails> details = new ArrayList<EmployeeDetails>();
		details.add(emplDetails);
		details.add(emplDetails1);
		
		Employees employees = new Employees();
		employees.setEmployees(details);
		
		return employees;
	}	
}
