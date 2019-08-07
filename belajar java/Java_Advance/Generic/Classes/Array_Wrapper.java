package Classes;

public class Array_Wrapper<ArrayType>
{
	private ArrayType [] array;
	
	public void print()
	{
		StringBuilder arrayPrintString = new StringBuilder("Array : ");
		if(array != null && array.length != 0)
		{
			for(ArrayType printObject : array)
			{
				arrayPrintString.append(printObject).append("|");
			}
		}
		else
		{
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	public <ArrayTypeTwo> void print(ArrayTypeTwo [] arrayTwo)
	{
		StringBuilder arrayPrintString = new StringBuilder("Array Type One | Array Type Two\n");
		for (int index = 0; index < array.length;index++)
		{
			arrayPrintString.append(array[index])
							.append(" | ")
							.append(arrayTwo[index])
							.append("\n");
		}
		System.out.println(arrayPrintString);
	}
	
	public Array_Wrapper() {}
	
	public Array_Wrapper(ArrayType [] array)
	{
		this.array = array = array;
	}
	
	public void setArray(ArrayType [] array)
	{
		this.array = array;
	}
}
