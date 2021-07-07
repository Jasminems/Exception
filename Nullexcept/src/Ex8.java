/*A Java Program to generate NullPointer Exception*/
public class Ex8 
{
	public static void main(String[] args) 
	{
        try 
        {
        	String s = null;
            System.out.println(s.charAt(0));
        } 
        catch(NullPointerException e) 
        {
            System.out.println("NullPointerException");
        }
     }
}
