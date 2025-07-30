package besicprograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int total=1;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        for(int i=0;i<num;i++) {
        	total=(num-i)*total;
        	
        	
        	
        }
        System.out.println(total);

	}

}
