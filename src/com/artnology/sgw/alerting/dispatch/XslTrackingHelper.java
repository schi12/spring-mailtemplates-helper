package com.artnology.sgw.alerting.dispatch;

public class XslTrackingHelper {
	public static String track (String url) {
		return url + "?trackthis=schildema";
	}
	
	public static String trackEmailOpen() {
		return "DUMMY_IMAGE_LINK";
	}
	
	public static String buildLinkToSociety (String doi, String html_or_pdf) {
		return "DUMMY_EXTENDEDTOC" +"_" + html_or_pdf + "_" + doi;
	}
}
