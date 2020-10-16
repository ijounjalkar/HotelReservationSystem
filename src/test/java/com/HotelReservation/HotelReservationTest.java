package com.HotelReservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void cheapestMethod_shouldReturn_hotelNameAndToatalRate() {
		HotelReservation test = new HotelReservation();
		test.AddHotel("Lakewood", 110);
		test.AddHotel("Bridgewood",160);
		test.AddHotel("Ridgewood",220);
		String result = HotelReservation.cheapestHotel("10 Sep 2020", "11 Sep 2020");
		assertEquals("Lakewood",result);

	}

}
