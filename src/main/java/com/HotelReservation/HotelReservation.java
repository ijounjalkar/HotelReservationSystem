package com.HotelReservation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	 public static List<Hotel> hotelList = new ArrayList<>();
	
	
	public void AddHotel(String HotelName, int weekdayRate, int weekendRate) {
		Hotel H1 = new Hotel (HotelName, weekdayRate, weekendRate  );
		hotelList.add(H1);
		
	}
	public static LocalDate stringToLocalDate(String value) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd LLL yyyy");
		LocalDate localDate = LocalDate.parse(value, dateFormat);
		return localDate;
	}
	/**
	 * UC3
	 * @param String departure
	 * @param String arrival
	 * @return
	 */
	public static String cheapestHotel(String arrival, String departure) {
		LocalDate localDate1 = stringToLocalDate(arrival);
		LocalDate localDate2 = stringToLocalDate(departure);
		
		int days = (int)Period.between(localDate1, localDate2).getDays();
		int cost = Integer.MAX_VALUE;
		String cheapHotel = "";
		for(Hotel hotel: hotelList) {
			int newCost = hotel.weekdayRate*days;
			if(newCost < cost) {
				cheapHotel = hotel.HotelName;
				cost = newCost;
			}
		}
		System.out.println("Cheapest Hotel: " +cheapHotel+ ", Rates: $" +cost);
		return cheapHotel;
		
	}
	public int size() {
		return hotelList.size();
	}
	
	/*
	 * public static void main( String[] args ) { System.out.println(
	 * "Welcome to the Hotel Reservation Program!" ); AddHotel();
	 * cheapestHotel("10 Sep 2020", "11 Sep 2020"); }
	 */
	
}
