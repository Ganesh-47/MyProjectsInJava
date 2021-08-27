package lessons.accessmodifiers.t1;

public class WorksheetTest {
	public static void testWorksheetPublicAccessModifier()
	{
		WorkSheet todolist=new WorkSheet();
		//todolist.creatingObjectOftheSameClass();
		System.out.println(todolist.getProtectedValue());
		System.out.println(todolist.getDefaultModiiferValue());
		//System.out.println(todolist.getPrivateValue());
	}
	public static void testWeekdayWSPublicAccessModifier()
	{
		WeekdayWS todolist=new WeekdayWS();
		todolist.checkCreatingParentObject();
		
	}
}
