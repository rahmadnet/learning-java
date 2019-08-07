package Date_Time;
import java.util.*;

public class Date_and_Time 
{

	public static void main(String[] args) 
	{
		String months[] = {"Januari", "Februari", "Maret", "April",
				"May", "June", "Juli", "Agustus", "September"
				, "October", "November", "December"};
		
		int year;
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.print("Date : ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(calendar.DATE) + " ");
		System.out.println(year = calendar.get(calendar.YEAR));
		System.out.print("Time : ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		if(calendar.isLeapYear(year))
		{
			System.out.println("The current year is a leap year");
		} else {
			System.out.println("The current year is not a leap year");
		}
	}

}
