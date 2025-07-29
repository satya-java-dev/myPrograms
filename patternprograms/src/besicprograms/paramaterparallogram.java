package besicprograms;

import java.util.Scanner;

public class paramaterparallogram {

	public static void main(String[] args) {
		// Perimeter = 2 × (base + side)
		
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        int perameter=2*(base+side);
        System.out.println(perameter);

	}

}
