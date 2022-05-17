package com.ltts.movie.main;

import java.util.*;

import com.ltts.movie.bo.Moviebo;
import com.ltts.movie.bo.Productionbo;
import com.ltts.movie.model.Movie;
import com.ltts.movie.model.Production;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("modidation Available on :");
		System.out.println("1. Production Table");
		System.out.println("2. Movie Table");
		int n=s.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("Production Table");
			System.out.println("1. Insert");
			System.out.println("2. Show Table");
			System.out.println("3. Show production Acc to Address");
			System.out.println("4. Update Table");
			System.out.println("5. Delete row from Table");
			Productionbo pb=new Productionbo();
			int z=s.nextInt();
			switch(z)
			{	
			case 1:
				System.out.println("Production Table");
				System.out.println("Enter the production ID");
				int pid=s.nextInt();
				System.out.println("Enter the Production Name");
				String pname=s.next();
				System.out.println("Enter the Address");
				String dos=s.next();
				System.out.println("Enter the Date of started (yyyy-mm-dd");
				String ms=s.next();
				java.sql.Date addr = java.sql.Date.valueOf(ms);
				System.out.println("Enter the Owner Name");
				String ownername=s.next();
				//Write the DB logic
				Production p1=new Production(pid,pname,dos,addr,ownername);
				boolean b=pb.insertPlayer(p1);
				if(b==false) {
					System.out.println("Value inserted...");
				}
				break;
			case 2:
				System.out.println("Productions are");
				List<Production> li=pb.getAllPlayers();
				for(Production p2:li) {
					System.out.println(p2);
				}
				break;
			case 3:
				System.out.println("Enter the Address");
				String sk=s.next();
				//DB logic
				List<Production> lit = pb.getPlayerBySkill(sk);
				for(Production p2:lit) {
					System.out.println(p2);
				}
				break;
			case 4:
				System.out.println("Enter the production ID ");
				int pno1=s.nextInt();
				System.out.println("Enter the production ID");
				int pid1=s.nextInt();
				System.out.println("Enter the Production Name");
				String pname1=s.next();
				System.out.println("Enter the Address");
				String addr1=s.next();
				System.out.println("Enter the Date of started (yyyy-mm-dd)");
				String ms1=s.next();
				java.sql.Date dos1 = java.sql.Date.valueOf(ms1);
				System.out.println("Enter the Owner Name");
				String ownern=s.next();
				//Write the DB logic
			
			
				boolean k=pb.updatePlayer(pno1,pid1,pname1,addr1,dos1,ownern);
				if(k==false) {
					System.out.println("Database updated successfully");
				}
				break;
			case 5:
				System.out.println("Enter the production id to REMOVE from list");
				int pno2=s.nextInt();
				//DB Logic
				boolean l=pb.deletePlayer(pno2);
				if(l==false) {
					System.out.println("Row deleted successfully");
				}
				break;
			}
		case 2:
		{
			System.out.println("Movie Table");
			System.out.println("1. Insert");
			System.out.println("2. Show Table");
			System.out.println("3. Show production Acc to Language");
			System.out.println("4. Update Table");
			System.out.println("5. Delete row from Table");
			Moviebo pm=new Moviebo();
			int y=s.nextInt();
			switch(y)
			{	
			case 1:
				System.out.println("Movie Table");
				System.out.println("Enter the Movie ID");
				int mid=s.nextInt();
				System.out.println("Enter the Movie Name");
				String mname=s.next();
				System.out.println("Enter the Heroname");
				String hero=s.next();
				System.out.println("Enter the heroine");
				String heroi=s.next();
				System.out.println("Enter the language");
				String lan=s.next();
				System.out.println("Enter the length");
				int gth=s.nextInt();
				System.out.println("Enter the movie type");
				String mtype=s.next();
				System.out.println("Enter the Production id");
				int pdid=s.nextInt();
				System.out.println("Enter the releasedate(yyyy-mm-dd)");
				String mess=s.next();
				java.sql.Date dute = java.sql.Date.valueOf(mess);
				//Write the DB logic
				Movie m1=new Movie(mid,mname,hero,heroi,lan,gth,mtype,pdid,dute);
				boolean b=pm.insertMovie(m1);
				if(b==false) {
					System.out.println("Value inserted...");
				}
				break;
			case 2:
				System.out.println("Movies are");
				List<Movie> gi=pm.getAllMovie();
				for(Movie p2:gi) {
					System.out.println(p2);
				}
				break;
			case 3:
				System.out.println("Enter the Language");
				String sk=s.next();
				//DB logic
				List<Movie> litt = pm.getMoviebyLanguage(sk);
				for(Movie p2:litt) {
					System.out.println(p2);
				}
				break;
			case 4:
				System.out.println("Enter the Movie ID");
				int mid1=s.nextInt();
				System.out.println("Enter the Movie ID");
				int mid2=s.nextInt();
				System.out.println("Enter the Movie Name");
				String mname1=s.next();
				System.out.println("Enter the Heroname");
				String hero1=s.next();
				System.out.println("Enter the heroine");
				String heroi1=s.next();
				System.out.println("Enter the language");
				String lan1=s.next();
				System.out.println("Enter the length");
				int gth1=s.nextInt();
				System.out.println("Enter the movie type");
				String mtype1=s.next();
				System.out.println("Enter the Production id");
				int pdid1=s.nextInt();
				System.out.println("Enter the releasedate(yyyy-mm-dd");
				String mess1=s.next();
				java.sql.Date dute1 = java.sql.Date.valueOf(mess1);
				//Write the DB logic
				
				boolean t=pm.updateMovie(mid1,mid2,mname1,hero1,heroi1,lan1,gth1,mtype1,pdid1,dute1);
				if(t==false) {
					System.out.println("Database updated successfully");
				}
				break;
			case 5:
				System.out.println("Enter the player number to REMOVE from list");
				int pno2=s.nextInt();
				//DB Logic
				boolean j=pm.deleteMOvie(pno2);
				if(j==false) {
					System.out.println("Row deleted successfully");
				}
				break;
			}
			s.close();
		}}
}}