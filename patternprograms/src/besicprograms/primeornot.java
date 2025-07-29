package besicprograms;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		int count=0;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter number: ");
        int base = scanner.nextInt(); 
        for(int i=1;i<=base;i++) {
        	if((base%i)==0) {
        		count++;
        	}
        }
        if(count==2) {
        	System.out.println("prime");
        }else {
        	System.out.println("not prime");
        }

	}

}
