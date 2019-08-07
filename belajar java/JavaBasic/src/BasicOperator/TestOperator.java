package BasicOperator;

import BasicOperator.Arithmetic_Operators;
import BasicOperator.Relational_Operator;
public class TestOperator {

	public static void main(String[] args) {
		System.out.println("(Arithmetic Operators)");
		Operator A = new Arithmetic_Operators();
		A.arithmetic();
		
		System.out.println("\n(Relational Operators)");
		Operator R = new Relational_Operator();
		R.relational();
		
		System.out.println("\n(Bitwise Operators)");
		Operator B = new Bitwise_Operators();
		B.bitwise();
		
		System.out.println("\n(Logical Operators)");
		Operator L = new Logical_Operator();
		L.logical();
		
		System.out.println("\n(Assignment Operators)");
		Operator As = new Assignment_Operator();
		As.assignment();
		
		System.out.println("\n(Misc Operators)");
		Operator O = new Miscellaneous_Operators();
		O.misc();
	}

}
