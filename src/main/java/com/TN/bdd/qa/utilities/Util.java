package com.TN.bdd.qa.utilities;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", ":").replace(":", "_");
		return "shajahan" + timeStamp + "@gmail.com";
}
}
