package besicprograms;

import java.util.Scanner;

public class areaofequilateraltraingle {

	public static void main(String[] args) {
		
    	Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        double area=((Math.sqrt(3))/4)*side*side;
        System.out.println(area);

	}

}
