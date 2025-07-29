package streamapi;

import java.util.stream.Stream;

public class streamof {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		Stream.of(a)
		    .forEach( k -> System.out.println(k));

	}

}
