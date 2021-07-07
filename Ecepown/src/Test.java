/*A Java Program to create own exception*/
class InvalidAgeException extends Exception
{  
	InvalidAgeException(String s)
	{  
		super(s);  
	}  
}  
class Test
{  
	static void val(int age)throws InvalidAgeException
	{  
		if(age<18)  
			throw new InvalidAgeException("Not valid");  
		else  
			System.out.println("Welcome to Vote");  
	}  
	public static void main(String args[])
	{  
		try
		{  
			val(13);  
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}  
		System.out.println("rest of the code...");  
	}  
}  