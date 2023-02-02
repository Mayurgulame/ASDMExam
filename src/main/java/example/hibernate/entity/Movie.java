package example.hibernate.entity;

public class Movie {
private int movieId;
private String movieName;
private String movieDirector;
private String movieDuration;
private String movieReleaseDate;
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
public Movie(int movieId, String movieName, String movieDirector, String movieDuration, String movieReleaseDate) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.movieDirector = movieDirector;
	this.movieDuration = movieDuration;
	this.movieReleaseDate = movieReleaseDate;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieDirector() {
	return movieDirector;
}
public void setMovieDirector(String movieDirector) {
	this.movieDirector = movieDirector;
}
public String getMovieDuration() {
	return movieDuration;
}
public void setMovieDuration(String movieDuration) {
	this.movieDuration = movieDuration;
}
public String getMovieReleaseDate() {
	return movieReleaseDate;
}
public void setMovieReleaseDate(String movieReleaseDate) {
	this.movieReleaseDate = movieReleaseDate;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
			+ ", movieDuration=" + movieDuration + ", movieReleaseDate=" + movieReleaseDate + "]";
}



}