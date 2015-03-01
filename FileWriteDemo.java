import java.io.*;
class FileWriteDemo
{	
	public static void main(String srgs[])throws Exception
	{
		int len,size;
		String s;
		FileOutputStream fout = new  FileOutputStream("Sample.txt");
		BufferedReader din = new  BufferedReader(new InputStreamReader(System.in));
		byte myarr[] = new byte[1024];
		System.out.println("Enter the contents of the sample.txt  file. Type * to end");
		while(true)
		{
			s = din.readLine();
			if(s.equals("*"))break;
			myarr = s.getBytes();
			fout.write(myarr);
			fout.write('\n');
		}
		fout.close();
		System.out.println("The file is created");
	}
}  
