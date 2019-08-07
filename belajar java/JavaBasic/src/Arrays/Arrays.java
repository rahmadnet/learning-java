package Arrays;
import java.util.Scanner;

public class Arrays 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int meanAge = 0, i;
		
		// Initialization of the two arrays depending on user input
		int position = input.nextInt();
		int[] myArray = new int[position];
		int[] otherArray = new int[position];
		
		// Loop to ask the users for the values of the arrays
		for(i = 0; i < myArray.length; i++)
		{
			myArray[i] = input.nextInt();
			otherArray[i] = input.nextInt();
		}
		
		// Caption the returning variabels in main variabels
		int[] reversed = reverseArray (myArray);
		int[] merge = mergeArray (myArray, otherArray);
		
		// areEqual returns a boolean, 
		// that is why we can use it in a conditional
		if (areEqual(myArray, otherArray))
			System.out.println("E Q U A L !");
		else 
			System.out.println("Not Equal :[");
		
		// This method is called only to print beautifully the arrays
		printArray(reversed);
		printArray(merge);
		
	}
	

	/*
	*	printArray: An attemp to display a humanized view of an array
	*/
	private static void printArray(int[] array) 
	{
		System.out.print("[");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i] + " ");
		}
		System.out.print("]");
	}

	/*
	*	areEqual: Receives two arrays and returns a boolean variable indicating
	*	whether the structures are the same in length and values. This doesn't work
	*	for same values in the arrays. 
	*/
	private static boolean areEqual(int[] firstArray, int[] secondArray)
	{
		boolean equal;
		int count = 0;
		
		if (firstArray.length != secondArray.length)
		{
			return false;
		} else {
			for (int i = 0; i < firstArray.length; i++)
			{
				for (int j = 0; j < firstArray.length; j++)
				{
					if (firstArray[i] == secondArray[j])
					{
						count++;
					}
				}
			}
		}
		if (count == firstArray.length)
		{
			return true;
		} else {
			return false;
		}
	}

	/*
	*	mergeArrays: Combines two different arrays into one. 
	*/
	private static int[] mergeArray(int[] firstArray, int[] secondArray) 
	{
		int[] newArray = new int [firstArray.length + secondArray.length];
		int count1, count2, control;
		
		for (count1 = 0; count1 < firstArray.length; count1++)
		{
			newArray[count1] = firstArray[count1];
		}
		
		control = 0;
		for (count2 = count1; count2 < newArray.length; count2++)
		{
			newArray[count2] = secondArray[control];
			control = control + 1;
		}
		return newArray;
	}

	/*
	*	reverseArray: Receives an array, and reverse the whole data structure
	*	analyzing the whole array until its last position.
	*/
	private static int[] reverseArray(int[] myArray) 
	{
		int[] arrayTemp = new int[myArray.length];
		
		int counter = 0;
		for(int i = myArray.length - 1; i >= 0; i--)
		{
			arrayTemp[counter] = myArray[i];
			counter = counter + 1;
		}
		return arrayTemp;
	}
	
	/*
	*	arrayReverse: Receives an array, and reverse the whole data structure
	*	analyzing until the middle of the array. 
	*/
	public static int[] arrayReserve(int[] arr)
	{
		int varTemp = 0;
		
		for(int i = 0; i < (arr.length - 1)/2; i++)
		{
			varTemp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i - 1] = varTemp;
		}
		return arr;
	}
}
