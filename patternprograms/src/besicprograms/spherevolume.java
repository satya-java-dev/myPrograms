package besicprograms;

import java.util.Scanner;

public class spherevolume {

	public static void main(String[] args) {
		//Volume = (4/3) × π × r³
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter radius: ");
        int r = scanner.nextInt();
        double g=(double)(4/3);
        double volume=g*3.14*(r*r*r);
        System.out.println(volume);

	}

}
