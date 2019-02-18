package zmansoo2_5;
import static java.lang.System.out;

public class zmansoo2_lab05_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s = new Square (3.6);
		System . out . println (" The area of the square is: " +
		s . computeArea ());
		System . out . println (" The perimeter of the square is: " +
		s . computePerimeter ());
		
		
		Circle c = new Circle(2.1);
		System . out . println (" The area of the circle is: " +
				c . computeArea ());
				System . out . println (" The perimeter of the circle is: " +
				c . computePerimeter ());

	}

}
class Circle extends Shape
{
	public Circle(double radius)
	{
		super.setSideLength(radius);
		
	}
	
	public double computeArea()
	{
		super.computeArea();
		return ((Math.PI)*(Math.pow(super.getSideLength(), 2)));
	}
	public double computePerimeter()
	{
		super.computePerimeter();
		return (2*Math.PI*super.getSideLength());
		
	}

}
class Square extends Shape
{
	public Square(double sideLen)
	{
		setNumberOfSides(4);
		setSideLength(sideLen);
		
	}

	public double computeArea()
	{
		super.computeArea();
		return (getSideLength())*(getSideLength());
	}
	public double computePerimeter()
	{
		super.computePerimeter();
		return (getSideLength())*(getNumberOfSides());
	}
}
 

class Shape {
	
	
	
	private int numberOfSides;        //------MEMBER VARIABLES
	private double sideLength;       //------MEMBER VARIABLES
	
	
	protected void setNumberOfSides(int num)
	{
		numberOfSides = num;
	}
	protected int getNumberOfSides()
{
		return numberOfSides;
	}
	protected void setSideLength(double length)
{
		sideLength = length;
	}
	protected double getSideLength()
{
		return sideLength;
	}
	
	public double computeArea()
{
		out.println("Calling superclass computeArea");
		return 0;
	}
	public double computePerimeter()
{
		out.println("Calling superclass computePerimeter");
		return 0;
	}

}

