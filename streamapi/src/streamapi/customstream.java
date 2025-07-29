package streamapi;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class customstream {
	public static void main(String[] args) {
		Supplier<String>s =new Supplier<String>() {
			
			@Override
			public String get() {
			
				return "iloveu";
			}
		} ;
		Consumer<String>i=new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			  
				
			}
		};

		
		Stream<String>s1=Stream.generate(s);
		s1.forEach(i);
		
	}

}
