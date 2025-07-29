package array;

import java.util.Arrays;

public class missingandrepitatinginarray {

	public static void main(String[] args) {
		int count=1;
		int max=0;
		int repetiveelement = 0;
		int a[]= {3, 1, 3,4,5,5,5};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>=a[i+1]) {
				int p=a[i+1];
				a[i+1]=a[i];
				a[i]=p;
			}
			
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			if((a[i]+1!=a[i+1])&& a[i]+1<a[i+1]) {
				System.out.println(a[i]+1);
				
			}else if(a[i]==a[i+1]) {
				count++;
				if(count>=max) {
					repetiveelement=a[i];
				}
				max=count;
				count=1;
			}
			
			
		}
		System.out.println(repetiveelement);

	}

}
