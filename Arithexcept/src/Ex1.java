/*A Java Program to generate Arithmetic Exception*/
class Ex1
{
    public static void main(String args[])
    {
        try 
        {
        	int a = 30, b = 0;
            int c = a/b; 
            System.out.println ("Value of c:"+c);
        }
        catch(ArithmeticException e) 
        {
            System.out.println ("Cannot divide a number by 0");
        }
    }
}
