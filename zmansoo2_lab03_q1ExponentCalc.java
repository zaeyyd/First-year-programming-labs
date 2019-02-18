package zmansoo2_3;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab03_q1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		// variables for computation
		double base;
		int power;
		
		out.println("Enter real number base");// prompt
		
		base = scan.nextDouble();// input for base
		
		
		out.println("Enter exponent");// prompt
		
		power = scan.nextInt();// input for power
		
		
		out.println(base+ " to the power of "+power+" is equal to "+computePower(base,power));// answer output
		
	
		scan.close();
		
		}
	
	public static double computePower ( double base , int power ) 
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
