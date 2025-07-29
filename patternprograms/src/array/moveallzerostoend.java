package array;

public class moveallzerostoend {

	public static void main(String[] args) {
		int[]a= {0,1,2,0};
		int v=0;
		for(int i=0;i<a.length-1;) {
			for(int j=1;j<a.length-1;) {
				if(a[i]==0) {
					v=a[i];
					System.out.println(a.length);
					System.out.println(a.length-j);
					a[i]=a[a.length-j];
					a[a.length-j]=v;
					j++;
				}else {
					i++;
				}
				
			}
			
		}
		System.out.println(a);
		//System.out.println(a.length);

	}

}
