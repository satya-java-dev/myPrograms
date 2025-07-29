package besicprograms;

import java.util.Scanner;

public class areaofrhombus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter base: ");
        int base = scanner.nextInt(); 
        //Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter height: ");
        int height = scanner.nextInt(); 
        
        float p=(float)1/2;
        float areaofrhombus=p*base*height;
        System.out.println(areaofrhombus);

	}

}
