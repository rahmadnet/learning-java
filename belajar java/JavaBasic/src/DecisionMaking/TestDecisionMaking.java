package DecisionMaking;

public class TestDecisionMaking 
{
	public static void main(String[] args) 
	{		
		
		System.out.println("(IF Statement)");
		AssignmentDecision ifstatement = new IfStatement();
		ifstatement.ifStatement();
		
		System.out.println("\n(IF-ELSE Statement)");
		AssignmentDecision ifelsestatement = new IfElseStatement();
		ifelsestatement.ifElseStatement();
		
		System.out.println("\n(Nested IF-ELSE Statement)");
		AssignmentDecision nestedifelsestatement = new NestedIfElseStatement();
		nestedifelsestatement.nestedIfElseStatement();
		
		System.out.println("\n(SWITCH Statement)");
		AssignmentDecision switchstatement = new SwitchStatement();
		switchstatement.switchStatement();
	}
}
