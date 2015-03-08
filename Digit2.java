import java.util.Scanner;
public class Digit2 {
	public static void main(String[] args) {
		int number, i = 0, num, digits;
		String digit;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the digit: ");
		try{
			number = input.nextInt();
			num = number;
			digits = 0;
			digits = num % 10;
			digit = Integer.toString(num);
			StringBuilder digitString = new StringBuilder();
			for (int j = 0; j< digit.length(); j++){
				char numChar = digit.charAt(j);
				if(!digitString.toString().isEmpty()){
					digitString.append(", ");
				}
				System.out.println("The digits are: "+numChar);	
				digitString.append(numChar);				
			}				
			System.out.println("The length of the given "+number+ " is: "+digit.length());
			System.out.println("The string Builder value is: "+digitString);
			
		}
		catch(Exception exception){
			exception.printStackTrace();
			
		}
		finally{
			input.close();
		}
		
	}
}