package com.manav.movie;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class HollywoodEntity {
	@Id
	private int movieId;
	@Column
	private String movieName;
	@Column
	private String language;
	@Column
	private int releasedIn;
	@Column
	private double revenueInDollar;
	
	public void setmovieId(int Id) {
		this.movieId = Id;
	}

	public void setmovieName(String name) {
		this.movieName = name;
	}

	public void setlanguage(String lang) {
		this.language= lang;
	}

	public void setreleaseIn(int release) {
		this.releasedIn = release;
	}

	public void setrevenue(double dollar) {
		this.revenueInDollar = dollar;
	}

	public int setmovieId() {
		return movieId;
	}

	public String setmovieName() {
		return movieName;
	}

	public String setlanguage() {
		return language;
	}

	public int setreleaseIn() {
		return releasedIn;
	}

	public double getrevenue() {
		return revenueInDollar;
	}

}
