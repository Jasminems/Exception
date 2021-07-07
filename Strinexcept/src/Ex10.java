/*A Java Program to generate StringIndexOutOfBounds Exception*/
class Ex10 
{
	public static void main(String[] args) 
	{
        try 
        {
        	String s = "This is Java Program ";
            char c = s.charAt(21);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
	}
}
