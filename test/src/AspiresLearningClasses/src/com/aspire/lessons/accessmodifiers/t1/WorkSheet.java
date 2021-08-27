package com.aspire.lessons.accessmodifiers.t1;

import java.util.List;

public class WorkSheet {
	private List<String> worktodo;
	public String getString()
	{
		return "Worksheet getString";
	}
	protected String getProtectedValue()
	{
		return "Worksheet Protected Value";
	}
	 String getDefaultModiiferValue()
	{
		return "Worksheet DefaultModiifer Value";
	}
	private String getPrivateValue()
	{
		return "Worksheet Private Value";
	}
	
	public void creatingObjectOftheSameClass()
	{
		WorkSheet myworksheet=new WorkSheet();
		System.out.println("Object Created "+ myworksheet.hashCode());
		String result=myworksheet.getString();
		System.out.println(result);
		System.out.println(getProtectedValue());
		System.out.println(getDefaultModiiferValue());
		System.out.println(getPrivateValue());
	}
}
// A child within the same package
class WeekdayWS extends WorkSheet
{
	public void checkCreatingParentObject()
	{
		WorkSheet myworksheet=new WorkSheet();
		System.out.println("Object Created in subclass "+ myworksheet.hashCode());
		String result=myworksheet.getString();
		System.out.println(result);
		System.out.println(getProtectedValue());
		System.out.println(getDefaultModiiferValue());
		//System.out.println(getPrivateValue());
	}
}