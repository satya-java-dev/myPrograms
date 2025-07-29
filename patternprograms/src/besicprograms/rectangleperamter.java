package besicprograms;

import java.util.Scanner;

public class rectangleperamter {

	public static void main(String[] args) {
		// Perimeter = 2 × (length + width)
		
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter side: ");
        int width = scanner.nextInt();
        int perimeter=2*(length+width);
        System.out.println(perimeter);


	}

}
