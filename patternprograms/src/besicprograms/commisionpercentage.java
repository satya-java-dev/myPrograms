package besicprograms;

import java.util.Scanner;

public class commisionpercentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter commisionAmount: ");
        int commision = scanner.nextInt();
        
        System.out.print("Enter totalsales: ");
        int sales = scanner.nextInt();
        
        double h=(double)(commision/sales);
        double total=h*100;
        System.out.println(total);

	}

}
