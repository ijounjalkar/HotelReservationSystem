package com.HotelReservation;

public class Hotel {

	String HotelName;
	int weekdayRate;
	int weekendRate;
	int rating;

	public String getname() {
		return HotelName;
	}
	public void setHotelName(String HotelName) {
		this.HotelName = HotelName;
	}
	public int getweekdayRate() {
		return weekdayRate;
	}
	public void setweekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
	}
	public int getweekendRate() { 
		return weekendRate(); 
	}
	public void setweekendRate(int weekendRate) { 
		this.weekendRate = weekendRate; 
		}
	public int getrating() { 
		return rating(); 
	}
	public void setrating(int rating) { 
		this.rating = rating; 
		}
	

	public Hotel(String HotelName, int weekdayRate, int weekendRate, int rating) {
		this.HotelName = HotelName;
		this.weekdayRate = weekdayRate;
		this.weekendRate = weekendRate;
		this.rating = rating;

	}


}
