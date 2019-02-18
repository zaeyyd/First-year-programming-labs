package zmansoo2_5;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab05_q3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		
		char option = 0;
		double x1=0,x2=0,y1=0,y2=0,scale=1;
		
		out.println("Enter x1");
		
		x1 = scan.nextDouble();
		
		out.println("Enter y1");
		
		y1 = scan.nextDouble();
		
		out.println("Enter x2");
		
		x2 = scan.nextDouble();
		
		out.println("Enter y2");
		
		y2 = scan.nextDouble();
		
		
		Rectangle rec = new Rectangle(x1,y1,x2,y2);
		
		do {
			
			out.println("a: Scale");
			out.println("b: Print");
			out.println("c: Exit");
			
			option = scan.next().charAt(0);
			
			
		switch(option)
		{
		case 'a':
		{
			out.println("Enter Scale: ");
			scale = scan.nextDouble();
			rec.scale(scale);
			break;
		}
		case 'b':
		{
			rec.print();
			break;
			
			
		}
		case 'c':
		{
			out.println("Exited");
			break;
		}
		
		}

		}while(option!='c');
		
		scan.close();
			
	}

}


	class Rectangle
	{
		
		private double side1;
		private double side2;
		
		public Rectangle(double x1, double y1, double x2, double y2)
		{
			side1 = x2-x1;
			side2 = y2-y1;
			
			
		}
		public void scale(double scale)
		{
			
			side1 = side1*scale;
			side2 = side2*scale;
		}
		public void print()
		
		{
			for(int i = 0;i<side2;i++)     //------------------------LOOP FOR HEIGHT OR RECTANGLE-------------------
			{
				if(i==0||i==side2-1)   //-----CHECKS IF PREVIOUS LOOP IS ON TOP OR BOTTOM ROW OF RECTANGLE----------
				{
					for(int j = 0;j<side1;j++)  //-----------LOOP TO PRINT TOP AND BOTTOM ROW OF RECTANGLE----------
					{
						out.print("*");
					}
						out.println("");
				}
				else 
				{
					for(int j = 0;j<side1;j++)  	//-----LOOP TO PRINT MIDDLE SIDES OF RECTANGLE------------------
					{
						if(j==0||j==side1-1)
							{out.print("*");}  //-----PRINTS SIDE---------------------------
						else {
							out.print(" ");    //-----PRINTS EMPTY SPACE INSIDE RECTANGLE---
						}
					}
						out.println("");
				
				}
				
			}
			
		}
		
		
	}
