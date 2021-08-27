package co.aspire.nnerclass;

public class WallTester {
	public static void testInnerClassWall()
	{
	Wall leftsidewall = new Wall();

	// Wall.Window firstWindow = new Wall.Window();
	Wall.Window firstWindow = leftsidewall.new Window();
	leftsidewall.windows[0]=firstWindow;
	Wall.Door woodendoor = leftsidewall.new Door();
	leftsidewall.door=woodendoor;
	System.out.println(firstWindow.tellmeWhoAreYou());
	System.out.println(woodendoor.tellmeWhoAreYou());
	}
	}

}
