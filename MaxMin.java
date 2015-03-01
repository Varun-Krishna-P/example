import java.io.*;
public class MaxMin
{
	public static void main(String  args[])
	{
		int a[] = new int[100];
		int Max = 0,Min = 0,n = 0;
		DataInputStream  din=new  DataInputStream(System.in);
		System.out.print("\n enter Number  of Data");
		 try
		{
			n = Integer.parseInt(din.readLine());
			System.out.println("\n enter the Data one by one ");
			for(int i = 0;i < n;i++)
			a[i] = Integer.parseInt(din.readLine());
		}
		catch(IOException  e)
		{
			System.out.println("io  error");
		}
		for(int i = 0;i < n;i++)
		{
			if(Max < a[i])Max=a[i];
			if(Min > a[i])Min=a[i];
		}
		System.out.println("\n Maximum = "+Max);
		System.out.println("\n Minimum = "+Min);
	}
}
