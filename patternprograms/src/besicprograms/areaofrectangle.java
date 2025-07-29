package besicprograms;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter length: ");
        int length = scanner.nextInt(); 
        //Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter bredth: ");
        int bredth = scanner.nextInt(); 
        int area=length*bredth;
        System.out.println(area);
	}

}
