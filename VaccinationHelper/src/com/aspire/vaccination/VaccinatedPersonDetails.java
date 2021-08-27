/*Person is act as Custom Data type consisting the Variables name, aadar and age.*/
package com.aspire.vaccination;

import java.time.LocalDate;

public class VaccinatedPersonDetails {
	    private String name="";
	    private String aadhar="";
	    private String address="";
	    private int age=0;
	    private LocalDate dateOfBirth;
	    private long mobileNumber=0;
	    private int dateofvaccination=0;//fix by controller
	
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAadhar() {
			return aadhar;
		}
		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public int getDateofvaccination() {
			return dateofvaccination;
		}
		public void setDateofvaccination(int dateofvaccination) {
			this.dateofvaccination = dateofvaccination;
		}
		
		
		
}
