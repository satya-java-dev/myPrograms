package besicprograms;

import java.util.Scanner;

public class prismvlume {

	public static void main(String[] args) {
		//Volume = Base Area × Height
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter area: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter heights: ");
        int h = scanner.nextInt();
        int v=a*h;
        System.out.println(v);

	}

}
