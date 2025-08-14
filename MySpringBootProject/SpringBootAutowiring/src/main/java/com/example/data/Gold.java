package com.example.data;

public class Gold implements Booking{

	@Override
	public boolean getBooking(int amt) {
		System.out.println("Inside Gold>>");
		return true;
	}

}
