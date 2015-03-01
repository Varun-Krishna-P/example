import java.io.*;
class compareTwoNumbers
{
	public static void main(String args[])
	{
		int  n=0,m=0;
		DataInputStream  din=new  DataInputStream(System.in);
		System.out.println("\n enter two numbers one by  one");
		try
		{
			n=Integer.parseInt(din.readLine());
			m=Integer.parseInt(din.readLine());
		}
		catch(IOException e)
		{
			System.out.println("io error");
		}
		if(n > m)System.out.println("\n the  given number "+n+" is  large");
		else if (m > n)System.out.println("\n the given  number "+m+" is  large");
		else System.out.println("\n these numbers are equal");
	}
}
