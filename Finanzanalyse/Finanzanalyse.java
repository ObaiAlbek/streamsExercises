package streams.Finanzanalyse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Finanzanalyse {

	
	public static void main(String[] args) throws FileNotFoundException {
		Finanzanalyse f  = new Finanzanalyse();
		f.addTran();
		
		//Eine gefilterte Liste mit allen Überweisungen in einer bestimmten Währung.
		f.getTran().stream()
		.filter(w -> w.getCurrency().equalsIgnoreCase("EUR"))
		.forEach(System.out::println);
		
		
		//Gesamtsumme der Überweisungen in den jeweiligen Währungen.
		long usdÜberwei = f.getTran().stream()
		.filter(w -> w.getCurrency().equals("USD"))
		.count();
		System.out.println(usdÜberwei);
	}
	
	private ArrayList<Transaction> tran = new ArrayList<>();

	public void addTran() throws FileNotFoundException {
		File file = new File(
				"C:\\Users\\obaya\\git\\Programmierung2\\Programmierung2\\src\\streams\\synthetic_data.csv");
		Scanner scan = new Scanner(file);

		while (scan.hasNextLine()) {
			String sender_name = scan.nextLine();
			if (sender_name.startsWith("sender_name"))
				continue;

			String[] saplten = sender_name.split(",");
			tran.add(new Transaction(saplten[0],saplten[1],saplten[2],saplten[3],Double.parseDouble(saplten[4]),saplten[5],saplten[5]));
		}
		scan.close();
		
	}

	public ArrayList<Transaction> getTran() {
		return tran;
	}
	
	
}
