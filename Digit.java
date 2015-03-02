import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		int number, i = 0, num, digits;
		int[] digit;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the digit: ");
		try{
			number = input.nextInt();
			num = number;
			digits = 0;
			while(num > 0){
				digits = num % 10;
				digit = new int[num];
				digit = new int[]{digits};			
				num = num / 10;				
				i++;
				System.out.print("The Digits are: "+digits+" ,");
			}
			System.out.println("The length of the given "+number+ " is: "+i);
			//System.out.println("The Digits are: "+digit+" ,");
			
		}
		catch(Exception exception){
			exception.printStackTrace();
			
		}
		finally{
			input.close();
		}
		
	}
}