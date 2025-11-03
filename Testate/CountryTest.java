package streams.Testate;

import java.util.ArrayList;

public class CountryTest {
	ArrayList<Country> test;
	
	CountryTest(){
		test = new ArrayList<>();
		coutryTest();
	}
	
	public void coutryTest() {
		 // Erstelle Cities
        City berlin = new City(1, "Berlin", "DE", 3769000);
        City hamburg = new City(2, "Hamburg", "DE", 1845000);
        City munich = new City(3, "Munich", "DE", 1472000);
        City baden = new City(2, "Baden", "DE", 1845000222);

        City paris = new City(4, "Paris", "FR", 2148000);
        City lyon = new City(5, "Lyon", "FR", 515695);
        City marseille = new City(6, "Marseille", "FR", 861635);

        City tokyo = new City(7, "Tokyo", "JP", 13929000);
        City osaka = new City(8, "Osaka", "JP", 2725000);
        City kyoto = new City(9, "Kyoto", "JP", 1474570);

        // Erstelle Countries
        Country germany = new Country("DE", "Germany", "Europe", 83020000, 357022.0, 4.2, 1);
        germany.getCities().add(berlin);
        germany.getCities().add(hamburg);
        germany.getCities().add(munich);
        germany.getCities().add(baden);

        Country france = new Country("FR", "France", "Europe", 67060000, 551695.0, 2.8, 4);
        france.getCities().add(paris);
        france.getCities().add(lyon);
        france.getCities().add(marseille);

        Country japan = new Country("JP", "Japan", "Asia", 125800000, 377975.0, 5.2, 7);
        japan.getCities().add(tokyo);
        japan.getCities().add(osaka);
        japan.getCities().add(kyoto);

        // Füge Countries zur Liste hinzu
        test.add(germany);
        test.add(france);
        test.add(japan);
	}
	
}
