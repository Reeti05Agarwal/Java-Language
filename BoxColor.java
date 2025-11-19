package Codes;

public class BoxColor extends Box2 {
	private String color;
	BoxColor()
	{
		super();
		this.color = null;
	}
	BoxColor(double length, double height, double width, String color )
	{
		super(length, height, width);
		this.color = color;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
