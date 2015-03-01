import java.util.*;
public class Student
{
	int Regno;
	String Name;
	int  Mark[];
	int Total;
	public Student(int r,String s1,int m[])
	{
		Regno = r;
		Name = s1;
		Mark = new int[4];
		for(int i=0;i<4;i++)
		Mark[i] = m[i];
		for(int i = 0;i < 4;i++)
		if(Mark[i]> 50)
		Total += Mark[i];
		else
		{
		Total = 0;
		break;
		}
	}
	public void display()
	{
		System.out.println("\n Regno:"+Regno);
		System.out.println("\n Name:"+Name);
		System.out.println("\n Marks:\t");
		for(int i = 0;i < 4;i++)
		System.out.print(+Mark[i]+"\t");
		System.out.println("\nTotal:"+Total);
	}
	public static void main(String arg[])
	{
		int s1Mark[]={56,78,55,78};
		int s2Mark[]={36,48,65,58};
		int s3Mark[]={66,98,65,93};
		int s4Mark[]={45,98,76,37};


		int s5Mark[]={98,93,86,82};
		Student s1 = new Student(1,"ARUN",s1Mark);
		Student s2 = new Student(2,"REEGAN",s2Mark);
		Student s3 = new Student(3,"THITTA",s3Mark);
		Student s4 = new Student(4,"MANI",s4Mark);
		Student s5 = new Student(5,"NAGA",s5Mark);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}
}
