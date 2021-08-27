/*
 * Vaccine is a class used as an other custom data type used to store the object of comprised parameter vial number and dose number.*/
package com.aspire.vaccination;

public class Vaccine {
	private int doseNumber;
    private int vialNumber;
	public int getDoseNumber() {
		return doseNumber;
	}
	public void setDoseNumber(int doseNumber) {
		this.doseNumber = doseNumber;
	}
	public int getVialnumber() {
		return vialNumber;
	}
	public void setVialnumber(int vialnumber) {
		this.vialNumber = vialnumber;
	}
	
}
