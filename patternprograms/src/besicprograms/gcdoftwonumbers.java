package besicprograms;

import java.util.Scanner;

public class gcdoftwonumbers {

	public static void main(String[] args) {
		int k;
		int j=0;
		int largestelement = 0;
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int first = scanner.nextInt(); 
        
        
        System.out.print("Enter  second number: ");
        int second = scanner.nextInt(); 
        if(first>=second) {
        	k=second;
        	
        }else {
        	k=first;
        	
        }
        for(int i=1;i<=k;i++) {
        	if((first%i)==0&&(second%i)==0) {
        		if(i>j) {
        			largestelement=i;
        			
        			
        		}else {
        			largestelement=j;
        		}
        		j=i;
        		
        	}
        }
        System.out.println(largestelement);

	}

}
