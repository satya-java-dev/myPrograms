package besicprograms;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		int total=0;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter number: ");
        int num = scanner.nextInt(); 
        for(int i=1;i<num;i++) {
        	if((num%i)==0) {
        		total=total+i;
        		
        		
        	}
        }if(total==num) {
        	System.out.println("perfect");
        }else {
        	System.out.println("not");
        }

	}

}
