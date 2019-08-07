package LoopControl;

public class TestLoop 
{

	public static void main(String[] args) 
	{
		System.out.println("(While Loop)");
		AssignmentLoop w = new WhileLoop();
		w.whileLoop();
		System.out.println("\n(For Loop)");
		AssignmentLoop f = new ForLoop();
		f.forLoop();
		System.out.println("\n(Do While Loop)");
		AssignmentLoop d = new DoWhileLoop();
		d.doWhile();
		
	}

}
