package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysAlsStream {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("H","B","D");
		s.forEach(System.out::println);
		
		int[] array = {1,2,3,4,5};
		IntStream.of(array).filter(i -> (i == 2)).forEach(System.out::println);
		
		StringBuffer buffer = new StringBuffer();
		IntStream.rangeClosed(1, 50)
		         .forEach(buffer::append);
		System.out.println(buffer.toString());
	}

}
