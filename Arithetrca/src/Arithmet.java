/*A Java Program to handle Arithmetic Exception using try-catch block*/
import java.io.*;
public class Arithmet 
{
	public static void main(String[] args) 
	{
		try 
		{
            int a = 30, b = 0;
            int c = a/b;
            System.out.println("Value:"+c);
        }
        catch(ArithmeticException e) 
		{
        	System.out.println ("Cannot divide a number by 0");
		}
	}
}
