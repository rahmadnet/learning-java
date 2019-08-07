package Encapsulation;

public class Main 
{

	public static void main(String[] args) 
	{
		Registrasi r = new Registrasi();
		
		r.setID(1);
		r.setNama_depan("Rahmad");
		r.setNama_belakang("Nasution");
		r.setEmail("rahmad123@gmail.com");
		r.setSandi("12345678");
		
		System.out.println("ID : " + r.getID());
		System.out.println("Nama Depan    : " + r.getNama_depan());
		System.out.println("Nama Belakang : " + r.getNama_belakang());
		System.out.println("Email         : " + r.getEmail());
		System.out.println("Sandi         : " + r.getSandi());
	}

}
