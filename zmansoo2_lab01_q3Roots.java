package zmansoo2_1;

import java.util.Scanner;

public class zmansoo2_lab01_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// declaring variables
	double a , b , c , ans1, ans2;
	char option;
	
	// initializing Scanner
	Scanner scan = new Scanner(System.in);
		
	System.out.println("ES1036: Lab 01 Q3\n" + 
						"Date: 29/09/2018\n" + 
						"Name: Zayyed Mansoor\n" + 
						"Student Number: 251033356\n" + 
						"Program’s mission: This program calculates \n" + 
						"the roots of a quadrtic equation.\n");
	
	//loop
	
	do{
		// prompt for input a
	System.out.println("\n     Enter value for 'a'");
	System.out.println("     ax^2 + bx + c");
	System.out.println("     ^\n");
	
	a = scan.nextDouble();
	
	// prompt for input b
	System.out.println("Enter value for 'b'");
	System.out.println("     "+(int)a+"x^2 + bx + c");
	System.out.println("            ^\n");
	
	b = scan.nextDouble();
	
	// prompt for input c
	System.out.println("Enter value for 'c'");
	System.out.println("     "+(int)a+"x^2 + "+(int)b+"x + c");
	System.out.println("                 ^\n");
	
	c = scan.nextDouble();
	
	
	// checks if A is 0
	if(a==0) {
		//checks is B is 0
		if(b!=0) {
			
			ans1 = (-1*c)/b;
			
			// removes "-" from -0
			if(ans1==-0) {
				
				System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
				System.out.println("There is a single root at "+ -1*ans1);
			}
			else {
				System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
				System.out.println("There is a single root at "+ ans1);
			}
		}
		else {
			if(c==0) {
				System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
				System.out.println("There are infinate solutions");
			}
			else {
				System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
				System.out.println("There are no real roots");
			}
		}
	}
	
	else {
		// 2 real roots
		if(((Math.pow(b, 2)) -4*a*c)>=0) {
		
	ans1 = ((-1*b) + Math.sqrt((Math.pow(b, 2)) -4*a*c) )/(2*a);
	
	ans2 = ((-1*b) - Math.sqrt((Math.pow(b, 2)) -4*a*c) )/(2*a);
	
		System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
		System.out.println("\n   x1 = "+ans1 + " x2 = " + ans2);
		}
		// complex root calculations
		else {
			System.out.println("     "+(int)a+"^2 "+(int)b+"+x + "+(int)c);
			System.out.println(
					"There are 2 complex roots: x1 = "+((-1*b)/(2*a))+" + "
					+((Math.sqrt(Math.abs((Math.pow(b, 2)) -4*a*c)))/(2*a))+"i");
			
			System.out.println(
					"                           x2 = "+((-1*b)/(2*a))+" - "
			        +((Math.sqrt(Math.abs((Math.pow(b, 2)) -4*a*c)))/(2*a))+"i");
			
		}
		 }
	
			
	
	System.out.println("Would you like to compute to roots of another quadratic equation? (Y/N)");
	
	option = scan.next().charAt(0);
		
	}while(option!= 'N' || option!= 'n');
	
	scan.close();
	
		
		}
	
	
	}

	

	

