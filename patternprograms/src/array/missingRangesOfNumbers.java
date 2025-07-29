package array;

public class missingRangesOfNumbers {

	public static void main(String[] args) {
		int a[]= {14, 15, 20, 30, 31, 45};
		int min=10;
		int max=50;
		int i=0;
		if(min+1!=a[i]) {
			System.out.print("("+(min));
			System.out.print(",");
			System.out.print((a[i]-1)+")");
			
			
			
		}
		min=a[i];
		
		for( i=1;i<a.length;i++) {
			if((min+1)!=a[i]) {
				System.out.print("("+(min+1));
				System.out.print(",");
				System.out.print((a[i]-1)+")");
			}
			min=a[i];
		}
		if(((a[a.length-1]))!=max) {
			System.out.print("("+(a[a.length-1]+1));
			System.out.print(",");
			System.out.print((max)+")");
		}
		//[[10, 13], [16, 19], [21, 29], [32, 44], [46, 50]]
		

	}

}
