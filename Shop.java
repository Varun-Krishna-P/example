import java.util.*;
import java.io.*;
class Shop
{
	public static void main(String args[])
	{
		Vector shopname = new Vector();
		Enumeration en;
		DataInputStream din = new DataInputStream(System.in);
		int n=args.length,opt=0,pos=0;
		String name;
		try{
			for(int i = 0;i < n;i++)
			{
				shopname.addElement(args[i]);
				exit1: while(true)
				{
					System.out.println("\n MAIN MENU");
					System.out.println("\n____________");
					System.out.println("\n 1.Add");
					System.out.println("\n 2.Delete");
					System.out.println("\n 3.print");
					System.out.println("\n 4.Delete All");
					System.out.println("\n 5.Add at End");
					System.out.println("\n 6.Exit");
					System.out.println("\n Select a Option<1,2,....,6>...");
					opt = Integer.parseInt(din.readLine());
					switch(opt)
					{
						case 1: 
							System.out.println("\n Enter the shop name");
							name = din.readLine();
							System.out.println("\n Enter the position to insert");
							pos = Integer.parseInt(din.readLine());
							shopname.insertElementAt(name,pos-1);
						break;
						case 2: 
							System.out.println("\n Enter the shop name to delete");
							name = din.readLine();
							if(shopname.removeElement(name)){
								System.out.println("\n The shop name succesfully deleted");
							}
							else{
								System.out.println("\n The shop name is not present");
							} 
						break;
						case 3: 
							System.out.println("\n The list of name in the vector");
							en=shopname.elements();
							while(en.hasMoreElements())
							System.out.println(en.nextElement());
						break;
						case 4: 
							shopname.removeAllElements();
						break;
						case 5: 
							System.out.println("\n Enter the shop name");
							name=din.readLine();
							shopname.addElement(name);
						break;
						case 6:
							System.out.println("\n Exit from the program");
						break exit1;
						default: 
							System.out.println("\n Enter values");
						break;
					}
				}
			}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
