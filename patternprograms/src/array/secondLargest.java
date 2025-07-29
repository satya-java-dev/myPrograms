package array;

public class secondLargest {

	public static void main(String[] args) {
		int a[]= {5,5,3};
	
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE; 
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				
				secondlargest=largest;
				largest=a[i];
				
				
			}else if(a[i]>secondlargest && a[i] != largest) {
				secondlargest=a[i];
				
			}
		
}
		if(secondlargest==Integer.MIN_VALUE) {
			System.out.println("no value");
		}else {
			System.out.println(secondlargest);
		}
	}
	
}
