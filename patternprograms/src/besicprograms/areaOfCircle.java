package besicprograms;

import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		int areaofcircle;
		  Scanner scanner = new Scanner(System.in); 

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt(); 
	        areaofcircle=(int) (3.1416*(number*number));
	        System.out.println(areaofcircle);

	}

}
