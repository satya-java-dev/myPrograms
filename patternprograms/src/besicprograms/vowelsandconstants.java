package besicprograms;

import java.util.Scanner;

public class vowelsandconstants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter char: ");
        char ch = (char) scanner.next().charAt(0); 
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
        	System.out.println("vowl");
        	
        }else {
        	System.out.println("constant");
        }

	}

}
