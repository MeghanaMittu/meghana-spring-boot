package com.springboot.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/getpersondetails")
	public static List<PersonDetails> dtls(){
		
		PersonAddressDetails ddd = new PersonAddressDetails("springhouse", 94588, "pleasanton");
		PersonAddressDetails ddd1 = new PersonAddressDetails("morh ave", 87695, "Fremont");
		PersonAddressDetails ddd2 = new PersonAddressDetails("santa rita", 67528, "sam roman");
		PersonAddressDetails ddd3 = new PersonAddressDetails("house", 94688, "dublin");
		PersonAddressDetails ddd4 = new PersonAddressDetails("mave", 87695, "tracy");
		PersonAddressDetails ddd5 = new PersonAddressDetails("rita", 67528, "roman");
		
		List<PersonAddressDetails> listOfAddress1 = new ArrayList<PersonAddressDetails>();
		listOfAddress1.add(ddd);
		listOfAddress1.add(ddd1);
		
		List<PersonAddressDetails> listOfAddress2 = new ArrayList<PersonAddressDetails>();
		listOfAddress2.add(ddd2);
		listOfAddress2.add(ddd3);
		
		List<PersonAddressDetails> listOfAddress3 = new ArrayList<PersonAddressDetails>();
		listOfAddress3.add(ddd4);
		listOfAddress3.add(ddd5);
		
		
		PersonDetails order = new PersonDetails(1, "asha", "98765425684", listOfAddress1);
		PersonDetails order1 = new PersonDetails(2, "basha", "6794683219", listOfAddress2);
		PersonDetails order2 = new PersonDetails(3, "Cya", "78096527529", listOfAddress3);
		
		List<PersonDetails> dtls = new ArrayList<PersonDetails>();
		dtls.add(order);
		dtls.add(order1);
		dtls.add(order2);
		return dtls;
		
	}
	
}
