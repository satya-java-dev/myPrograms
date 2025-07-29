package besicprograms;

import java.util.Scanner;

public class equilateraltraingleparameter {

	public static void main(String[] args) {
		//Perimeter = 3 × side
		
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        int para=3*side;
        System.out.println(para);


	}

}
