package com.HotelReservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelReservationTest {
	
	/*
	 * UC3
	 */
	@Test
	public void givenHotelNameAndWeekendRate_shouldReturn_listSize() {
		
		HotelReservation test = new HotelReservation();
		test.AddHotel("Lakewood", 110,90);
		test.AddHotel("Bridgewood",150,50);
		test.AddHotel("Ridgewood",220,150);
		int result = test.hotelList.size();
		assertEquals(3, result);
	}

}
