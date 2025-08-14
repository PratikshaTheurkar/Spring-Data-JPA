package com.example.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//BookingService is targetEntity and Silver and Gold are dependantEntity
public class BookingService {

	@Autowired
	private Booking booking;
	
	public void getProcessBooking(int amt) {
		boolean status=booking.getBooking(amt);
		if(status) {
			System.out.print("Booking Confirmed");
		}
		else {
			System.out.print("Booking not Confirmed");
		}
	}
}
