package com.aspire.venkatAddressBook;

import java.io.IOException;
import java.util.HashMap;

public interface IAddressBookFileAccessController {
	public boolean isFileExist(String path, String filename)throws IOException;
	public  boolean createFile(String path, String filename) throws IOException;
	public  boolean appendToFile(String path, String filename,String row)throws IOException ;
	public  HashMap<Integer,AddressBook> getContactMapFromFile(String path, String filename) throws IOException;
	public  boolean saveChanges(String path, String filename, HashMap<Integer,AddressBook> data) throws IOException;
	public  boolean deleteFile(String path, String filename) throws IOException;
}
