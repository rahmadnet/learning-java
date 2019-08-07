package Arrays;

import java.util.Arrays;
public class ArraySort 
{
	public static void main(String[] args)
	{
		// Warm up the virtual machine
		for (int i = 0; i < 10; i++)
		{
			int [] array = randomArray(100000, 100000);
			quicksort(array);
			array = randomArray(100000, 100000);
			mergesort(array);
		}
		
		// create 20 random arrays
		int[][] arrays = new int [20][100000];
		for (int i = 0; i < arrays.length; i++)
		{
			arrays[i] = randomArray(100000, 100000);
		}
		
		long start, end;
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++)
		{
			quicksort(arrays[i]);
		}
		
		end = System.currentTimeMillis();
		System.out.println("quicksort: " + ((end - start)/10) + " ms");
		
		start = System.currentTimeMillis();
		for (int i = 10; i < 20; i++)
		{
			mergesort (arrays[i]);
		}
		
		end = System.currentTimeMillis();
		System.out.println("mergesort: " + ((end - start)/10)+ " ms");
	}
	
	public static int[] randomArray(int length, int range)
	{
		int[] result = new int[length];
		for (int i = 0; i < length; i++)
		{
			result[i] = (int)(Math.random()*range);
		}
		return result;
	}
	
	public static void quicksort(int[] array)
	{
		quicksort(array, 0, array.length - 1);
	}
	
	private static void quicksort(int[] array, int left, int right)
	{
		if(left < right)
		{
			int pivot = left;
			int newpivot = partition(array, pivot, left, right);
			quicksort(array, left, newpivot -1);
			quicksort(array, newpivot + 1, right);
		}
	}
	
	private static void swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static int partition(int[] array, int pivot, int left, int right)
	{
		int pivotValue = array[pivot];
		swap(array, pivot, right);
		int storeIndex = left;
		
		for (int i = left; i < right; i++)
		{
			if (array[i] < pivotValue)
			{
				swap(array, i, storeIndex);
				storeIndex++;
			}
		}
		
		swap(array, storeIndex, right);
		return storeIndex;
	}
	
	public static void mergesort(int[] array)
	{
		if(array.length < 2)
		{
			return;
		}
		
		int[] left = Arrays.copyOfRange(array, 0, array.length/2);
		int[] right = Arrays.copyOfRange(array, array.length/2, array.length);
		mergesort(left);
		mergesort(right);
		merge(array, left, right);
	}
	
	private static void merge(int[] array, int[] left, int[] right)
	{
		int leftIndex = 0;
		int rightIndex = 0;
		int insertIndex  = 0;
		while (true)
		{
			if (leftIndex == left.length)
			{
				while (rightIndex < right.length)
				{
					array[insertIndex++] = right[rightIndex++];
				}
				return;
			} else if (rightIndex == right.length)
			{
				while (leftIndex < left.length)
				{
					array[insertIndex++] = left[leftIndex++];
				}
				return;
			} else if (left[leftIndex] <= right[rightIndex])
			{
				array[insertIndex++] = left[leftIndex++];
			} else {
				array[insertIndex++] = right[rightIndex++];
			}
		}
	}
}
