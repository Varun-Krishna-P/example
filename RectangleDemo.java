import java.io.*;
public class RectangleDemo
{	
	public static void main(String[] args) {
		double length,width,area;
		String colour;
		public void get_length()
		{	
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("\n Enter the length of the Rectangle:");
			try{
				length=Double.parseDouble(din.readLine());
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
		public void get_width()
		{
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("\n Enter the width of theRectangle:");
			try{
				width = Double.parseDouble(din.readLine());
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
		public void get_colour()
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
}
