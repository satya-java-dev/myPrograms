package besicprograms;

import java.util.Scanner;

public class calculateCgpa {

	public static void main(String[] args) {
		int count=0;
        int total=0;
		
         
         Scanner scanner = new Scanner(System.in); 
       

         System.out.print("Enter no of subs: ");
         int subs = scanner.nextInt();
         if(subs>0) {
        	 System.out.println("enter valid subs");
        	 for(int i=0;i<subs;i++) {
            	 count++;
            	 
            	 System.out.print("Enter  sub "+i+"-");
                 int sub  = scanner.nextInt();
                 total=total+sub;
            	 
             }
             System.out.println(total/count);
        	 
         }else {
        	 System.out.println("enter valid no of subs");
         }
         
       

	}

}
