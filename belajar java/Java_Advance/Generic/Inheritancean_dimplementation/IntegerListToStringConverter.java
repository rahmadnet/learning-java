package Inheritancean_dimplementation;

import java.util.ArrayList;

public class IntegerListToStringConverter implements Property_Converter<ArrayList<Integer>, String>
{

	@Override
	public ArrayList<Integer> convertToEntityProperty(String databaseValue) 
	{
		ArrayList<Integer> integers = new ArrayList<>();
		if(databaseValue != null && !databaseValue.isEmpty())
		{
			String[] intString = databaseValue.split("\\|");
			for (String string : intString)
			{
				integers.add(Integer.valueOf(string));
			}
		}
				return integers;
	}

	@Override
	public String convertToDatabaseValue(ArrayList<Integer> entityProperty) 
	{
		StringBuilder integersToStringBuilder = new StringBuilder();
		for(Integer integer : entityProperty)
		{
			integersToStringBuilder
				.append(String.valueOf(integer))
				.append("|");
		}
		return integersToStringBuilder.toString();
	}
	
}
