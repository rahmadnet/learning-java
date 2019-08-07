package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayFromCollection 
{
	public static void main(String[] args) 
	{
		List<Integer>  first_Five_PrimeNumbers = new ArrayList<>();
		
		first_Five_PrimeNumbers.add(2);
		first_Five_PrimeNumbers.add(3);
		first_Five_PrimeNumbers.add(5);
		first_Five_PrimeNumbers.add(7);
		first_Five_PrimeNumbers.add(11);
		
		List<Integer> first_Ten_prime_Numbers = new ArrayList<>(first_Five_PrimeNumbers);
		
		List<Integer> next_Five_Prime_Numbers = new ArrayList<>();
		
		next_Five_Prime_Numbers.add(13);
		next_Five_Prime_Numbers.add(15);
		next_Five_Prime_Numbers.add(19);
		next_Five_Prime_Numbers.add(23);
		next_Five_Prime_Numbers.add(29);
		
		first_Ten_prime_Numbers.addAll(next_Five_Prime_Numbers);
		
		
		System.out.println(first_Ten_prime_Numbers);
		
	}

}
