package com.ltts.movie.bo;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.ltts.movie.model.Production;

public class Productionbo {
	public boolean insertPlayer(Production p)throws Exception{
		//DB logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		Statement s=c.createStatement();
		boolean b=s.execute("insert into productions values("+p.getProductionId()+", '"+p.getProductionName()+"','"+p.getAddress()+"', '"+p.getDateOfStart()+"','"+p.getOwnerName()+"')");
		c.close();
		return b;
	}
	public List<Production> getAllPlayers()throws Exception{
		List<Production> al=new ArrayList<Production>();
		//DB Logic
		//Class.forName()
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("select * from productions");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			al.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5)));
		}
		c.close();
		return al;
	}
    public List<Production> getPlayerBySkill(String skill) throws Exception{
    	List<Production> li=new ArrayList<Production>();
    	//Apply DB Logic
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("select * from productions where Address= ?");
		ps.setString(1,skill);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5)));
		}
    	return li;
    }
    public boolean updatePlayer(int upi,int pid1, String pname1,String addr1 ,Date dos1, String ownern)throws Exception{
    	//Apply DB Logic
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement(" update productions set Productinid=?,productionname=?,Address=?,dateofstarted=?,ownername=? where productinid = ?");
		ps.setInt(1,pid1);
		ps.setString(2,pname1);
		ps.setString(3,addr1);
		ps.setDate(4,dos1);
		ps.setString(5,ownern);
		ps.setInt(6, upi);
		ps.executeUpdate();
		return false;
    	 }
    public boolean deletePlayer(int productionid)throws Exception{
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=c.prepareStatement("delete from productions where productinid= ?");
		ps.setInt(1,productionid);
		ps.executeUpdate();
    	return false;
    }
    public Production getPlayerById(int productionId)throws Exception{
    	Production p=new Production();
    	return p;
    }
}
