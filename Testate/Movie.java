package streams.Testate;

public class Movie {
	private int id;
	private String title;
	private int year;
	private String genre;
	private String director;

	public Movie(int id, String title, int year, String genre, String director) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.director = director;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", director=" + director
				+ "]";
	}

}
