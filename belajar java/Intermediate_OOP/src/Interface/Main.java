package Interface;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		House h = new House();
		System.out.println("Register property inside the house\n");
		h.door(); 
		h.window(); 
		h.bathroom();
		h.refrigerator();
		h.chair();
		h.bedroom();
		h.kitchen();
		
		Store s = new Store();
		System.out.println("\nRegister property inside the store\n");
		s.door(); 
		s.window(); 
		s.bathroom();
		s.refrigerator();
		s.chair();
		s.bedroom();
		s.kitchen();
		
		Office o = new Office();
		System.out.println("\nRegister property inside the office\n");
		o.door(); 
		o.window(); 
		o.bathroom();
		o.refrigerator();
		o.chair();
		o.bedroom();
		o.kitchen();
	}

}
