package Inheritancean_dimplementation;

import java.util.ArrayList;

public class IntegerListToStringConverterTestGeneric extends GeneralConverterTest<ArrayList<Integer>, String, IntegerListToStringConverter>
{
	public void testIntegerListToString()
	{
		IntegerListToStringConverter converter = new IntegerListToStringConverter();
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(79);
		integerList.add(32);
		
		testEntityConversion(integerList, converter);
	}
	
	public void testStringToIOntegerList()
	{
		IntegerListToStringConverter converter = new IntegerListToStringConverter();
		String databaseValue = new String("1|79|32|2");
		
		testDatabaseConversion(databaseValue, converter);
	}
}
