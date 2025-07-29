package besicprograms;

import java.util.Scanner;

public class curvedsurfacereaofcube {

	public static void main(String[] args) {
		// LSA = 4 × side²
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter side: ");
        int s = scanner.nextInt();
        System.out.println(4*(s*s));


	}

}
