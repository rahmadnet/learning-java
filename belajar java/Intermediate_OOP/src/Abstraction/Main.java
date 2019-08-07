package Abstraction;

public class Main {

	public static void main(String[] args) 
	{
		Mobil m1 = new Coupe();
		Mobil m2 = new Sedan();
		
		
		System.out.println("Mobil dengan type " + m1.getType() + " memiliki jumlah kursi " + m1.getJumlah_Kursi());
		System.out.println("Mobil dengan type " + m2.getType() + " memiliki jumlah kursi " + m2.getJumlah_Kursi());
	}

}
