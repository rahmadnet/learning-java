package Date;

public class TestDate 
{

	public static void main(String[] args) 
	{
		Date d1 = new Date(2016, 4, 6);
		System.out.println(d1);
		
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		System.out.println(d1);
		System.out.println("Year is : " + d1.getYear());
		System.out.println("Month is : " + d1.getMonth());
		System.out.println("Day is : " + d1.getDay());
		
		d1.setDate(1995, 6, 14);
		System.out.println(d1);
		
	}

}
