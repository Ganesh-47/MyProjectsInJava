package com.aspire.interfaceconcept;

public interface BankSBI {
	public void loan();

}
interface BankKVB extends ServiceProvider{
	public void loanINKVB();
}
abstract class ServiceProvider {

	public static void kVB() {
		// TODO Auto-generated method stub
		System.out.println("I am KVB");
		
	}

	public void sbi() {
		// TODO Auto-generated method stub
		System.out.println("I am SBI");
		
	}
 }
		
	