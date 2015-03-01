import  java.io.*;
class  ArmstrongNumber
{
	public static void main(String args[])
	{
		int  a,r,t=0;
		r = 0;
		System.out.println("\n The List of Three Armstrong Numbers Digits ");
		for(int i = 100;i < 1000;i++)
		{
			r = i;
			t = 0;
			while(r > 0)
			{
				t+=Math.pow (r % 10,3);
				r = r / 10;
			}
			if(i==t)System.out.print(" "+t);
		}
	}
}
