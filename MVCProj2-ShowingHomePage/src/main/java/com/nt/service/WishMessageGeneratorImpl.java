package com.nt.service;

import java.util.Calendar;

public class WishMessageGeneratorImpl implements IWishMessageGeneratorService {

	@Override
	public String generateWishMessage() {
		// use calander

		Calendar calender = Calendar.getInstance();
		// get current hours
		int hours = calender.get(Calendar.HOUR_OF_DAY);
		if (hours < 12)
			return  hours +  "Good Morning";

		else if (hours < 16) {
			return hours + "Good AfterNoon";
		}

		else if (hours < 20) {
			return hours + "Good Evening";
		}

		else
			return hours + "Good Night";
	}

}
