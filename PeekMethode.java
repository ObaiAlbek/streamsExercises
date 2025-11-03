package streams;

import java.util.stream.Stream;
/* 
 * - peek() ist ideal, um Daten im Stream zu beobachten und eignet sich gut für Debugging-Zwecke.
 * - Es ist eine Zwischenoperation, die Daten nicht verändert, sondern sie unverändert weitergibt.
 * - Nicht zum Modifizieren der Daten verwenden, da peek()-Operationen optimiert oder weggelassen werden könnten.
 * 
 */

public class PeekMethode {

	public static void main(String[] args) {
		Stream.of("A", "B", "C", "D")
	      .filter(s -> !s.equals("C"))
	      .peek(System.out::println) // Ausgabe für Debugging
	      .map(String::toLowerCase)
	      .forEach(System.out::println);

	}

}
