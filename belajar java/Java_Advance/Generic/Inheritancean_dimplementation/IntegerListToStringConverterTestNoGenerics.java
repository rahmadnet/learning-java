package Inheritancean_dimplementation;

import java.util.ArrayList;

public class IntegerListToStringConverterTestNoGenerics 
{
	void testSourceToOutputConvert(ArrayList<Integer> entityValue, IntegerListToStringConverter converter)
	{
		String databaseValue = converter.convertToDatabaseValue(entityValue);
		
		ArrayList<Integer> databaseValueConvertedToEntityValue = converter.convertToEntityProperty(databaseValue);
	}
	
	void testOutputToSourceConvert(String databaseValue, IntegerListToStringConverter converter)
	{
		ArrayList<Integer> entityValue = converter.convertToEntityProperty(databaseValue);
		
		String entityValueConvertedToDatabaseValue = converter.convertToDatabaseValue(entityValue);
		
	}
}
