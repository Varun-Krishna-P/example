import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		int number, i = 0, num, digits;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the digit: ");
		try{
			number = input.nextInt();
			num = number;
			digits = 0;
			while(num > 0){
				//digits = num % 10;		
				num = num / 10;				
				i++;
			}
			System.out.println("The length of the given: "+number+ " is: "+i);			
		}
		catch(Exception exception){
			exception.printStackTrace();
			
		}
		finally{
			input.close();
		}
		
	}
}