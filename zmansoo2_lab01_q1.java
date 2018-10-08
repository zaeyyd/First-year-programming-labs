/**
 * 
 */
package zmansoo2_1;
import java.util.Scanner;

/**
 * @author zayyed
 *
 */
public class zmansoo2_lab01_q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring float variables
		float mark1, mark2, mark3, mark4;  
		float weight1, weight2, weight3, weight4;
		float grade;
		
		// declaring scanner 
		Scanner scan =  new Scanner(System.in);
		
		
		System.out.println("ES1036: Lab 01 Q1\n" + 
							"Date: 29/09/2018\n" + 
							"Name: Zayyed Mansoor\n" + 
							"Student Number: 251033356\n" + 
							"Program’s mission: This program calculates \n" + 
							"a course grade with weights.\n");
		
		
		// prompts for marks and weights
		System.out.println("Give me your first project's mark(%)");
		mark1 = scan.nextFloat();
		System.out.println("Now the weight(%)");
		weight1 = scan.nextFloat();
		weight1 *= 0.01;
		
		System.out.println("Give me your second project's mark(%)");
		mark2 = scan.nextFloat();
		System.out.println("Now the weight(%)");
		weight2 = scan.nextFloat();
		weight2 *= 0.01;
		
		System.out.println("Give me your third project's mark(%)");
		mark3 = scan.nextFloat();
		System.out.println("Now the weight(%)");
		weight3 = scan.nextFloat();
		weight3 *= 0.01;
		
		System.out.println("Give me your forth project's mark(%)");
		mark4 = scan.nextFloat();
		System.out.println("Now the weight(%)");
		weight4 = scan.nextFloat();
		weight4 *= 0.01;
		
		//Calculates grade with marks and weights
		grade = (mark1*weight1)+(mark2*weight2)+(mark3*weight3)+(mark4*weight4);
		
		//returns calculated grade
		if(grade>=80) {
			System.out.print("You got " + grade + "% smart guy/gal!!" );
		}
			else {
				System.out.print("You got "+ grade + ", I would recommend doing homework more often");
			
		}
		
	//closes scanner	
	scan.close();
	
	}

}
