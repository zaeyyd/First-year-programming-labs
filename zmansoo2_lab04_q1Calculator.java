package zmansoo2_4;
import static java.lang.System.out;

import java.util.Scanner;



public class zmansoo2_lab04_q1 
{


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			char option = 0;    // variable for navigating calculator menu
		
	do{
		
		
			double base =0, radians =0, exp =0;              // VARIABLES FOR CALCULATOR
			int exponent =0, iterations =0, value = 0;       // VARIABLES FOR CALCULATOR
		
			
			
			option = displayMenu();     // DISPLAYS MENU
			
		switch(option) {
		
			case'a':           //---------------------POWER FUNCTION----------------
			{
				out.println("input base");
				base = scan.nextDouble();
			
				out.println("input exponent");
				exponent = scan.nextInt();
			
			
				out.println(base+"^"+exponent+ " = "+Calculator.power(base, exponent));
				break;
				
			}
		
			case'b':           //---------------SINE FUNCTION-----------------------
			{
			
				out.println("input radians");
				radians = scan.nextDouble();
								
				out.println("input number of iterations for accuracy");
				iterations = scan.nextInt();
				
				out.println(Calculator.sine(radians,iterations));
				break;
			}
		
		
			case'c':
			{
				radians = 0;
			
				do  // loop for input validation 
				{
				
				out.println("input radians (-1 to 1)"); //prompt
				
				radians = scan.nextDouble(); // input
			
				}while(radians<-1 || radians>1);// --------------INVERSE TANGENT------------------
			
				out.println("input number of iterations for accuracy");
			
			
				iterations = scan.nextInt();
			
				out.print(Calculator.inverseTangent(radians, iterations));
				break;
			
			}
		
			case'd':                 //------------------EXPONENTIAL FUNCTION---------------
			{
				out.println("input number for exponential");
				exp = scan.nextDouble();
				
				out.println("input number of iterations for accruacy");
				iterations = scan.nextInt();
				
				out.println(Calculator.exponential(exp,iterations));
				break;
			}
			
			case'e':
			{
				out.println("input value");
				value = scan.nextInt();
				
				out.println(Calculator.factorial(value));
				break;
				
			}
			
			case'f':
			{
			out.println("Calculator off");
			
			break;
			}
		
		
		}
		
		
				

	}while(option!=102);
	
	scan.close();
	
	}
	

	private static char displayMenu()
	{
		Scanner scan = new Scanner(System.in);
		
		char option  =0; // variable to store displayMenu() return value
		
		do {
		out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		out.println("+_+_+_+_+_+_+_+_CALCULATOR+_+_+_+_+_+_+_+_");
		out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		out.println("+_        a. Power Function             +_");
		out.println("+_        b. Sine Function              +_");
		out.println("+_        c. Inverse Tangent Function   +_");
		out.println("+_        d. Exponential Function       +_");
		out.println("+_        e. Factorial Function         +_");
		out.println("+_        f. Exit                       +_");
		out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		
		out.println("\nSelect an option");
		
		option = scan.next().charAt(0);
		
	
		}while(option<97||option>102);
		
		scan.close();
		return option;
		
		
		
	}
	
static class Calculator {
		
		
		
		public static double power ( double base , int exponent )  // method to compute powers
		{
			double product = 1; // used to record each iteration of the base multiplied by itself
			String baseSign = "";   // used  to indicate if sign of base is negative or not
			
			if(exponent<0)
			{
				exponent = exponent*-1; // computes absolute value of power
				baseSign = "neg"; // makes  program  know power has a negative sign
			}
			
			
			for(int i = 0;i<exponent; i++)// loops number of times as per user input of "power" variable
			{
				product = base*product;  // multiplies base by previous product
			}
			
			
			
			if(baseSign.equals("neg")) 
			{
				return 1/product; // if base sign is negative, computed power is reciprocated
				
			}
			else
			{
				return product;  // returns computed power
			}
		}


		public static double inverseTangent ( double radians , int iterations )
		{

			double arctan = 0;   // variable where answer is stored
		
		
			for(int i = 0;i<iterations;i++)  // loop to compute ARCTAN
			{
			arctan = arctan+((power(-1, i)*(power(radians,(2*i)+1))/((2*i)+1)));
			}
		
				return(arctan);  // returns result
		
		}
		
		public static double sine ( double radians , int iterations )
		{
			double sin = 0;
			
			for(int i = 0; i<=iterations;i++)
			{
				sin = sin+(((power(-1,i))*power(radians,((2*i)+1)))/(factorial((2*i)+1)));
				
			}
			
			return sin;
		}

		
		public static double exponential ( double exp , int iterations )
		{
			double exponential = 0;
			
			for(int i = 0;i<=iterations;i++)
			{
			exponential = exponential+((power(exp,i))/(factorial(i)));
			
				
			}
			
			return exponential;
			
		}
		public static double factorial ( int value )
		{
			double factorial = 1;
			
			for(int i = 0;i<(value+1);i++)
			{
				factorial = ((value+1)-i)*factorial; // finds factorial of (user input + 1)
			}
			
			factorial = factorial/(value+1); // divides factorial of (user input + 1) by (user input +1)
			
			return factorial;
			
		}
	}




}


