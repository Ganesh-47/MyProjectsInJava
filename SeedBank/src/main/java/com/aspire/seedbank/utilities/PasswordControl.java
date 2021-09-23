package com.aspire.seedbank.utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordControl {
	
	public static String passHashing(String password) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			byte[] resultByteArray = messageDigest.digest();
			StringBuilder hashPassword = new StringBuilder();
			
			for(byte bytes:resultByteArray) {
				hashPassword.append(String.format("%02x",bytes));
			}
			return hashPassword.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

}
