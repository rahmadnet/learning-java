package Strings;

public class TestClassString 
{

	public static void main(String[] args) 
	{
		String s = "RAHMAD NASUTION";
		// or String s = new String ("RAHMAD NASUTION");
		
		// Returns the number of characters in the String
		System.out.println("String lenght = " + s.length());
		
		// Returns the character at ith index.
		System.out.println("Character at 3rd position = " + s.charAt(3));
		
		// Returns the substring from the ith index character
		// to end of string
		System.out.println("Subsstring " + s.substring(3));
		
		// Returns the substring from i to j-1 index.
		System.out.println("Substring = " + s.substring(2,5));
		
		// Concatenates string2 to the end string1
		String s1 = "Rahmad";
		String s2 = "Nasution";
		System.out.println("Concatenated string = " + s1.concat(s2));
		
		// Returns the index within the string 
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of share " + s4.indexOf("Share"));
		
		// Returns the index within the string of the
		// first occurence of the specified string,
		// string at the specified index.
		System.out.println("Index of a = " + s4.indexOf('a',3));
		
		// Checking equality of String
		Boolean out = "Rahmad".equals("Rahmad");
		System.out.println("Checking Equality " + out);
		out = "Rahmad".equals("Rahmad");
		System.out.println("Checking Equality " + out);
		
		out = "Rahmad".equalsIgnoreCase("Rahmad");
		System.out.println("Checking Equality " + out);
		
		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2 " + out);
		
		// Converting cases
		String word1 = "Playing Football";
		System.out.println("Changing to Lower Case " + word1.toLowerCase());
		
		// Trimming the word
		String word2 = "Bassket Ball";
		System.out.println("changing to Upper Case " + word1.toUpperCase());
		
		// Triming the word
		String word4 = "Learn to work Sharing";
		System.out.println("Trim the word " + word4.trim());
		
		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f', 'g');
		System.out.println("Replaced f with g -> " + str2);
		
	}

}
