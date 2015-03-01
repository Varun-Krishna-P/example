import  java.io.*;
interface IoOperations
{
	void read();
	void print();
} 
interface Measurements
{
	void volume();
	void surfacearea();
}
class Cylinder implements IoOperations, Measurements
{
	double radius;
	double height;
	double volume;
	double tsurfacearea;
	public Cylinder()
	{
		radius = 0;
		height = 0;
		volume = 0;
		tsurfacearea = 0;
	}
	public void read() {
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("\n enter the radius and height");
		try {
			radius = Double.parseDouble(din.readLine());
			height = Double.parseDouble(din.readLine());
		} 
		catch(IOException e)
		{
			System.out.println(e);
		}
		volume();
		surfacearea();
	}
	public void print()
	{
		System.out.println("\n radius:"+radius);
		System.out.println("\n height:"+height);
		System.out.println("\n volume:"+volume);
		System.out.println("\n total surfacearea:"+tsurfacearea);		
	}
	public void volume()
	{
		volume=3.14*Math.pow(radius,2)*height;
	}
	public void surfacearea()
	{
		tsurfacearea=2.0*3.14*radius*(radius+height);
	}
}
class RightCircularCone implements IoOperations,Measurements
{
	double radius;
	double height;
	double slantheight;
	double volume;
	double tsurfacearea;
	public RightCircularCone()
	{
		radius = 0;
		height = 0;
		slantheight = 0;
		volume = 0;
		tsurfacearea = 0;
	}
	public void read()
	{
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("\n enter the radius and height");
		try
		{
			radius = Double.parseDouble(din.readLine());
			height = Double.parseDouble(din.readLine());
			slantheight = Math.sqrt(radius*radius+height*height);
		} 
		catch(IOException e)
		{
			System.out.println(e);
		}
		volume();
		surfacearea();
	}
	public void print()
	{
		System.out.println("\n radius:"+radius);
		System.out.println("\n height:"+height);
		System.out.println("\n volume:"+volume);
		System.out.println("\n totalsurfaceArea:"+tsurfacearea);
	}
	public void volume()
	{
		volume =(1./3)*3.14*Math.pow(radius,2)*height;
	}
	public void surfacearea()
	{
		tsurfacearea=3.14*radius*(radius+slantheight);
	}
}
public class ThreeDshape
{
	public static void main(String arg[])
	{ 
		Cylinder C1 = new Cylinder();
		RightCircularCone rcc1=new RightCircularCone();
		System.out.println("\n Enter Cyliner Information radius and height");
		C1.read();
		System.out.println("\n Enter RightCircularCone Information radius and height");
		rcc1.read();
		System.out.println("\n Cylinear Information");
		System.out.println("---------------------");
		C1.print();
		System.out.println("\n Right Circular Cone Information");
		System.out.println("----------------------------");
		rcc1.print();
	}
}
