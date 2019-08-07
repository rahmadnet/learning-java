import Classes.Array_Wrapper;
import Method.MethodEx;

public class Main 
{

	public static void main(String[] args) 
	{
		/*
		 ****************************************************************************
		 
		  Example of methods - Generic vs Regular
		  
		 ****************************************************************************
		 */
		
		MethodEx methodEx = new MethodEx();
		methodEx.useRegularMethods();
		methodEx.useGenericMethods();
		
		/*
		 ****************************************************************************
		 
		 Example of generic classes
		 
		 ****************************************************************************
		 */
		
		Integer [] integerArray = new Integer[] {37, 22, 79, 12, 53};
		String [] stringArray = new String [] {"Hi", "I", "am", "a", "String Array"};
		
		Array_Wrapper<Integer> ArrayWrapperintegersEx = new Array_Wrapper<>(integerArray);
		ArrayWrapperintegersEx.print();
		
		Array_Wrapper<String> arrayWrapperStringEx = new Array_Wrapper<>(stringArray);
		arrayWrapperStringEx.print();
		
		
		
		
		Array_Wrapper arrayWrapperIntegerIM = new  Array_Wrapper(integerArray);
		ArrayWrapperintegersEx.print();
		
		Array_Wrapper arrayWrapperStringIm = new Array_Wrapper(stringArray);
		arrayWrapperStringEx.print();
		
		Array_Wrapper arrayWrapperWhat = new Array_Wrapper();
		arrayWrapperWhat.setArray(integerArray);
		arrayWrapperWhat.print();
	}

}
