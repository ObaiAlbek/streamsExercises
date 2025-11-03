package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Beispiele2 {
	
	public static void main(String[] args) {
		
		Integer[] myArray = new Integer[]{10,20,22,30,50};
		Stream<Integer>  myStream = Arrays.stream(myArray);
		// entweder
		myStream.sorted().forEach(System.out::println);;
		
		//oder
		myStream.forEach(i -> System.out.println(i));
		
		
		ArrayList<Integer> test = new ArrayList<>();
		
		test.stream();

		Stream<String> stream3 = Stream.of("Hallo Welt", "Hello Detective", "Guten Tag", "Hallo hallo wie geht es Dir", "Endlich Feierabend");

		int wordCount = stream3
		    .flatMap(s -> Arrays.stream(s.split(" ")))  // Jedes Element (Satz) wird in Wörter gesplittet
		    .map(word -> 1)                             // Jedes Wort wird in den Wert 1 gemappt
		    .reduce(0, (sum, word) -> sum + word);      // Alle 1er-Werte werden addiert, um die Wortanzahl zu erhalten

		System.out.println(wordCount);
	}
}
