abstract class Shape
{
	abstract double Area();  //Abstract class
}

class Square extends Shape
{
	private double side;
	Square(int side)
	{
		this.side = side;
	}
	double Area()
	{
		return side*side;
	}
}
class Rectangle extends Shape
{
	private double width,length;
	Rectangle(int length,int width)
	{
		this.width=width;
		this.length = length;
	}
	double Area()
	{
		return length*width;
	}
}

class Triangle extends Shape
{
	private double breadth,length;
	Triangle(int breadth,int length)
	{
		this.breadth = breadth;
		this.length = length;
	}
	double Area()
	{
		return 0.5*length*breadth;
	}
}

public class Abstract1 {
	public static void main(String[] args)
	{
		
		Shape[] s1 = new Shape[3];
		s1[0] = new Square(20);
		s1[1] = new Triangle(5,6);
		s1[2] = new Rectangle(6,7);
		for(Shape s : s1)
		{
			System.out.println("Area: "+(int)s.Area());
		}
	
		
	}

}
