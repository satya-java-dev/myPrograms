package besicprograms;

import java.util.Scanner;

public class squareperimter {

	public static void main(String[] args) {
		// Perimeter = 4 × side
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        int perimeter=4*side;
        System.out.println(perimeter);


	}

}
