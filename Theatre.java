package main;

public class Theatre {
	
	private String title;
	private int rating;
	
	public Theatre(String aTitle, int aRating) {
		this.rating = 0;
		this.title = "";
		this.setTitle(aTitle);
		this.setRating(aRating);
		
	}
	
	public Theatre(Theatre toCopy) {
		title = toCopy.getTitle();
		rating = toCopy.getRating();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		if (rating >= 9) {
			return "A";
		} else if (rating >= 7) {
			return "B";
		} else if (rating >= 5) {
			return "C";
		} else if (rating >= 3) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int aRating) {
		if (aRating >=0 && aRating <= 10) {
			this.rating = aRating;
		}
	}
	
	public void setTitle(String aTitle) {
		this.title = aTitle.toUpperCase();
	}
}
