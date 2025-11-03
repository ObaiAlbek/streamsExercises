package streams.Testate;

public class City {
	private int id;
	private String name;
	private Integer population;
	private String countryCode;

	public City() {
	}

	public City(int id, String name, String countryCode, Integer population) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.countryCode = countryCode;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getPopulation() {
		return population;
	}

	public String getCountryCode() {
		return countryCode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode
				+ "]";
	};
}
