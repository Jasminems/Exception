/*A Java Program to generate FileNotFound Exception*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class Ex4 
{
	public static void main(String[] args) 
	{
		try
		{
			File fp = new File("C:\\q.txt");
			FileReader f = new FileReader(fp);
	    } 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
	    }
	}
}
