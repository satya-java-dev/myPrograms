package besicprograms;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        System.out.print("Enterdiscount: ");
        int discount = scanner.nextInt();
        if(price<=0&&discount<0) {
        	System.out.println("enetr valid details");
        }
        int k=price*discount;
        double total=(double)(k/100);
        double finalprice=price-total;
        System.out.println(finalprice);

	}

}
