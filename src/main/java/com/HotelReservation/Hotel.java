package com.HotelReservation;

public class Hotel {
	
	String HotelName;
	int weekdayRate;
	
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

	/*
	 * public int weekendRate() { return weekendRate; } public void
	 * setweekendRate(int weekendRate) { this.weekendRate = weekendRate; }
	 */
	public Hotel(String HotelName, int weekdayRate) {
		this.HotelName = HotelName;
		this.weekdayRate = weekdayRate;
		
	}
	

}
