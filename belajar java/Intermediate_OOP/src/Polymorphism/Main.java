package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int tidak_ada_kereta;
		Pelatih pelatih1, pelatih2;
		
		try {
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Berapa banyak gerbong untuk dilatih ? \nJawaban : ");
			tidak_ada_kereta = Integer.parseInt(input.readLine());
			pelatih1 = new Pelatih(tidak_ada_kereta);
			
			input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Berapa banyak gerbong untuk dilatih ? \nJawaban : ");
			tidak_ada_kereta = Integer.parseInt(input.readLine());
			pelatih2 = new Pelatih(tidak_ada_kereta);
			
			pelatih1.Tanggal_panggilan();
			System.out.println("Pelatih 1 : Kami " + pelatih1.getTidak_Ada_Paket_Total() + " kapasitas untuk kereta ini.");
			pelatih2.Tanggal_panggilan();
			System.out.println("Pelatih 2 : Kami " + pelatih2.getTidak_Ada_Paket_Total() + " kapasitas untuk kapasitas kereta ini.");
			
			pelatih1.afisVagon();
			
			if(pelatih1.equals(pelatih2))
			{
				System.out.println("\nKereta itu sama");
			}
			else System.out.println("\nKereta itu tidak sama");
			
			input.close();
					
			
		} catch (IOException e) 
		{
			// TODO: handle exception
			System.out.println("Kesalahan tombol keyboard 2!");
			e.printStackTrace();
			System.exit(1);
		}

	}

}
