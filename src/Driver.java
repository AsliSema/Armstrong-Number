import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter a Number: ");
		
		int number = scanner.nextInt();
		int tempNumber = number;
		int numberOfDigits = 0;
		int numberValue =0;
		int numberPow;
		int result = 0;
		
		//Find number of digits
		while(tempNumber != 0) {
			tempNumber/=10;
			numberOfDigits++;
		}
		
		//Find sum of the number of digits powers of the digits
		tempNumber = number;
		while(tempNumber != 0) {
			numberValue = tempNumber%10;
			numberPow = 1;
			for(int i=1; i<=numberOfDigits; i++) {
				numberPow *= numberValue;
			}
			result += numberPow;
			tempNumber /=10;
		}
		
		if(result == number) {
			System.out.println(number + " is an Armstrong Number.");
		}else {
			System.out.println(number + " is not an Armstrong Number!");
		}
	}
}
