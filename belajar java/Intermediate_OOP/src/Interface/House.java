package Interface;

public class House implements Property
{

	@Override
	public void door() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has 5 doors");
		
	}

	@Override
	public void window() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has 4 windows");
	}

	@Override
	public void bathroom() {
		// TODO Auto-generated method stub
		System.out.println("This house has 2 bedrooms");
	}

	@Override
	public void refrigerator() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has 1 refrigerator");
	}

	@Override
	public void chair() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has 2 sets of sofas");
	}

	@Override
	public void bedroom() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has 1 bathroom");
	}

	@Override
	public void kitchen() 
	{
		// TODO Auto-generated method stub
		System.out.println("This house has a kitchen");
	}
	
}
