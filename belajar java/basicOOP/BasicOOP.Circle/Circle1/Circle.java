package Circle1;

public class Circle 
{
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius;
	private String color;
	
	
	
	public Circle()
	{
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		return "Circle[radius = " + radius + ", color = " + color + "]";
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	public double getCircumreference()
	{
		return 2.0 * radius * Math.PI;
	}
}
