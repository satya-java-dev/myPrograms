package array;

public class thirdlaregstelement {

	public static void main(String[] args) {
		int a[]= {5, 5, 4, 3, 2};
		int secondlargest=Integer.MIN_VALUE;
		int largest=Integer.MIN_VALUE;
		int thirdlargestelement=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				thirdlargestelement=secondlargest;
				secondlargest=largest;
				largest=a[i];
			}
			else if(secondlargest<a[i] && a[i] != largest) {
			
				
				
				
				secondlargest=a[i];
				
			}else if(a[i]>thirdlargestelement&& a[i] != secondlargest && a[i] != largest) {
				thirdlargestelement=a[i];
			}  
		}
		System.out.println(thirdlargestelement);
		System.out.println(secondlargest);

	}


	}


