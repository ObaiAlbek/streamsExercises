package streams;

import java.util.*;
import java.util.stream.Stream;

public class Aufgaben {
	
	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		
//		List<Integer> result = numbers.stream()
//				.map(i -> i * i)
//				.collect(Collectors.toList());
//		
//		System.out.println(result);
		
//		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
//	        Integer result2 = names
//	                .stream()
//	                .map(e -> e.length())
//	                .max((integer, newInteger) -> Integer.compare(integer, newInteger))
//	                .get();
//	        System.out.println(result2);
//	        
//	        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//	        
//	        Integer max = numbers.stream()
//	        .max((a,b) -> a.compareTo(b))
//	        .get();
//	        
//	        System.out.println(max);
	        
			String str = "Die Katze jagt die Maus";
			Stream<String> wörterString = Arrays.stream(str.split(" "));
			
			
			
		
	        List<String> saetze = Arrays.asList(
	        	    "Die Katze jagt die Maus",
	        	    "ist klein",
	        	    "Der Hund ",
	        	    "Die Katze schläft Bellt"
	        	);
	        
	        //finde das kleinste Wort
	        
	        String maxWort = saetze.stream()
	        	.flatMap(satz -> Arrays.stream(satz.split(" "))) // Teilt jeden Satz in Wörter
	        	.max(String::compareTo) // finde das lexikografisch  größte Wort
	        	.get();
	        
//	        System.out.println("maxWort " + maxWort);
	        
	        // speichere jede Wort der nur 5 Zeichen enthalten und alle Kleinbuchstaben
	        List<String> mindestensfünfZeichen =  saetze.stream()
	        		.flatMap(satz -> Arrays.stream(satz.split(" ")))
	        		.filter(wort -> wort.length() == 5)
	        		.map(wort -> wort.toLowerCase())
	        		.toList();
	        
	        //System.out.println(mindestensfünfZeichen);
	        
	        
//	       saetze.stream()
//	        .flatMap(satz -> Arrays.stream(satz.split(" ")))
//	        .forEach(wort -> System.out.println("Wort: " + wort + " Wortlänge " + wort.length()));
//	       
//	     
//	       Stream<Double> stream = Stream.of(3.0, 2.0);
//	       
//	       stream
//	    		   .forEach(i -> {
//	    			   double summe = i.reduce(0.0, (i,j) -> i+j);
//	    		   });
//	      
//	       
//	       System.out.println(z);
	       
	}
}
