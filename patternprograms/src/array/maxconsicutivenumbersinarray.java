package array;

public class maxconsicutivenumbersinarray {

	public static void main(String[] args) {
		int a[]= {1, 1, 0, 0, 0, 1, 1,1,1,1
				};
		int maxcount=0;
		int count=1;
		int f=Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				count++;
				if(count>maxcount) {
					maxcount=count;
				}
			}else if(a[i]!=a[i-1]) {
				
				count=1;
			}
			
			
			
		}
		System.out.println(maxcount);

	}

}
