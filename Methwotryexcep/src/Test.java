/*A Java Program to method throws exception.*/
import java.io.*;
class Test
{  
	void m()throws IOException
	{  
		throw new IOException("Device Error");  
	}  
	public static void main(String args[])throws IOException
	{  
		Test m1=new Test();  
		m1.m();  			//calling the method without try block
		System.out.println("Normal Flow...");  
	}  
}