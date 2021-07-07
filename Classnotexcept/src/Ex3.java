/*A Java Program to generate ClassNotFound Exception*/
class Ex3 
{
	public static void main(String[] args) 
	{
        try 
        {
            Class.forName("Java Exception");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
	}
}
