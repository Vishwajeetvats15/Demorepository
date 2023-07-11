package singleton;

public class Singleobject
{
     private static Singleobject instance = new Singleobject();
     
     private Singleobject()
     {
     }
     public static Singleobject getinstance()
     {
    	 return instance;
     }
	public void showmessage()
	{
		System.out.println("Edubridge india pvt ltd.");
	}
     
}