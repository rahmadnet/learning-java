package Abstraction;

public class Coupe extends Mobil
{
	public final static int SEATS = 4;
	
	public String getType()
	{
		return "COUPE";
	}
	
	public int getJumlah_Kursi()
	{
		return SEATS;
	}
}
