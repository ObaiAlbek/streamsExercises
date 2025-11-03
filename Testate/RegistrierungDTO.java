package streams.Testate;

public class RegistrierungDTO {
	
	private final String vorname;
	private final String nachname;
	private final boolean istAdmin;
	private final boolean vergünstigungsberechtigt;
	
	public RegistrierungDTO(String vorname, String nachname,boolean istAdmin , boolean vergünstigungsberechtigt ) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.istAdmin = istAdmin;
		this.vergünstigungsberechtigt = vergünstigungsberechtigt;
	}
	
	public String getvorname() {
		return vorname;
	}
	
	public String getnachname() {
		return nachname;
	}
	
	public boolean istAdmin() {
		return istAdmin;
	}
	
	public boolean vergünstigungsberechtigt() {
		return vergünstigungsberechtigt;
	}
	
	public boolean equal(RegistrierungDTO o) {
		return true;
	}
	
	public String toString() {
		return "....";
	}
	
	public int hashCode() {
		return 0;
	}
}

record RegistrierungDTO2(String vorname, String nachname, boolean istAdmin,boolean vergünstigungsberechtigt ) {}
