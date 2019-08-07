package Interface;

public class Office implements Property
{

	@Override
	public void door() 
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 10 doors");
	}

	@Override
	public void window() 
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 10 windows");
	}

	@Override
	public void bathroom() 
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 5 bathrooms");
	}

	@Override
	public void refrigerator()
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 3 refrigerators");
	}

	@Override
	public void chair() 
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 100 seats and 5 sofas");
	}

	@Override
	public void bedroom()
	{
		// TODO Auto-generated method stub
		System.out.println("This office does not have a bedroom");
	}

	@Override
	public void kitchen() 
	{
		// TODO Auto-generated method stub
		System.out.println("This office has 1 kitchen");
	}

}
