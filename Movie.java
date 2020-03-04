package main;

import java.util.Calendar;
import java.util.Date;

public class Movie extends Theatre {
	private String director;
	private Date releaseDate;
	
	public Movie(String aTitle, int aRating, String aDirector, Date aReleaseDate) {
		super(aTitle, aRating);
		director = "";
		releaseDate = new Date();
		setReleaseDate(aReleaseDate);
		setDirector(aDirector);
	}


	public String getDirector() {
		return director;
	}

	public Date getReleaseDate() {		
		return new Date(releaseDate.getTime());
	}

	public void setReleaseDate(Date aDate) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 1);
		Date nextYear = calendar.getTime();	
		if (aDate.before(nextYear)) {
			releaseDate = aDate;
		} else {
			releaseDate = today;
		}
		
	}

	public void setDirector(String aDirector) {
		this.director = aDirector;
		
	}


	public String getCategory() {
		return releaseDate.toString() + "-" + super.getCategory();
	}


}
