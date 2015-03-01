import  java.io.*;
class  MyException extends Exception
{
	MyException(int  value)
	{
		System.out.println("value greater then 99 exception occured Result: "+value);
	} 
}
public class Demo1
{
	static void compute (int a,int b)throws  MyException
	{
		int c;
		c = a + b;
		if(c > 99) {
			throw new MyException(c);
		}
		else{
			System.out.println("Result is: "+c);
		}		
	}

	public static void main(String args[])throws Exception
	{ 
		int x,y;
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("enter the value for x");
		x = Integer.parseInt(din.readLine());
		System.out.println("Enter  the value for Y");
		y = Integer.parseInt(din.readLine());
		try{
			compute (x,y);
		}
		catch(MyException  e)
		{ 
			System.out.print(e);
		} 
	}
 }
