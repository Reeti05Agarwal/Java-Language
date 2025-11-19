package Codes;

public class Box2 {
    static int counter=0;
	private double length;
	private double height;
	private double width;
	Box2()
	{
	
        this.length=-1;
		this.height=-1;
		this.width=-1;
		counter++;
	}
    Box2(double length, double height, double width)
    {
        this.length=length;
        this.height=height;
        this.width=width;
        counter++;
    }
    Box2(Box2 b1)
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


