package patternprograms;

public class numbertrianglepattern {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n/2)+2-i;j++) {
				System.out.print(" ");
			  
			}
			for(int k=0;k<(n/n)+i;k++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		

	}

}
