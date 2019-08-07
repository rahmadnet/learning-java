package Java_Exception;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in .hasNext())
		{
			int n = in.nextInt();
			int p = in.nextInt();
			

			
			MyCalculaor my_Calculaor = new MyCalculaor();
			try {
				System.out.println(my_Calculaor.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
