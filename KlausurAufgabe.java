package streams;

import java.util.*;

public class KlausurAufgabe {

	  public static void main(String[] args) {
	        String[] arr = {"USW", "GGT", "UA", "ZB", "FKK", "MFG", "SOSE", "A", "H", "MM", "MBIT"};
	        Map<Integer, List<String>> speicher = new HashMap<>();

	        for (String s : arr) {
	            int length = s.length();

	            if (!speicher.containsKey(length))
	                speicher.put(length, new ArrayList<>());
	        

	           
	            speicher.get(length).add(s);
	        }

	        System.out.println(speicher);
	    }

}
