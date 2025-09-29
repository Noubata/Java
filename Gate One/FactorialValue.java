import java.util.Scanner;
	public class FactorialValue{
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an digit: ");
		int number = input.nextInt();
		int minus = 0;
		int sum = 1;
		while (number > 0){
		sum*=number;
		number --;
	
		}
		System.out.println(sum);

		}
	}