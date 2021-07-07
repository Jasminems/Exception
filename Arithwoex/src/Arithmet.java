/*A Java Program to generate Arithmetic Exception without Exception Handling*/
import java.io.*;
public class Arithmet 
{
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Division");
		System.out.println("Value:"+c);
	}
public static void main(String[] args) 
{
	Arithmet e=new Arithmet();
	e.div(10,0);
}
}
