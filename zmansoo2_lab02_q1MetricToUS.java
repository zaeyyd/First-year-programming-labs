package zmansoo2_2;
import java.util.Scanner;

public class zmansoo2_lab02_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variable for menu selection
		int option = 1;
		
		// variables for conversion
		float numb1 = 0, numb2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ES1036: Lab 02 Q1\n" + 
				"Date: 6/10/2018\n" + 
				"Name: Zayyed Mansoor\n" + 
				"Student Number: 251033356\n" + 
				"Program’s mission: This program converts \n" + 
				"metric units to US units.\n");
		
		// Runs loop unless user wishes to EXIT by pressing 5
		while(option!=5){
		
			// menu options and imput prompt
			do {
		System.out.println("\nSelect a converter"
				+ "\n 1: Celsius to Farhenheit"
				+ "\n 2: Centimeters to Inches"
				+ "\n 3: Meters to Feet"
				+ "\n 4: Km/h to MPH"
				+ "\n 5: EXIT");
		
		option = scan.nextInt();
		
			//error message 
			if(option<1 || option>5)
			{
				System.out.println("Please enter a value 1 - 5");
			
			}
		
		// keeps user in loop until valid option is selected
		}while(option<1 || option>5);
		
		
		// Cases from menu
		switch (option)
		{
		case 1:
				System.out.println("Enter temperature in Celcius");
			
				numb1 = scan.nextFloat();
				
				numb2 = ((numb1 * 9/5) + 32);
			
				System.out.println(" \n"+numb1+"°C is equal to "+numb2+"°F");
			
			
			break;
		case 2:
				System.out.println("Enter length in centimeters");
			
				numb1 = scan.nextFloat();
			
				numb2 = (numb1 / (float)2.54);
							
				System.out.println(" \n"+numb1+"cm is equal to "+numb2+"inches");
			
			break;
		case 3:
				System.out.println("Enter length in Meters");
			
				numb1 = scan.nextFloat();
			
				numb2 = (numb1 * (float)3.281);
							
				System.out.println(" \n"+numb1+"m is equal to "+numb2+"feet");
			
			
			break;
		case 4:
				System.out.println("Enter speed in Km/h");
			
				numb1 = scan.nextFloat();
				
				numb2 = (numb1 / (float)1.609);
							
				System.out.println(" \n"+numb1+"Km/h is equal to "+numb2+"MPH");
				
			break;
		
		
		}
		}
		
		System.out.println("Program is now off");
		scan.close();
		
	}

}
