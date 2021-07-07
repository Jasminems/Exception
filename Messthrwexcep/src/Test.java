/*A Java Program to throw exception with own message*/
class Test 
{
	public static void main(String[] args) 
	{
		try
		{
		    throw new Exception("Hello World");
		}
		catch(Exception e)
		{
		    System.out.println(e.getMessage());
		}
	}
}
