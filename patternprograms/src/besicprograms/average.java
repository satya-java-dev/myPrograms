package besicprograms;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		int total=0;
		int count=0;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++) {
        	total=i+total;
        	count++;
        	
        	
        }
        double k=(double)total/count;
        System.out.println(k);

	}

}
