package patternprograms;

public class kshape {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<(n/2)+i;j++) {
				System.out.print("+");
			}
			System.out.println();
		}

	}

}
