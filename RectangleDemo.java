import java.io.*;
class Rect{
	double length,width,area;
	String colour;
	public void getLength()
	{	
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("\n Enter the length of the Rectangle:");
		try{
			length = Double.parseDouble(din.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
		
	public void getWidth()
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("\n Enter the width of theRectangle:");
		try{
			width = Double.parseDouble(din.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
		
	public void getColour()
	{
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("\n Enter the colour of the Rectangle:");
		try{
			colour = din.readLine();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
public class RectangleDemo
{	
	public static void main(String[] args) {
		Rect rect = new Rect();
		rect.getLength();
		rect.getWidth();
		rect.getColour();
		
	}
}
