package Numbers;

public class AssignmentNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("(xxxValue() Method)");
		
		/*
		 * Syntax :
		 * byte byteValue()
		 * short shortValue()
		 * long longValue()
		 * float floatValue()
		 * double doubleValue()
		 * Parameters :
		 * ----
		 * Returns :
		 * the numeric value represented by this object
		 * after conversion to specified type
		 */
		
		// creating a Double class object with value "6.9685"
		Double d = new Double("6.9685");
		
		// Converting this Double(Number) object to
		// different primitive data types
		byte b = d.byteValue();
		short s = d.shortValue();
		int i = d.intValue();
		long l = d.longValue();
		float f = d.floatValue();
		double d1 = d.doubleValue();
		
		System.out.println("value of d after converting is to byte = " + b);
		System.out.println("value of d after converting is to short = " + s);
		System.out.println("value of d after converting is to int = " + i);
		System.out.println("value of d after converting is to long = " + l);
		System.out.println("value of d after converting is to float = " + f);
		System.out.println("value of d after converting is to double = " + d1);
		
		System.out.println("\n(CompareTo() Method)");
		
		/*
		 * Syntax :
		 * public int compareTo( NumberSubClass referenceName )
		 * Parameters :
		 * referenceName - any NumberSubClass type value
		 * Returns :
		 * the value 0 if the Number is equals to the argument.
		 * the value -1 if the Number is less than the argument.
		 * the value 1 if the Number is greater than the argument.
		 */
		
		// Creating an Integer class object with value "10"
		@SuppressWarnings("deprecation")
		Integer i1 = new Integer("10");
		
		// comparing value of i
		System.out.println(i1.compareTo(7));
		System.out.println(i1.compareTo(11));
		System.out.println(i1.compareTo(10));
		System.out.println(i1.compareTo(30));
		
		System.out.println("\n(Equals() Method)");
		
		/*
		 * Syntax :
		 * public boolean equals (Object obj)
		 * Parameters :
		 * obj - any object
		 * Returns :
		 * The method returns true if the argument is not null and
		 * is an object of the same type and with the same numeric value,
		 * otherwise false.
		 */
		
		// Creating a short Class object with value "15"
		Short s1 = new Short("15");
		
		// creating a short Class object with value "10"
		Short x = 10;
		
		// Creating an Integer Class object with value "15"
		Integer y = 15;
		
		// Creating another Short Class object with value "15"
		Short z = 15;
		
		// Comparing s with other objects
		System.out.println(s1.equals(x));
		System.out.println(s1.equals(y));
		System.out.println(s1.equals(z));
		
		System.out.println("\n(ParseInt() Method)");
		
		/*
		 * Syntax :
		 * static int parseInt(String s, int radix)
		 * Parameters :
		 * s - any String representation of decimal 
		 * radix - any radix value
		 * returns :
		 * the integer value represented by the argument in decimal.
		 * Throws :
		 * NumberFormatException : if the string does not contain a parsable integer.
		 */
		
		// Parsing different strings
		int z1 = Integer.parseInt("654",8);
		int a = Integer.parseInt("-FF", 16);
		long l1 = Long.parseLong("2158611234",10);
		
		System.out.println(z1);
		System.out.println(a);
		System.out.println(l1);
		
		// run-time NumberFormatException will occur here
		// "RAHMAD" is not a parsable string
		//int x1 = Integer.parseInt("RAHMAD",8);
		
		// run-time NumberFormatException will occur here
		// (for octal(8),allowed digits are [0-7])
		//int y2 = Integer.parseInt("99",8);
		
		
		System.out.println("\n(toString() Method)");
		
		/*
		 * Syntax :
		 * String toString()
		 * String toString(int i)
		 * Parameters :
		 * String toString() - no parameter
		 * String toString(int i) - i: any integer value
		 * Returns :
		 * String toString() -
		 * returns a String object representing the value of the Number object
		 * on which it is invoked.
		 * String toString(int i) -
		 * returns a decimal String object representing the specified integer(i)
		 */
		
		// demonstrating toString() method
		Integer x2 = 12;
		
		System.out.println(x2.toString());
		
		// demonstrating toString(int i) method
		System.out.println(Integer.toString(12));
		
		System.out.println(Integer.toBinaryString(152));
		System.out.println(Integer.toHexString(152));
		System.out.println(Integer.toOctalString(152));


		System.out.println("\n(valueOf() Method)");
		
		/*
		 * Syntax :
		 * Integer valueOf(int i)
		 * Integer valueOf(String s)
		 * Integer valueOf(String s, int radix)
		 * Parameters :
		 * i - any integer value
		 * s - any String representation of decimal
		 * radix - any radik value
		 * Returns :
		 * valueOf(int i) : an Integer object holding the valuepresentend by the int argument.
		 * valueOf(String s) : an Integer object holding value represented by the string argument.
		 * valueOf(String s, int radix) : an Integer object holding the value
		 * represented by the String argument with base radix.
		 * Throws :
		 * valueOf(String s) -
		 * NumberFormatException : if the string does not contain a parsable integer.
		 * valueOf(String s, int radix) - 
		 * NumberFormatException : if the string does not contain a parsable integer.
		 */
		
		// demonstrating valueOf(int i) method
		System.out.println("Demonstrating valueOf(String i) method");
		Integer i2 = Integer.valueOf(50);
		Double d2 = Double.valueOf(9.36);
		System.out.println(i2);
		System.out.println(d2);
		
		// demonstrating valueOf(String s) method
		System.out.println("Demonstrating valueOf(String s) method");
		Integer n = Integer.valueOf("333");
		Integer m = Integer.valueOf("-255");
		System.out.println(n);
		System.out.println(m);
		
		
		// demonstrating valueOf(String s, int radix) method
		System.out.println("Demonstrating valueOf(String s) method");
		Integer y1 = Integer.valueOf("333",8);
		Integer x1 = Integer.valueOf("-255",16);
		Long l2 = Long.valueOf("51688245", 16);
		System.out.println(y1);
		System.out.println(x1);
		System.out.println(l2);
		
		
		// run-time NumberFormatException will occur in below cases
		//Integer a1 = Integer.valueOf("RAHMAD");
		//Integer b1 = Integer.valueOf("RAHMAD",16);
		
		
	}

}
