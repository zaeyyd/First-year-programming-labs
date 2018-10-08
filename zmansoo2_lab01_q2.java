package zmansoo2_1;
import java.util.Scanner;


public class zmansoo2_lab01_q2 {

	public static void main(String[] args) {
		
		/*Write a program (according to the specifications below) that will convert a lowercase character
		input by the user to an uppercase character. */
		
		//initialize variable
		char character;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ES1036: Lab 01 Q2\n" + 
							"Date: 29/09/2018\n" + 
							"Name: Zayyed Mansoor\n" + 
							"Student Number: 251033356\n" + 
							"Program’s mission: This program converts \n" + 
							"lowercase letters to uppercase.\n");
		
		
		
		
		// prompt for user input
		System.out.println("Hey type some letter");
		
		
		// inputs first character from user
		character = scan.next().charAt(0);
		
		//  casts character into an int variables
		int x = (int)character;
		
		// subtracts 32 from int x and casts x into char
		character = (char)(x - 32);
		
		
		System.out.println(character);
		
		
		scan.close();
		
		
		
		
		
		
	
		
		}
		
		
		
		
		}
		
		
	
	



