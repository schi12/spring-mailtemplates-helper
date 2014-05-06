/**
 * 
 */
package com.artnology.sgw.alerting.helper;

/**
 * @author schi12
 *
 */
public class XMLLinkEnhancement {
	
	public static String createLinkDisplayText (String linkText, String linkUrl, String linkTarget) {
		return "<a href='"+linkUrl+"' target='"+linkTarget+"'>"+linkText+"</a>";
	}
	
	public static String createLinkDisplayText (String linkText, String linkUrl, String linkTarget, String linkColor) {
		return "<a href='"+linkUrl+"' target='"+linkTarget+"' style='colour:"+linkColor+"'>"+linkText+"</a>";
	}

}
