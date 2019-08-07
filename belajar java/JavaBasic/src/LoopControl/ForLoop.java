package LoopControl;

public class ForLoop extends AssignmentLoop
{
	int x, y;
	
	public void forLoop()
	{
		for(x = 1; x <= 5; x++)
		{
			System.out.println(" ");
			for(y = 1; y<= x; y++)
			{
				System.out.print("*");
			}
		}
	}
}
