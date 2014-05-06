package com.artnology.sgw.alerting.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class XmlFunctions {
	public static String formatCurrentDate (String inputDateFormat) {
		DateFormat dateFormat = new SimpleDateFormat(inputDateFormat);
		Calendar cal = Calendar.getInstance();		
		return dateFormat.format(cal.getTime());
	}
	
	public static String cutOffAtLastDelimChar(String input, int maxLength) {
		return input.substring(maxLength) + "_somemagic";
	}
}
