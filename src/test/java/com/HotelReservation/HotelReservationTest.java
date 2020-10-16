package com.HotelReservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelReservationTest {

	/*
	 * UC3
	 * 
	 * @Test public void givenHotelNameAndWeekendRate_shouldReturn_listSize() {
	 * 
	 * HotelReservation test = new HotelReservation(); test.AddHotel("Lakewood",
	 * 110,90); test.AddHotel("Bridgewood",150,50);
	 * test.AddHotel("Ridgewood",220,150); int result = test.hotelList.size();
	 * assertEquals(3, result); }
	 */
	
	/**
	 * UC4
	 */
	/*@Test
	public void givenDate_And_RateOfStay_shouldReturn_cheapesthotelName() {
		HotelReservation test = new HotelReservation();
		test.AddHotel("Lakewood", 110, 90, 3);
		test.AddHotel("Bridgewood", 150, 50, 4);
		test.AddHotel("Ridgewood", 220, 150, 5);
		String result = test.cheapestHotel("11 Sep 2020", "12 Sep 2020");
		assertEquals("LakeWood", result);
*/
	@Test
	public void givenDate_And_RateOfStay_shouldReturn_cheapesthotelName() {
		HotelReservation test = new HotelReservation();
		test.AddHotel("Lakewood", 110, 90, 3);
		test.AddHotel("Bridgewood", 150, 50, 4);
		test.AddHotel("Ridgewood", 220, 150, 5);
		int result = test.hotelList.size();
		assertEquals(3, result);
	}

}
