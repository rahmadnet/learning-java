package Encapsulation;

public class Registrasi 
{
	private int ID;
	private String nama_depan;
	private String nama_belakang;
	private String email;
	private String sandi;
	
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getNama_depan() 
	{
		return nama_depan;
	}
	
	public void setNama_depan(String nama_depan) 
	{
		this.nama_depan = nama_depan;
	}
	
	public String getNama_belakang() 
	{
		return nama_belakang;
	}
	
	public void setNama_belakang(String nama_belakang)
	{
		this.nama_belakang = nama_belakang;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getSandi() 
	{
		return sandi;
	}
	
	public void setSandi(String sandi) 
	{
		this.sandi = sandi;
	}
	
	
}
