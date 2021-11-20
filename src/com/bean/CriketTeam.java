package com.bean;

import java.util.Set;

public class CriketTeam {
	 	
		private String CountryName,CoachNAme;
		private Set<Player>players;
		public String getCountryName() {
			return CountryName;
		}
		public void setCountryName(String countryName) {
			CountryName = countryName;
		}
		public String getCoachNAme() {
			return CoachNAme;
		}
		public void setCoachNAme(String coachNAme) {
			CoachNAme = coachNAme;
		}
		public Set<Player> getPlayers() {
			return players;
		}
		public void setPlayers(Set<Player> players) {
			this.players = players;
		}
		
		public void display()
		{
			System.out.println(getCountryName()+"\t"+getCoachNAme());
			
			Set<Player> s=getPlayers();
			for(Player p: s)
			{
				System.out.println(p);
			}
		}
}
