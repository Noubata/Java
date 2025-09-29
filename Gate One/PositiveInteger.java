import java.util.Scanner;
	public class PositiveInteger{
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int number = input.nextInt();

	if(number <= 0){
		System.out.print("Enter a positive number");
	else if(number == 2 || number == 3 || number == 5 || number == 7 || number == 11 || number == 13){
		System.out.printf("%d is a prime number", number);
	}else if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 11 == 0 || number % 13 == 0){
		System.out.printf("%d is not a prime number", number);
	}else{
		System.out.printf("%d is a prime number", number);
	}
	
		}
	}