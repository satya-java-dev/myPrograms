package besicprograms;

import java.util.Scanner;

public class peramaterofcircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();
       // Perimeter (Circumference) = 2 × π × radius
        System.out.println(2*radius*3.1415);


	}

}
