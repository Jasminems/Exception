/*A Java Program to generate NoSuchField Exception*/
import java.lang.reflect.*;  
class Ex6 
{
	public static void main(String[] args) 
	{
		Ex6 ob = new Ex6();  
	    Class clas1 = ob.getClass();  
	    System.out.println("Field got:");  
	    try 
	    {  
	    	Field f = clas1.getField("str");  
	        System.out.println("Field found: " + f.toString());  
	    }
	    catch(NoSuchFieldException e) 
	    {  
	         System.out.println(e.toString());  
	    }  
	 }  
	public Ex6() 
	{        
	}  
	public Ex6(String str) 
	{         
		this.str = str;  
	}  
	public String str = "Java Exception"; 

}