package com.example.data;

import org.springframework.stereotype.Repository;

@Repository
public class Silver implements Booking{

	@Override
	public boolean getBooking(int amt) {
		System.out.println("Inside Silver>>");
		return false;
	}

}
