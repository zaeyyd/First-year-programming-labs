package zmansoo2_3;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab03_q2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char option; // variable for whether or not the user would like to repeat the program or not
		
	do  // loop for entire program
	{
			
			double arctan = 0;   // variable where answer is stored
			double realnumb = 0; // variable for user input
			double N = 100;      // variable to adjust precision of answer
			
			
		do  // loop for input validation --------------------------------------
		{
			
			out.println("Enter a real number (-1 to 1)"); //prompt
			
			realnumb = scan.nextDouble(); // input
		
		}while(realnumb<-1 || realnumb>1);// ----------------------------------
		
		
			for(int i = 0;i<N;i++)  // loop to compute ARCTAN
			{
			arctan = arctan+((computePower(-1, i)*(computePower(realnumb,(2*i)+1))/((2*i)+1)));
			}
		
				out.println(arctan);  // prints result
		
		
				out.println("Would you like to calculate another ArcTan? (Y/N)"); // prompt
		
				option = scan.next().charAt(0); //user input
		
	}while(option=='y'|| option=='Y');
		
		scan.close();
		
	}
		
		public static double computePower ( double base , double power )  // method to compute powers
		{
			double product = 1; // used to record each iteration of the base multiplied by itself
			String baseSign = "";   // used  to indicate if sign of base is negative or not
			
			if(power<0)
			{
				power = power*-1; // computes absolute value of power
				baseSign = "neg"; // makes  program  know power has a negative sign
			}
			
			
			for(int i = 0;i<power; i++)// loops number of times as per user input of "power" variable
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

}
