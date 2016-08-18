package model;

public class Movie implements Comparable<Movie>{
//MovieID::Title::Genres
	private Integer id;
	
	private String title;
	private String genres;
	
	private float rated;
	
	public Movie(){}
	public Movie(int id ,String title,String genres){
		this.id = id;
		this.title = title;
		this.genres=genres;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public float getRated() {
		return rated;
	}
	public void setRated(float rated) {
		this.rated = rated;
	}
	@Override
	public int compareTo(Movie o) {
		if(this.rated==o.rated){
			return this.id- o.id;
		}
		return (this.rated-o.rated)>0?1:-1;
	}
	
	@Override
		public String toString() {
			return this.id+"|"+this.title+"|"+this.genres+"|"+this.rated;
		}
	
}
