package Overriding;

public class Office extends Home
{
	@Override
	public void bathroom() {
		// TODO Auto-generated method stub
		System.out.println(" The bathroom is not clean enough");
	}
	
	@Override
	public void room() {
		// TODO Auto-generated method stub
		System.out.println("This office has 10 rooms");
	}
}
