public class Kata1{


	

	public static boolean isLeapYear(int years){

	if (years % 4 == 0 && years % 100 !=0){
	return true;
	}if (years % 4 == 0 && years % 100 == 0 && years % 400 == 0){
	return true;
	}else{
	return false;
	}
	}

	public static void printStars(int numberOfRows){
	
	
	for(int n = 1; n <= numberOfRows;n++){
		for(int m = 1;m<=n;m++){
		System.out.print("*");
		}
		System.out.println();
		}
		
	}
	public static double celciusOf(double fahrerheit){
	
	double number = 5*(fahrerheit-32)/9;
	return number;
	}
}