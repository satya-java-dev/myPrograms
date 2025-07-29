package besicprograms;

import java.util.Scanner;

public class prismvolum {

	public static void main(String[] args) {
		// Volume = Base Area × Height
			
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter area: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        int volume=a*h;
        System.out.println(volume);

	}

}
