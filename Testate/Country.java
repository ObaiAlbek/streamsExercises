package streams.Testate;

import java.util.*;

public class Country {
	 private String code; // z. B. Länder-Code
	    private String name; // Name des Landes
	    private String kontinent; // Kontinent
	    private double flaeche; // Fläche
	    private int bevoelkerung; // Bevölkerung
	    private double bruttosozialprodukt; // BSP
	    private int hauptstadt; // Hauptstadt (ID oder Referenz)
	    private ArrayList<City> Cities; // Liste der Städte

	  
	    public Country(String code, String name, String kontinent, int bevoelkerung,
	              double flaeche, double bruttosozialprodukt, int hauptstadt) {
	    	this.Cities = new ArrayList<>();
	        this.code = code;
	        this.name = name;
	        this.kontinent = kontinent;
	        this.flaeche = flaeche;
	        this.bevoelkerung = bevoelkerung;
	        this.hauptstadt = hauptstadt;
	        this.bruttosozialprodukt = bruttosozialprodukt;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getKontinent() {
	        return kontinent;
	    }

	    public void setKontinent(String kontinent) {
	        this.kontinent = kontinent;
	    }

	    public double getFlaeche() {
	        return flaeche;
	    }

	    public void setFlaeche(double flaeche) {
	        this.flaeche = flaeche;
	    }

	    public double getBruttosozialprodukt() {
	        return bruttosozialprodukt;
	    }

	    public void setBruttosozialprodukt(double bruttosozialprodukt) {
	        this.bruttosozialprodukt = bruttosozialprodukt;
	    }

	    public int getHauptstadt() {
	        return hauptstadt;
	    }

	    public void setHauptstadt(int hauptstadt) {
	        this.hauptstadt = hauptstadt;
	    }

	    public void setBevoelkerung(int bevoelkerung) {
	        this.bevoelkerung = bevoelkerung;
	    }

	    public int getBevoelkerung() {
	        return bevoelkerung;
	    }

	    public ArrayList<City> getCities() {
	        return Cities;
	    }

	    @Override
	    public String toString() {
	        return "Land [ name=" + name + ", bevoelkerung=" + bevoelkerung + "]";
	    }
}
