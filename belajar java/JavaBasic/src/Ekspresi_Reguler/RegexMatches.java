package Ekspresi_Reguler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
	private static String REGEX = "kambing";
	private static String INPUT = "kambing makan rumput."
									+ "semua kambing makan rumput.";
	private static String REPLACE = "sapi";
	

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile(REGEX);
		// get a matcher object
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}
