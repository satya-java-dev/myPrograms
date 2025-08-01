package besicprograms;

import java.util.Scanner;

public class calculatepower {

	public static void main(String[] args) {
		double total=1;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        for(int i=1;i<=power;i++) {
        	total=total*base;
        	
        	
        }
        System.out.println(total);

	}

}
