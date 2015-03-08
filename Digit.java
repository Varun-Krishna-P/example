import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		int number, i = 0, num, digits;
		String digit;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the digit: ");
		try{
			number = input.nextInt();
			num = number;
			digits = 0;
			while(num > 0){
				digits = num % 10;
				digit = Integer.toString(num);
				StringBuilder digitString = new StringBuilder();
				num = num / 10;				
				i++;
				for(int j = 0; j < digit.toString().length(); j++)
				{
					if(digitString.toString().isEmpty()){
						digitString.append(digit);
						//System.out.println("Digits are: "+digitString);
						
					}
					//digitString.append(digit);			
					System.out.println("The digits are: "+digitString.charAt(j));
					
				}
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