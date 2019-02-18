package zmansoo2_6;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab06_q2 {

	public static void main(String[] args) {
		
		boolean loop = true;		// loop variable 
		
		while(loop)           //loop for validity of weights
		{
		int assignments;        // number of assignments to compute
		double FinalGrade=0;
		double weightSum=0;
		
		out.println("How many assignments to compute");
		
		assignments = ConsoleInput.getValidatedInteger(1, 100);   //input and validation for number of inputs
		
		double grade[] 	= new double[assignments];		//initialization for grade array size
		double weight[] = new double[assignments];		//initialization for weight array size
		
		for(int i =0;i<assignments;i++)		//loop to fill arrays with values
		{
			out.println("Enter grade");
			grade[i]=ConsoleInput.getValidatedDouble (0 , 100);
			
			out.println("Enter grade weight");
			weight[i]=ConsoleInput.getValidatedDouble(0, 1);
			
		
			weightSum = weightSum +weight[i];		//summation of weights
				
			
			
		}
		for(int k =0;k<assignments;k++)		//summation of grades with weight
		{
			FinalGrade = FinalGrade + (grade[k]*weight[k]);
			
		}
		
		
		
			
			if(weightSum==1)		//checks if weights add up to 1
			{
			out.println("Final grade is "+ FinalGrade);		// print Final grade
			loop = false;									// exit loop
			}
			else 		//if grade weights don't add up to 1, program is looped
			{
				out.println("Invalid weights. Sum of weights = "+ weightSum);
				
			}
		
			
			}
			
			
		
		}
		
		
		
		
		
		
		

	}



class ConsoleInput{
	
	static Scanner scan = new Scanner(System.in);

	
	public static int getValidatedInteger(int minValue, int maxValue)
	
	{
				boolean loop = true;		
		int input = 0;
		
		while(loop)
		{
		
		out.println("	ENTER VALUE BETWEEN "+minValue+" AND "+maxValue);
		
		try {
			
			input = scan.nextInt();
			
			if(input<minValue || input>maxValue)
			{
				out.println("Input not within range");
				
			}
			else
			{
				loop = false;
			}
			
		}
		catch (Exception e) {
			 out.println (" Invalid input , please try again .");
			 	scan.nextLine();
		}
		}
		
		return input;
		
		
		
	 
	}
	
	public static double getValidatedDouble(double minValue, double maxValue)
	
	{
		
		boolean loop = true;		
		double input = 0;
		
		while(loop)
		{
		out.println("	ENTER VALUE BETWEEN "+minValue+" AND "+maxValue);
		
			try {
			
			input = scan.nextDouble();
			
				if(input<minValue || input>maxValue)
				{
				out.println("Input not within range");
				
				}
			else
				{
				loop = false;
				}
			
		}
		catch (Exception e) {
				out.println (" Invalid input , please try again .");
			 	scan.nextLine();
		}
		
		
		
		}
		return input;
		
	}
	
	public static char getValidatedChar(char minChar, char maxChar)
	
	{
		
		boolean loop = true;		
		char input = 0;
		
		
		
		
		while(loop)
		{
			out.println("	ENTER VALUE BETWEEN "+minChar+" AND "+maxChar);	
		
			try {
			
			input = scan.next().charAt(0);
			
				if(input<minChar || input>maxChar)
				{
				out.println("Input not within range");
				
				}
			else
				{
				loop = false;
				}
			
		}
		catch (Exception e) {
				out.println (" Invalid input , please try again .");
			 	scan.nextLine();
		}
		
		
		
		}
		return input;
		
	}
	
}

