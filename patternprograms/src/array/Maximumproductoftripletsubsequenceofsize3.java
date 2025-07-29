package array;

public class Maximumproductoftripletsubsequenceofsize3 {

	public static void main(String[] args) {
	   int[]a= {10, 3, 5, 6, 20};
	   int j = 0;
	   int total=1;
	   int grandtotal=Integer.MIN_VALUE;
	   for(int i=0;i<a.length;i++) {
		   for( j=i+1;j<a.length;j++) {
			   for(int k=j+1;k<a.length;k++) {
				   total=a[i]*a[j]*a[k];
			   }
			   if(total>grandtotal) {
				   grandtotal=total;
			   }
			   
		   }
	   }
	   System.out.println(grandtotal);

	}

}
