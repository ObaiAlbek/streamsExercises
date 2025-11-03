package streams;

/* Was ist das?
 * - Arbeitet mit einer Vielzahl von Datenquellen
 *   . Collections (List, Set, Map, etc.)
 *   . Arrays
 *   . Stream von Dateien (File IO)
 *   . ArrayList, LinkedList, etc.
 * 
 * - keine Notwendigkeit von loops
 * - Kein Speichern: Streams speichern keine Daten, sondern leiten sie von einer Quelle ab.
 * - Lazy Evaluation: Operationen werden erst ausgeführt, wenn eine Terminal-Operation aufgerufen wird.
 * - Einmalige Verwendung: Ein Stream kann nur einmal verwendet werden. 
 * 		. Alternative Möglickeit eine andere Stream für  das Selbe List ertsellen
 * 	 Sobald ein Stream verarbeitet wurde, kann er nicht erneut verwendet werden.
 * - Streams können grundsätzlich überall in einer Java-Klasse verwendet werden
 * 		, einschließlich in Methoden, Konstruktoren und anderen Bereichen, solange die Datenquelle und 
 * 		die notwendigen Imports vorhanden sind. 
 * 
 * . Stream-Operationen: (Siehe Bild)
 *  1. Intermediate (Zwischenoperationen)
 *   -  transformieren einen Stream in einen anderen Stream.
 *   -  sie werden erst ausgeführt, wenn eine Terminal-Operation aufgerufen wird.
 *   
 *  2. Terminal-Operationen (Siehe Bild)
 *   - schließen den Stream ab und liefern ein Ergebnis oder eine Nebenwirkung.
 *  
 * Hinweis: 
 *  - Streams in Java arbeiten hauptsächlich mit (Objekten) und nicht direkt mit (primitiven) Datentypen 
 *  - für  (primitiven) Datentypen : 
 *  	. IntStream für int
 *  	. LongStream für long
 *  	. DoubleStream für double
 *  
 */


public class Streams {

	public static void main(String[] args) {
		
	}

}
