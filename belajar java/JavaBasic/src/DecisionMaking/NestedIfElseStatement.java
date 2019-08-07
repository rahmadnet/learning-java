package DecisionMaking;

public class NestedIfElseStatement extends AssignmentDecision
{
	double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
	
	public void nestedIfElseStatement()
	{
		if(n1 >= n2)
		{
			if(n1 >= n3)
			{
				largestNumber = n1;
			} 
			
			else 
			
			{
				largestNumber = n3;
			}
		}
		
		else
			
		{	
			if(n2 >= n3)
			{
				largestNumber = n2;
			}
			
			else
				
			{
				largestNumber = n3;
			}
		}
		System.out.println("Large number is " + largestNumber);
	}

}
