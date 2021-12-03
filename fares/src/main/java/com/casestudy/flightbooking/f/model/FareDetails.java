package com.casestudy.flightbooking.f.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Fares")
public class FareDetails
{ 
    
	private String fid;
	private String economy;
	private String premium_economy;
	private String business;
	private String first_class;
	private int Date;
	/**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}
	/**
	 * @param fid the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}
	/**
	 * @return the economy
	 */
	public String getEconomy() {
		return economy;
	}
	/**
	 * @param economy the economy to set
	 */
	public void setEconomy(String economy) {
		this.economy = economy;
	}
	/**
	 * @return the premium_economy
	 */
	public String getPremium_economy() {
		return premium_economy;
	}
	/**
	 * @param premium_economy the premium_economy to set
	 */
	public void setPremium_economy(String premium_economy) {
		this.premium_economy = premium_economy;
	}
	/**
	 * @return the business
	 */
	public String getBusiness() {
		return business;
	}
	/**
	 * @param business the business to set
	 */
	public void setBusiness(String business) {
		this.business = business;
	}
	/**
	 * @return the first_class
	 */
	public String getFirst_class() {
		return first_class;
	}
	/**
	 * @param first_class the first_class to set
	 */
	public void setFirst_class(String first_class) {
		this.first_class = first_class;
	}
	/**
	 * @return the date
	 */
	public int getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		Date = date;
	}
}
	
	
	   
		/*@Indexed(unique=true)
		String fid;

		String economy,premium_economy,business,fist_class,date;
        @Id
		public FareDetails(String fid, String economy, String premium_economy, String business, String fist_class, String date) {
			super();
			this.fid = fid;
			this.economy = economy;
			this.premium_economy = premium_economy;
			this.business = business;
			this.fist_class = fist_class;
			this.date = date;
		}

		public String getFid() {
			return fid;
		}

		public void setFid(String fid) {
			this.fid = fid;
		}

		public String getEconomy() {
			return economy;
		}

		public void setEconomy(String economy) {
			this.economy = economy;
		}

		public String getPremium_economy() {
			return premium_economy;
		}

		public void setPremium_economy(String premium_economy) {
			this.premium_economy = premium_economy;
		}

		public String getBusiness() {
			return business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		public String getFist_class() {
			return fist_class;
		}

		public void setFist_class(String fist_class) {
			this.fist_class = fist_class;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}
		
		
	}
}*/