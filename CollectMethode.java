package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectMethode {

	public static void main(String[] args) {
		int[] array = {3,7,1,8,4,5,5,3,4,1};
		
		Map<Integer,List<Integer>> map = IntStream.of(array)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity()));
		
		map.keySet().stream().forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		// Variante 1
		List<Integer> zahlen = numbers.stream()
				.map(z -> z * z)
				.collect(Collectors.toCollection(ArrayList::new));
		
//		zahlen.forEach(System.out::println);
		
		String result = numbers.stream()
				.map(z -> z *z)
				.map(z -> z +"")
				.collect(Collectors.joining(",","[", "]"));
		
		System.out.println(result);
	}

}
