package besicprograms;

import java.util.Scanner;

public class leapornot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int year = scanner.nextInt(); 
        if((year%4)==0&&(year%100)!=0) {
        	System.out.println("leap");
        }else if((year%400)==0 && (year%100)!=0) {
        	System.out.println("leap");
        	
        }else {
        	System.out.println("not");
        }

	}

}
