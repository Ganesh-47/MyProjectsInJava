/*
 * VaccinationUI is a Class used as Interface with user. is*/
package com.aspire.vaccination;
public class VaccinationUI {
	public VaccinatedPersonDetails ui(){
			VaccinatedPersonDetails person=new VaccinatedPersonDetails();
			//Setting the returned value of Datavalidater's static methods
			person.setAadhar(DataValidator.aadharValidate());
			person.setName(DataValidator.nameValidate());
			person.setDateOfBirth(DataValidator.validatedob());
			person.setAge(DataValidator.calculateAge(person.getDateOfBirth()));
			person.setMobileNumber(DataValidator.validatemobilenumber());
			person.setAddress(DataValidator.validateaddress());
			return person;
		}
	}