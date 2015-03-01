import java.io.*;
import java.util.*;
public class StringDemo
{
	public  static  void main (String  args[])
	{
		String name ="java  programming";
		int count = 0;
		System.out.println("The given name is"+name);
		System.out.println("The  length  of name is"+name.length());
		if(name.indexOf('a') < 0)
		System.out.println("The  character 'a' is not present in my name");
		else
		{
			System.out.println("The character 'a' is  present in the locations");
			int loc = 0;
			while(loc < name.lastIndexOf ('a') )
			{
				int x = name.indexOf('a',loc);
				System.out.println(x);
				loc = x + 1;
				count++;
			}
			System.out.println("the character 'a' is present " +count+"times");
		}
	}
}  
