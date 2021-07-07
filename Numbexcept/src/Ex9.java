/*A Java Program to generate NumberFormat Exception*/
class Ex9 
{
	public static void main(String[] args) 
	{
        try 
        {
            int n = Integer.parseInt ("Hi") ;
            System.out.println(n);
        } 
        catch(NumberFormatException e) 
        {
            System.out.println("Number format exception");
        }
	}
}
