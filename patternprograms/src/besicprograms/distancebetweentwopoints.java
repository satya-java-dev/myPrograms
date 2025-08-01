package besicprograms;

import java.util.Scanner;

public class distancebetweentwopoints {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        double p=x2-x1;
        double q=y2-y1;
        double u=(p*p)+(q*q);
        double distance=Math.sqrt(u);
        System.out.println(distance);

	}
	

}
