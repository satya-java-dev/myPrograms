package array;

public class armstrong {
	public static void main(String[] args) {
		int n=123;
		int l=n;
		int count=0;
		int total=1;
		 int totalelement = 1;
		Boolean k = true;
		int armstrong=0;
		int p;
		while(true) {
			p=l/10;
			l=p;
			
			if((p%10)==0) {
				count++;
				break;
				
				
			}
			count++;
			
		}
		total=0;
			 
			 for(int o=1;o<=count;o++) {
				 int j=n%10;
				 for(int h=1;h<=count;h++) {
					 totalelement=j*totalelement;
					 
					 
				 }
				  armstrong=armstrong+totalelement;
				  totalelement=0;
				 n=n/10;
				 
				 
			
		}
			 System.out.println(armstrong);
			
			
		
		
	}

}
