package zmansoo2_2;
import  java.util.Scanner;
import static java.lang.System.out;


public class zmansoo2_lab02_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ES1036: Lab 02 Q3\n" + 
				"Date: 6/10/2018\n" + 
				"Name: Zayyed Mansoor\n" + 
				"Student Number: 251033356\n" + 
				"Program’s mission: This program calculates \n" + 
				"the factorial of an integer.\n");
		
		Scanner scan = new Scanner(System.in);
		
		
		int numb = 0,  
			product = 1;  // products of descending numbers 
		
		
		do {			
			
			// prompt
			out.println("Enter an Integer");
			
			numb = scan.nextInt();
			
			// input validation error message
			if(numb<0)
			{
				out.println("!! Please enter a value greater or equal to zero !!\n");
			}
			
		  // input validation loop
		}while(numb<0);
		
		//-------------FACTORIAL CALCULATION--------------
		
		for(int i = 0;i<(numb+1);i++)
		{
			product = ((numb+1)-i)*product; // finds factorial of (user input + 1)
		}
		
		product = product/(numb+1);         // divides factorial of (user input + 1) by (user input +1)
		
		
		out.println("\n"+numb+" factorial is equal to "+product+"\n");
		
		scan.close();
		
		
		
	}

}
