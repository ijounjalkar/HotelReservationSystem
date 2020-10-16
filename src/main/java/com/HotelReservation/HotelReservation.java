package com.HotelReservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	 public static List<Hotel> hotelList = new ArrayList<>();
	
	
	public void AddHotel(String HotelName, int weekdayRate, int weekendRate, int rating) {
		Hotel H1 = new Hotel (HotelName, weekdayRate, weekendRate, rating );
		hotelList.add(H1);
		
	}
	public static LocalDate stringToLocalDate(String value) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd LLL yyyy");
		LocalDate localDate = LocalDate.parse(value, dateFormat);
		return localDate;
	}
	/**
	 * UC4
	 * @param String departure
	 * @param String arrival
	 * @return
	 */
	public static int[] noOfDays(String arrival, String departure) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate from = LocalDate.parse(arrival, dateFormat);
		LocalDate to = LocalDate.parse(departure, dateFormat);
		int numOfWeekdays = 0;
		int numOfWeekends = 0;
		for (LocalDate date = from; date.isBefore(to.plusDays(1)); date = date.plusDays(1)) {
			DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK)); 
			switch (day) {
			case SATURDAY:
				numOfWeekends++;
				break;
			case SUNDAY:
				numOfWeekends++;
				break;
			default:
				numOfWeekdays++;
				break;
			}
		}
		return new int[] { numOfWeekdays, numOfWeekends };
	}
	public static String cheapestHotel(String arrival, String departure) {
		LocalDate localDate1 = stringToLocalDate(arrival);
		LocalDate localDate2 = stringToLocalDate(departure);
		
		int[] noOfDays = noOfDays(arrival,departure);
		int cost = Integer.MAX_VALUE;
		String cheapHotel = "";
		for(Hotel hotel: hotelList) {
			int newCost1 = hotel.weekdayRate*noOfDays[0] ;
			int newcost2 = hotel.weekendRate*noOfDays[1];
			int newCost = newCost1 + newcost2;
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
