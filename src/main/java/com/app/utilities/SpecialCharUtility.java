package com.app.utilities;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharUtility {

	public static boolean containsSpecialChar(String s) {
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(s);
		
		System.out.println("check1");
		if(m.find())
			return true;
		
		System.out.println("check2");
		return false;
	}
	
	public static void includeOrNot(String sValue, String sName, Map<String, String> map) {
		if(!containsSpecialChar(sValue))
			map.put(sName, sValue);
	}
}
