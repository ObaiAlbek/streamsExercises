package streams;
import java.util.*;

public class Beispiele {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hallo");
		arr.add("Welt");
		//test(arr); Compiler Fehler
		
		ArrayList<Double> doublZahlen = new ArrayList<>();
		doublZahlen.add(2.5);
		doublZahlen.add(3.1);
		test(doublZahlen);
		
	}

	public static <T extends Number> void test(List<T> arr) {
		
		for (Number n : arr)
			System.out.println(n);
	}

}
