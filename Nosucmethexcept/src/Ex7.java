/*A Java Program to generate NoSuchMethod Exception*/
import java.lang.reflect.Method;
public class Ex7 
{
	public Ex7()
	  {
	    Class a;
	    try
	    {
	    	a = Class.forName("java.lang.String");
	    	try
	    	{
	    		Class[] p = new Class[5];
	    		Method m = a.getDeclaredMethod("method", p);
	    	}
	    	catch (SecurityException e)
	    	{
	    		e.printStackTrace();
	    	}
	    	catch (NoSuchMethodException e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    catch (ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	  }
	public static void main(String[] args)
	{
		new Ex7();
	}
}