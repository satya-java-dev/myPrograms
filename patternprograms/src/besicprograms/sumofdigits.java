package besicprograms;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		int total=0;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter number: ");
        int base = scanner.nextInt(); 
        for(int i=0;i<=base;i++) {
        	total=total+i;
        	
        }
        System.out.println(total);

	}

}
