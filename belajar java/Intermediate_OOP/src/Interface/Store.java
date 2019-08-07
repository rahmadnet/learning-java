package Interface;

public class Store implements Property
{

	@Override
	public void door() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop has 4 doors");
	}

	@Override
	public void window() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop has 2 windows");
	}

	@Override
	public void bathroom() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop has 1 bathroom");
	}

	@Override
	public void refrigerator() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop has 1 refrigerator");
	}

	@Override
	public void chair() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop has 5 seats");
	}

	@Override
	public void bedroom() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop does not have a bedroom");
	}

	@Override
	public void kitchen() 
	{
		// TODO Auto-generated method stub
		System.out.println("This shop does not have a kitchen");
	}
	
	public void rack()
	{
		System.out.println("This shop has many shelves");
	}

}
