/*A Java Program to generate ArrayIndexOutOfBounds Exception*/
class Ex2 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e)
		{
            System.out.println ("Array Index is Out Of Bounds");
        }
	}
}
