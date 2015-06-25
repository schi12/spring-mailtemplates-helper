package com.artnology.sgw.alerting.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class XmlFunctions {
	public static String formatCurrentDate (String inputDateFormat) {
		DateFormat dateFormat = new SimpleDateFormat(inputDateFormat);
		Calendar cal = Calendar.getInstance();		
		return dateFormat.format(cal.getTime());
	}
	
	public static String cutOffAtLastDelimChar(String input, int maxLength) {
		return input.substring(maxLength) + "_somemagic";
	}
	
	public static String formatDate (String date, String inputDateFormat) {
				
		long millisecondsDate = Long.parseLong(date);
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millisecondsDate);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(inputDateFormat);
		
		return dateFormat.format(cal.getTime());
	}
}
