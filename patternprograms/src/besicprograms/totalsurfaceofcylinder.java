package besicprograms;

import java.util.Scanner;

public class totalsurfaceofcylinder {

	public static void main(String[] args) {
		// Total Surface Area = 2 × π × r × h + 2 × π × r²
       // = 2πr(h + r)
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter radius: ");
        int r = scanner.nextInt();
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        
        double s2=2*3.14*r*(h+r);
        System.out.println(s2);


	}

}
