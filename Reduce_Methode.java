package streams;

import java.util.*;

public class Reduce_Methode {
	static String str = "dds";
	public static void main(String[] args) {
		
	
		List<Integer> al = Arrays.asList(3,7,2,1,8,4,5);		
	
		System.out.println(al.stream().reduce((i,j) -> i+j));
		al.forEach(null);
		
		
		
	}
	
	
}
