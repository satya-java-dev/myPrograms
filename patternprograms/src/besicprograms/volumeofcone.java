package besicprograms;

import java.util.Scanner;

public class volumeofcone {

	public static void main(String[] args) {
		//Volume = (1/3) × π × r² × h
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter radius: ");
        int r = scanner.nextInt();
        
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        
        float k=(float)(1/3);
        double volume=h*3.14*(r*r)*h;
        System.out.println(volume);
        

	}

}
