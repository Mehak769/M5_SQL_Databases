package com.ltts.movie.model;

import java.sql.Date;

public class Movie {
	
	private int movieid;
	private String moviename;
	private String heroname;
	private String heroine;
	private String language;
	private int length;
	private String movietype;
	private int productionid;
	private Date releasedate;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieid, String moviename, String heroname, String heroine, String language, int length,
			String movietype, int productionid, Date releasedate) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.heroname = heroname;
		this.heroine = heroine;
		this.language = language;
		this.length = length;
		this.movietype = movietype;
		this.productionid = productionid;
		this.releasedate = releasedate;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getHeroname() {
		return heroname;
	}

	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getMovietype() {
		return movietype;
	}

	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}

	public int getProductionid() {
		return productionid;
	}

	public void setProductionid(int productionid) {
		this.productionid = productionid;
	}

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", heroname=" + heroname + ", heroine="
				+ heroine + ", language=" + language + ", length=" + length + ", movietype=" + movietype
				+ ", productionid=" + productionid + ", releasedate=" + releasedate + "]";
	}
	
	
}