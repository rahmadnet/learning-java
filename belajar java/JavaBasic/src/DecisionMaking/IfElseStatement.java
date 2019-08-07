package DecisionMaking;

public class IfElseStatement extends AssignmentDecision
{
	
	public void ifElseStatement()
	{
		int number = 10;
		
		if(number > 0)
		{
			System.out.println("Number is positive.");
		}
		
		else
			
		{
			System.out.println("Number is not positive.");
		}
		
		System.out.println("This statement is always executed.");
	}
}
