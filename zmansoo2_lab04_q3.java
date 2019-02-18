package zmansoo2_4;

public class zmansoo2_lab04_q3 {


public static void main(String[] args) {
	
	
	Square s = new Square (1);
	
	
	
	System . out . println (" The area of the square is: " +
	s . computeArea ());
	System . out . println (" The perimeter of the square is: " +
	s . computePerimeter ());
	

}
}

	
	abstract class Shape {
		
		protected int numberOfSides;        //------MEMBER VARIABLES
		protected double sideLength;       //------MEMBER VARIABLES
		
		
		protected abstract void setNumberOfSides(int num);
		protected abstract int getNumberOfSides();
		protected abstract void setSideLength(double length);
		protected abstract double getSideLength();
		
		public abstract double computeArea();
		public abstract double computePerimeter();

	}
	class Square extends Shape
	{
		
		public Square (double length) {
			
			sideLength = length;
			numberOfSides = 4;
			
		}
		
		protected void setNumberOfSides(int num) {
		
			
			numberOfSides = num;
			
		}
		
		protected void setSideLength(double length) {
			
			sideLength = length;
			
			
		}

		
		protected int getNumberOfSides() {
			
			return numberOfSides;
		}
		

		
		protected double getSideLength() {
			
			return sideLength;
			
		}

		
		public double computeArea() {
			
			double area;
			
			area = (sideLength)*(sideLength);
			
			return area;
			
			
		}

		
		public double computePerimeter() {
			
			double peri;
			
			peri = (getSideLength())*(getNumberOfSides());
			return peri;
			
			
		}
		
	}

