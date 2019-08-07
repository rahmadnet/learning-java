package Character;

public class TestCharacter
{

	public static void main(String[] args) 
	{
		System.out.println("(isLetter() Method)");
		
		/*
		 * Syntax :
		 * boolean isLeter(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * Returns :
		 * returns true is a alphabet, otherwise return false
		 */
		
		System.out.println(Character.isLetter('R'));
		System.out.println(Character.isLetter('9'));
		System.out.println(Character.isLetter('H'));
		System.out.println(Character.isLetter('0'));
		
		
		System.out.println("\n(isDigit() Method)");
		
		/*
		 * Syntax :
		 * boolean isDigit(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * Returns :
		 * returns true if ch is a digit, otherwise return false
		 */
		
		// print false as A is character
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isDigit('M'));
		System.out.println(Character.isDigit('7'));
		
		System.out.println("\n(isWhitespace() Method)");
		
		/*
		 * boolean isWhitespace(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * Returns :
		 * returns true if ch is a whitespace.
		 * otherwise return false
		 */
		
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
		
		// ASCII value tab
		System.out.println(Character.isWhitespace(9));
		System.out.println(Character.isWhitespace('9'));

		System.out.println("\n(isUpperCase() Method)");
		
		/*
		 * It determines whether the specifed char value(ch) is uppercase or not.
		 * Syntax :
		 * boolean isUpperCase(char ch)
		 */
		
		System.out.println(Character.isUpperCase('D'));
		System.out.println(Character.isUpperCase('d'));
		System.out.println(Character.isUpperCase(95));
		System.out.println(Character.isUpperCase(24));
		
		System.out.println("\n(isLowerCase() Method)");
		
		/*
		 * It determines whether the specifed char value(ch) is lowercase or not.
		 * Syntax :
		 * boolean isLowerCase(char ch)
		 */
		
		System.out.println(Character.isLowSurrogate('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase(14));
		
		System.out.println("\n(toUpperCase() Method)");
		
		/*
		 * Syntax :
		 * char toUpperCase(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * Returns :
		 * returns the uppercase formof the specified char value.
		 */
		
		System.out.println(Character.toUpperCase('r'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('h'));
		System.out.println(Character.toUpperCase('m'));
		System.out.println(Character.toUpperCase('m'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('d'));
		
		System.out.println("\n(toLowerCase() Method)");
		
		/*
		 * Syntax :
		 * char toLowerCase(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * Returns :
		 * returns the lowercase form of the specified char value.
		 */
		
		System.out.println(Character.toLowerCase('R'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('H'));
		System.out.println(Character.toLowerCase('M'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('D'));
		
		
		System.out.println("\n(toString() Method)");
		
		/*
		 * String toString(char ch)
		 * Parameters :
		 * ch - a primitive character
		 * returns :
		 * returns a string object.
		 */
		
		System.out.println(Character.toString('J'));
		System.out.println(Character.toString('U'));
		System.out.println(Character.toString('N'));
		System.out.println(Character.toString('I'));
		
	}

}
