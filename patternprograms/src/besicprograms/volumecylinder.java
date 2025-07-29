package besicprograms;

import java.util.Scanner;

public class volumecylinder {

	public static void main(String[] args) {
		//Volume = π × r² × h
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter radius: ");
        int r = scanner.nextInt();
        
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        
        double   volume=3.14*(r*r)*h;
        System.out.println(volume);

	}

}
