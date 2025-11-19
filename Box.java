package Codes;

public class Box {

	static int counter=0;
	private double length;
	private double height;
	private double width;
	Box()
	{
		this.length=-1;
		this.height=-1;
		this.width=-1;
		counter++;
	}
    Box(double length, double height, double width)
    {
        this.length=length;
        this.height=height;
        this.width=width;
        counter++;
    }
    Box(Box b1)
    {
        this.length = b1.length;
        this.height=b1.height;
        this.width=b1.width;
        counter++;
    }
    double volume()
    {
        return length*height*width;
    }
    static int getCounter()
    {
        return counter;
    }
}