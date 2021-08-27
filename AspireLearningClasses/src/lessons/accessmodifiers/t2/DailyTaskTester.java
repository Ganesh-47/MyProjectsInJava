package lessons.accessmodifiers.t2;

import lessons.accessmodifiers.t1.WorkSheet;
// A child in a different Package 
class DailyTask extends WorkSheet {
	public void checkCreatingParentObject()
	{
		WorkSheet myworksheet=new WorkSheet();
		System.out.println("Object Created in subclass "+ myworksheet.hashCode());
		String result=myworksheet.getString();
		System.out.println(result);
		System.out.println(getProtectedValue());
		//System.out.println(getDefaultModiiferValue());
		//System.out.println(getPrivateValue());
	}
}
// World - A class from a different package
public class DailyTaskTester // Not a Child
{
	public static void testPublicAccessModifier()
	{
		DailyTask dailytodolist=new DailyTask();
		dailytodolist.checkCreatingParentObject(); 
		
		
		// System.out.println(getProtectedValue());
		// System.out.println(getDefaultModiiferValue());
		// System.out.println(getPrivateValue());
	}
}