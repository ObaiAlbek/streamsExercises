package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student obai = new Student("obai","mannheim","informatik");
		Pruefung TE2 = new Pruefung("TE2", 10,2,1.4);
		Pruefung mathe = new Pruefung("mathe", 10,2,5);
		obai.addPruefung(TE2);
		obai.addPruefung(mathe);
		
		Student omar = new Student("omar","mannheim","Cyber");
		Pruefung pr2 = new Pruefung("PR2", 12,1,5);
		Pruefung thi = new Pruefung("THI", 12,1,5);
		omar.addPruefung(pr2);
		omar.addPruefung(thi);
		
		ArrayList<Student> sts = new ArrayList<>();
		sts.add(omar);
		sts.add(obai);
		
		
		//Alle Prüfungen mit ihrem Namen, dem Semester, der Note und Namen des Studis ausgeben
		sts.stream()
		.forEach(st -> System.out.println("StudentName: " + st.getName()+ st.getPruefungen()));
		
		System.out.println();
		//Alle Studenten eines bestimmten Studiengangs ausgeben
		sts.stream()
		.filter(s -> s.getStudiengang().equalsIgnoreCase("informatik"))
		.forEach(System.out::println);
		
		System.out.println();
		//Notenschnitt jeder Studi-Instanz berechnen und ausgeben
		sts.stream().forEach(student -> {
		    double durchschnitt = student.getPruefungen().stream()
		        .mapToDouble(p -> p.getNote()) // Konvertiere die Noten in einen Double-Stream
		        .average() // Berechne den Durchschnitt
		        .orElse(0.0); // Falls keine Prüfungen vorhanden sind, wird 0.0 als Standardwert verwendet
		    
		    System.out.println("Student: " + student.getName() + ", Notenschnitt: " + durchschnitt);
		});
		
		System.out.println("Alle Studenten ausgeben, die eine Prüfung nicht bestanden haben");
		// Alle Studenten ausgeben, die eine Prüfung nicht bestanden haben
		sts.stream()
		.forEach( st -> {
			
		});
		
		
		
		
	}

}
class Student {
    private String name;
    private String wohnort;
    private String studiengang;
    private ArrayList<Pruefung> pruefungen;

    public Student(String name, String wohnort, String studiengang) {
        this.name = name;
        this.wohnort = wohnort;
        this.studiengang = studiengang;
        this.pruefungen = new ArrayList<>();
    }

    // Methoden zum Hinzufügen einer Prüfung
    public void addPruefung(Pruefung pruefung) {
        pruefungen.add(pruefung);
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public ArrayList<Pruefung> getPruefungen() {
        return pruefungen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", wohnort='" + wohnort + '\'' +
                ", studiengang='" + studiengang + '\'' +
                ", pruefungen=" + pruefungen +
                '}';
    }
}


class Pruefung {
    private String name;
    private int ectsZahl;
    private int semester;
    private double note;

    public Pruefung(String name, int ectsZahl, int semester, double note) {
        this.name = name;
        this.ectsZahl = ectsZahl;
        this.semester = semester;
        this.note = note;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEctsZahl() {
        return ectsZahl;
    }

    public void setEctsZahl(int ectsZahl) {
        this.ectsZahl = ectsZahl;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Pruefung{" +
                "name='" + name + '\'' +
                ", ectsZahl=" + ectsZahl +
                ", semester=" + semester +
                ", note=" + note +
                '}';
    }
}

