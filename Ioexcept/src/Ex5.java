/*A Java Program to generate IO Exception*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Ex5 
{
	public FileInputStream test()
	{
		File fp = new File("q.txt");
        FileInputStream fi = null;
        try
        {
        	fi = new FileInputStream(fp);
            fi.read();
        }
        catch (IOException e)
        {         
            e.printStackTrace();
        }
        finally
        {
            try
            {
            	if (fi!= null)
            	{
            		fi.close();
                }
            }
            catch (IOException e)
            {
            	e.printStackTrace();
            }
        }
        return fi;
   }
   public static void main(String[] args)
   {
	   Ex5 ob = new Ex5();
       ob.test();
    }
}