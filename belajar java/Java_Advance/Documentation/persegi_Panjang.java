
public class persegi_Panjang {

	int panjang;
	int lebar;
	
	public persegi_Panjang(int panjang, int lebar)
	{
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void keliling()
	{
		int keliling = panjang * lebar;
	}
	
	
	public int getPanjang() {
		return panjang;
	}


	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}


	public int getLebar() {
		return lebar;
	}


	public void setLebar(int lebar) {
		this.lebar = lebar;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persegi_Panjang pp = new persegi_Panjang(12, 10);
		pp.keliling();
	}

}
