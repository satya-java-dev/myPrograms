package array;

import java.util.Arrays;

public class missingandrepitatinginarray {

	public static void main(String[] args) {
		int count=1;
		int max=0;
		int a[]= {3, 1, 3,4,4,4};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>=a[i+1]) {
				int p=a[i+1];
				a[i+1]=a[i];
				a[i]=p;
			}
			
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			
			
		}

	}

}
