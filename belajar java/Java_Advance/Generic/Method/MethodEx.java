package Method;

public final class MethodEx 
{
	public void useRegularMethods()
	{
		int [] integerArray = new int [] {37, 22, 79, 12, 53};
		double [] doubleArray = new double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
		
		printArray(integerArray);
		printArray(doubleArray);
	}
	
	public void useGenericMethods()
	{
		Integer [] integerArray = new Integer [] {37, 22, 79, 12, 53};
		Double [] doubleArtray = new Double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
		String [] StringArray = new String [] {"Hi", "I", "am", "a", "String Array"};
		
		this.<Integer>printAnyArray(integerArray);
	}
	
	public void printArray(int [] array)
	{
		StringBuilder arrayPrintString = new StringBuilder("Array : ");
		if (array != null && array.length != 0)
		{
			for(Integer printObject : array)
			{
				arrayPrintString.append(printObject)
								.append("|");
			}
		}
		else
		{
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	public void printArray(double [] array)
	{
		StringBuilder arrayPrintString = new StringBuilder("Array : ");
		if(array != null && array.length != 0)
		{
			for(double printObject : array)
			{
				arrayPrintString
						.append(printObject)
						.append("|");
			}
		}
		else
		{
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	public <ArrayType> void printAnyArray(ArrayType [] array)
	{
		StringBuilder arrayPrintString = new StringBuilder("Array : ");
		if(array != null && array.length != 0)
		{
			for (ArrayType printObject : array)
			{
				arrayPrintString
						.append(printObject)
						.append("|");
			}
		}
		else
		{
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	public <ArrayTypeOne, ArrayTypeTwo> void printTwoArrays(ArrayTypeOne [] arrayone, ArrayTypeTwo [] arrayTwo)
	{
		StringBuilder arrayPrintString = new StringBuilder("Array Type One | Array Type Two\n");
		for (int index = 0; index < arrayone.length; index++)
		{
			arrayPrintString
					.append(arrayone[index])
					.append(" | ")
					.append(arrayTwo[index])
					.append("\n");
		}
		System.out.println(arrayPrintString);
	}
}
