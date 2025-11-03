package streams.Testate;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr  = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(19);
		
		arr.stream()
		.forEach(i -> {System.out.println(Collectors.groupingBy(i2 -> i2).toString());
			
			
		});
	}

}
