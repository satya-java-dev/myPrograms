package besicprograms;

import java.util.Scanner;

public class areaofparalloagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter length: ");
        int length = scanner.nextInt(); 
        //Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter bredth: ");
        int base = scanner.nextInt(); 
        int area=length*base;
        System.out.println(area);
	}

	}


