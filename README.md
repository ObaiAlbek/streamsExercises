Hier ist ein Vorschlag für dein **README.md** (in Markdown-Syntax), passend zu deiner Repository-Struktur „streamsExercises“:

```markdown
# 💧 streamsExercises

Dieses Repository enthält verschiedene **Java-Übungen zu Streams**, die das Arbeiten mit der Stream-API (ab Java 8) demonstrieren.  
Die Beispiele zeigen, wie man Daten filtert, mappt, reduziert, sammelt und analysiert – sowohl mit synthetischen als auch mit echten Beispieldaten.

---

## 📁 Projektstruktur

```

streamsExercises/
├── Finanzanalyse/            # Enthält spezielle Finanzanalysen mit Streams
├── Testate/                  # Übungs- und Testdateien
├── ArraysAlsStream.java      # Demonstriert die Umwandlung von Arrays in Streams
├── Aufgaben.java             # Allgemeine Stream-Aufgaben
├── Beispiele.java            # Beispielmethoden mit Streams
├── Beispiele2.java           # Weitere Stream-Beispiele
├── CollectMethode.java       # Übungen zur collect()-Methode
├── KlausurAufgabe.java       # Beispiel für eine mögliche Klausuraufgabe mit Streams
├── Main.java                 # Einstiegspunkt zum Testen der Stream-Methoden
├── Operations.pdf            # Übersicht oder Zusammenfassung der Stream-Operationen
├── PeekMethode.java          # Demonstration der peek()-Methode
├── Reduce_Methode.java       # Übungen zur reduce()-Methode
├── Streams.java              # Enthält Hauptbeispiele für Stream-Verarbeitung
├── synthetic_data.csv        # Beispieldaten für Analysen (z. B. Finanzanalyse)
└── README.md                 # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis der **Java Stream API**
- Nutzung von **Intermediate Operations** wie `filter()`, `map()`, `sorted()`, `peek()`
- Anwendung von **Terminal Operations** wie `collect()`, `forEach()`, `reduce()`
- Umgang mit **Datenquellen** wie Arrays, Listen und CSV-Dateien
- Aufbau komplexer **Pipeline-Verarbeitungen**

---

## ▶️ Ausführung

Kompiliere und führe die Main-Klasse aus, um die Beispiele zu testen:

```bash
javac Main.java
java Main
````

Oder starte direkt in einer IDE wie **IntelliJ IDEA** oder **VS Code**.

---

## 📊 Beispiel: Reduce-Methode

```java
List<Integer> zahlen = List.of(1, 2, 3, 4, 5);
int summe = zahlen.stream()
                  .reduce(0, Integer::sum);
System.out.println("Summe: " + summe);
```

## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)

---

## 📄 Lizenz

Dieses Projekt ist **frei zu Lernzwecken** verwendbar.
Keine kommerzielle Nutzung ohne Zustimmung des Autors.

```
