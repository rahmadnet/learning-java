package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets 
{

	static boolean is_balanced(String s)
	{
		Stack<Character> bracketstack = new Stack<>();
		char[] text = s.toCharArray();
		for (char x : text)
		{
			switch (x) 
			{
			case '{':
			case '<':
			case '(':
			case '[':
				bracketstack.push(x);
				break;
			case '}':
				if (bracketstack.peek() == '{')
				{
					bracketstack.pop();
					break;
				}
				else 
				{
					return false;
				}
			case '>':
				if (bracketstack.peek() == '<')
				{
					bracketstack.pop();
					break;
				}
				else 
				{
					return false;
				}
			case ')':
				if(bracketstack.peek() == '(')
				{
					bracketstack.pop();
					break;
				}
				else
				{
					return false;
				}
			case ']':
				if(bracketstack.peek() == '[')
				{
					bracketstack.pop();
					break;
				}
				else
				{
					return false;
				}
			}
		}
		return bracketstack.empty();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in))
		{
			System.out.println("Enter sequence of brackets : ");
			String s = in.nextLine();
			if(is_balanced(s))
			{
				System.out.println(s + " is balanced");
			}
			else
			{
				System.out.println(s + " ain't balanced");
			}
		}
	}

}
