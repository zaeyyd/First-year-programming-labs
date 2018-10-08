package zmansoo2_2;
import static java.lang.System.out;
import java.util.Scanner;

public class zmansoo2_lab02_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variable for repeating program from the beginning
		char option;
		
		Scanner scan = new Scanner(System.in);
		
		
	do{	
		// initialize all variables
		int 
			intcount = 0, 
			newNumber = 0, // new input for every iteration
			max = 0,       
			min = 0,
			even = 0,
			odd = 0;
		
		float
			mean = 0 ,
			sum = 0;
		
		
		
		out.println("ES1036: Lab 02 Q2\n" + 
				"Date: 6/10/2018\n" + 
				"Name: Zayyed Mansoor\n" + 
				"Student Number: 251033356\n" + 
				"Program’s mission: This program calculates \n" + 
				"statistics of a set of entered numbers.\n");
	
		// prompt
		out.println("How many integers would you like enter");
		
		intcount = scan.nextInt();
		
		// input validation
		
		while(intcount<1) 
		    {
			
			out.println("Please enter a value greater than 0");
			intcount = scan.nextInt();
			
			}
		
		// loop for number of inputs selected by user
		 for(int i = 1; i<(intcount+1);i++) 
		 {
			 			 
			 out.println("Enter value: "+ (i));
			 
			 newNumber = scan.nextInt();
			 
	//-------------MEAN CALCULATION-------------- 		 	 
			 
			 sum = newNumber+sum;
			 
			 mean = sum/i;
			 
						 
	//-------MAX & MIN NUMBER CALCULATION--------
			 	
			 	// makes MIN AND MAX equal to input for FIRST ITERATION
			 	if(i==1) 
			 	{				 
				 max = newNumber;
				 min = newNumber;
			 	}
			 	
			 if(newNumber >= max)
			 {
				 max = newNumber;
				 
			 }
			 if(newNumber <= min)
			 {
				 
				 min = newNumber;
			 }
			 
	//-------- EVEN AND ODD NUMBER COUNT----------
			 
			 if(newNumber%2== 0)
			 {
				 even+= 1;
			 }
			 else 
			 {
				 odd+= 1;
				 
			 }
			 
			 			 
			 out.println("\nMean of "+i+" input(s): "+ mean);
			 out.println("\nLargest number:     "+ max);
			 out.println("\nSmallest number:    "+ min);
			 out.println("\nEven number count:  "+ even);
			 out.println("\nOdd number count:   "+ odd);
			 out.println("\n");
			 
			 
			 
		 }
		 
		 out.println("Would you like to calculate statistics of a new set of numbers? (Y/N)");
		 
		 option = scan.next().charAt(0);
			
	}while(option!= 'N' || option!= 'n');
	
	out.println("k bye");
	
	scan.close();
			 
		

	}

}
