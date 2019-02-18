package zmansoo2_6;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab06_q1 {

	public static void main(String[] args) {
		

		ConsoleInput.getValidatedInteger (4 , 19);
		
		ConsoleInput.getValidatedDouble ( -34.6 , 85.1);
		
		ConsoleInput.getValidatedChar ('a','f');
		
		ConsoleInput.scan.close();  // closes scanner from ConsoleInput class methods

	}
	
	


static class ConsoleInput{
	
	static Scanner scan = new Scanner(System.in);    // static means that Scanner can be used anywhere in class
	static boolean loop = true;						// loop boolean for loops
	
	public static int getValidatedInteger(int minValue, int maxValue)
	
	{
				
		int input = 0;   // variable for user input
		
		while(loop)		//loop for user input in case of invalid entries
		{
		
		out.println("	ENTER VALUE BETWEEN "+minValue+" AND "+maxValue);  //prompt
		
		try {
			
			input = scan.nextInt();     //input
			
			if(input<minValue || input>maxValue)    //input range validation
			{
				out.println("Input not within range");
				
			}
			else
			{
				loop = false;  // while loop exit
			}
			
		}
		catch (Exception e)    // validation for input type
		{
			 out.println (" Invalid input , please try again .");
			 
			 	scan.nextLine();  // clears input buffer
		}
		}
		loop = true;	// makes loop true for reuse in other methods
		return input;	// returns validated input
		
		
		
	 
	}
	
	public static double getValidatedDouble(double minValue, double maxValue)
	
	{
		
				
		double input = 0;		// variable for user input
		
		while(loop)		//loop for user input in case of invalid entries
		{
		out.println("	ENTER VALUE BETWEEN "+minValue+" AND "+maxValue);  //prompt
		
			try {
			
			input = scan.nextDouble();   //input
			
				if(input<minValue || input>maxValue)    //input range validation
				{
				out.println("Input not within range");
				
				}
			else
				{
				loop = false;     //while loop exit
				}
			
		}
		catch (Exception e) 	// validation for input type
			
			{
				out.println (" Invalid input , please try again .");
				
			 	scan.nextLine();  //clears input buffer
			 	
		}
		
		
		
		}
		loop = true;    // makes loop true for reuse in other methods
		return input;   // returns validated input
		
	}
	
	public static char getValidatedChar(char minChar, char maxChar)
	
	{
		
				
		char input = 0;   //variable for user input
		
		
		while(loop)		//loop for input validation
		{
			out.println("	ENTER VALUE BETWEEN "+minChar+" AND "+maxChar);	    //input range validation
		
			try {
			
			input = scan.next().charAt(0);     //input
			
				if(input<minChar || input>maxChar)     //validation for input type
				{
				out.println("Input not within range");
				
				}
			else
				{
				loop = false;    // while loop exit
				}
			
		}
		catch (Exception e)    //validation  for user input type
			
			{
				out.println (" Invalid input , please try again .");
				
			 	scan.nextLine();  //clears input buffer
		}
		
		
		
		}
		loop = true;   //resets loop boolean for use in future method uses
		return input;	// returns validated input
		
	}
	
}
}
