package zmansoo2_3;
import java.util.Scanner;
import static java.lang.System.out;



public class zmansoo2_lab03_q3 {
	
	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	
	
		out.println("   Enter First Name");//prompt
		
			String fName = scan.nextLine(); // user input
		
		out.println("   Enter Last Name");//prompt
		
			String lName = scan.nextLine(); // user input
		
		out.println("   Enter Salary");//prompt
		
			int salary = scan.nextInt(); // user input
		
		Employee a = new Employee(fName,lName,salary); // makes new Employee object
		
		a.printInfo(); // uses class method to print employee information
		
		scan.close();
		
		
		
	}
	
   
	
    

}

class Employee {
	
	
    // class variables
	public String m_fName;
	public String m_lName;
	public int m_salary;
	
	
	public Employee(String fName, String lName, int salary)   // Constructor method
	{
		// Variables for object
		m_fName = fName;
		m_lName = lName;
		m_salary = salary;
		
		
	}
	
	public void printInfo()  // method
	{
		// Prints out variables of object
		out.println("\nEMPLOYEE INFOMRMATION");
		out.println("FIRST NAME: "+this.m_fName);
		out.println("LAST NAME: "+this.m_lName);
		out.println("SALARY: "+this.m_salary);
	}
}
