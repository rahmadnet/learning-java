package Java_Method;

public class Sports
{
	String get_name()
	{
		return "Moto Sport";
	}
	void get_atribut_of_Racer()
	{
		System.out.println("Every driver must have motor sport Attributes " + get_name());
	}
}

class Racer extends Sports
{
	String get_name()
	{
		return "Moto Sports Class";
	}
}
