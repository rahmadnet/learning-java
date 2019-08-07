package Polymorphism;

public class PerjalananA extends PerjalananKereta
{

	@Override
	public int getPenumpang() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int getColate() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Kereta wisatawan A";
	}
	
}
