package com.aspire.vaccine;

import java.io.Serializable;

public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7860516211201910215L;
	private int appointmentNumber;
	private String name;
	private int date;
	private int time;
	public Appointment() {
		
	}
	public int getAppointmentNumber() {
		return appointmentNumber;
	}
	public void setAppointmentNumber(int appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
}
