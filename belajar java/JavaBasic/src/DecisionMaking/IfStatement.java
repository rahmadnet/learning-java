package DecisionMaking;


public class IfStatement extends AssignmentDecision
{
	public void ifStatement()
	{
		int number = 10;
		
		if (number > 0)
		{
			System.out.println("Number is positive.");
		}
		System.out.println("This statement is always executed.");
	}
}
