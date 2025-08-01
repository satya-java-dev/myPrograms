package besicprograms;

import java.util.Scanner;

public class battingAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter totalruns: ");
        int runs = scanner.nextInt();
        
        System.out.print("Enter outs: ");
        int outs = scanner.nextInt();
        double avg=(double)(runs/outs);
        System.out.println(avg);

	}

}
