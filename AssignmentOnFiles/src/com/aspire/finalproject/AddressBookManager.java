package com.aspire.finalproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AddressBookManager {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(AddressBookManager.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		log.info("Hi");
	}

}
