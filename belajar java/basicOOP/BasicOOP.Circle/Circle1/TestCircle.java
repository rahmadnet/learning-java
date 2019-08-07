package Circle1;

public class TestCircle	
{

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(1.1, "blue");
		Circle c2 = new Circle(2.2);
		Circle c3 = new Circle();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.setRadius(2.2);
		c1.setColor("green");
		System.out.println("The radius is : "+ c1.getRadius());
		System.out.println("The color is : "+ c1.getColor());
		
		System.out.printf("The Area is : %.2f%n", c1.getArea());
		System.out.printf("The circumference is : %.2f%n", c1.getCircumreference());
		
		
	}

}
