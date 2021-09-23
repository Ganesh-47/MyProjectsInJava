package com.aspire.constructors;

public class BaseObject {
	public BaseObject() {
		System.out.println("Base object created");
		//non final
		init();
		//final
		load();
	}
	public void init() {
		System.out.println("non final method");
	}
	public final void load() {
		System.out.println("final method");
	}

}
class UtilityHelper extends BaseObject{
	public UtilityHelper() {
		//System.out.println("Child object created");
		System.out.println("UtilityHelper");
	}
	public void init() {
		System.out.println("UtilityHelper Init");
	}
}
