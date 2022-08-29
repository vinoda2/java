package com.xworkz.curd.dto;

public class MoviesDTO {
	
	//class properties
	private String language;
	private String movieType;
	private double ticketPrice;
	private int ratings;
	
	//private constructor
	public MoviesDTO(String language, String movieType, double ticketPrice,int ratings) {
		this.language = language;
		this.movieType = movieType;
		this.ticketPrice = ticketPrice;
		this.ratings = ratings;
	}
	
	//getter and setter methods
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "MoviesDTO [language=" + language + ", movieType=" + movieType + ", ticketPrice=" + ticketPrice
				+ ", ratings=" + ratings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((movieType == null) ? 0 : movieType.hashCode());
		result = prime * result + ratings;
		long temp;
		temp = Double.doubleToLongBits(ticketPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MoviesDTO))
			return false;
		MoviesDTO other = (MoviesDTO) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (movieType == null) {
			if (other.movieType != null)
				return false;
		} else if (!movieType.equals(other.movieType))
			return false;
		if (ratings != other.ratings)
			return false;
		if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
			return false;
		return true;
	}	

}
