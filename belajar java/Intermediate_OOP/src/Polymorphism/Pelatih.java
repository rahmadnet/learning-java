package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pelatih
{
	private Kereta[] kereta = new Kereta[15];
	private int tidak_ada_kereta = 0;
	public int Tidak_Ada_Paket_Total = 0;
	
	public Pelatih(int n)
	{
		if(n < 15)
		{
			int opt;
			try {
				
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				
				for(int i = 0; i < n; i++)
				{
					System.out.print("Berapa banyak gerbong untuk dilatih ?\n1-> Perjalanan A\n2-> Perjalanan B\n3-> Barang\n\nRapsuns : ");
					opt = Integer.parseInt(input.readLine());
					
					if(opt == 1)
					{
						kereta[tidak_ada_kereta++] = new PerjalananA();
					}
					
					else if (opt == 2)
					{
						kereta[tidak_ada_kereta++] = new PerjalananB();
					}
					
					else if (opt == 3)
					{
						kereta[tidak_ada_kereta++] = new Barang();
					}
					else System.out.println("Kesalahan, masukkan pilihan dengan benar");
					
					Tidak_Ada_Paket_Total += kereta[tidak_ada_kereta-1].getColate();
				}
				//input.close;
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Galat membaca keyboard!");
				System.exit(1);
			}
		}
		else System.out.println("Sebuah kereta bisa memuat hingga 15 gerbong!");
	}
	
	public boolean equals(Object ob)
	{
		if(ob instanceof Pelatih)
		{
			Pelatih tren = (Pelatih)ob;
			return tren.Tidak_Ada_Paket_Total == Tidak_Ada_Paket_Total;
		}
		else 
		return false;
		
		
	}
	public void Tampilkan_Tanggal_Kereta(Kereta x)
	{
		System.out.println("penumpang : " + x.getPenumpang() + " rompi : " + x.getColate());
	}
	
	public void Tanggal_panggilan()
	{
		for (int i = 0; i < tidak_ada_kereta; i++)
		{
			Tampilkan_Tanggal_Kereta(kereta[i]);
		}
	}
	
	public int getTidak_Ada_Paket_Total()
	{
		return Tidak_Ada_Paket_Total;
	}
	
	public void afisVagon()
	{
		for(int i = 0; i < tidak_ada_kereta; i++)
		{
			System.out.println(kereta[i].toString());
		}
	}
}
