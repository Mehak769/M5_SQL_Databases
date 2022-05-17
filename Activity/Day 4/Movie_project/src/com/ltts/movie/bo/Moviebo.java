package com.ltts.movie.bo;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.ltts.movie.model.Movie;

public class Moviebo {
	public boolean insertMovie(Movie p)throws Exception{
		//DB logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		Statement s=c.createStatement();
		boolean b=s.execute("insert into movie values("+p.getMovieid()+", '"+p.getMoviename()+"','"+p.getHeroname()+"', '"+p.getHeroine()+"','"+p.getLanguage()+"',"+p.getLength()+",'"+p.getMovietype()+"',"+p.getProductionid()+",'"+p.getReleasedate()+"')");
		c.close();
		return b;
	}
	public List<Movie> getAllMovie()throws Exception{
		List<Movie> al=new ArrayList<Movie>();
		//DB Logic
		//Class.forName()
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("select * from movie");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			al.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getDate(9)));
		}
		c.close();
		return al;
	}
    public List<Movie> getMoviebyLanguage(String skill) throws Exception{
    	List<Movie> li=new ArrayList<Movie>();
    	//Apply DB Logic
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("select * from movie where language= ?");
		ps.setString(1,skill);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getDate(9)));
		}
    	return li;
    }
    public boolean updateMovie(int upi,int movieid, String moviename,String hero ,String heroi, String lang, int len,String type,int prodid,Date rdate)throws Exception{
    	//Apply DB Logic
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement(" update movie set movieid=?,moviename=?,heroname=?,heroine=?,language=?,length=?,movietype=?,productionid=?,releasedate=? where movieid = ?");
		ps.setInt(1,movieid);
		ps.setString(2,moviename);
		ps.setString(3,hero);
		ps.setString(4,heroi);
		ps.setString(5,lang);
		ps.setInt(6,len);
		ps.setString(7,type);
		ps.setInt(8,prodid);
		ps.setDate(9,rdate);
		ps.setInt(10, upi);
		ps.executeUpdate();
		return false;
    	 }
    public boolean deleteMOvie(int productionid)throws Exception{
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("delete from movie where movieid= ?");
		ps.setInt(1,productionid);
		ps.executeUpdate();
    	return false;
    }
}
