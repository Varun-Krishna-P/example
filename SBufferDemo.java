import java.util.*;
import java.io.*;
public class SBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer s1=new StringBuffer();
		s1.append("Morning");
		System.out.println("The appended string in the empty string buffer is:"+s1);
		int l = s1.length();
		System.out.println("The length of string buffer is:"+1);
		int c = s1.capacity();
		System.out.println("The capacity of string buffer is:"+c);
		s1.insert(0,"Good");
		System.out.println("The string in the string buffer after inserting a new string at begining is:"+s1);
		s1.reverse();
		System.out.println("The value of string in the string buffer after reversing is:"+s1);
	}
}
