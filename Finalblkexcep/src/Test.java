/*A Java Program with finally block*/
class Test
{  
	public static void main(String args[])
	{  
		try
		{  
			int a=15/5;  
			System.out.println(a);  
		}  
		catch(NullPointerException e)
		{
			System.out.println(e);
		}  
		finally
		{
			System.out.println("Finally block is always executed");
		}  
		System.out.println("rest of the code...");  
	}  
}  