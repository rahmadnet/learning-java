package Polymorphism;

public class PerjalananB extends PerjalananKereta
{

	@Override
	public int getPenumpang() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getColate() {
		// TODO Auto-generated method stub
		return 400;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kereta wisatawan B";
	}
	
	public void blocareGeamuri()
	{
		System.out.println("Jendela di tutup\n");
	}
	
}
