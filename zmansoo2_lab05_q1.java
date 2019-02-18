package zmansoo2_5;
import static java.lang.System.out;
import java.util.Scanner;



public class zmansoo2_lab05_q1 
{
	

	public static void main(String[] args) 
		{
		Scanner scan = new Scanner(System.in);
		
	
		print(3);
		print('f');
		print(4 > 3);
		print(9.81);
		print(" great ");
		
		scan.close();
		

		}

	public static void print(char a)
	{
		out.println("Char is "+a);
	}

	public static void print(int b)
	{
		out.println("Integer is "+b);
	}
	public static void print(String c)
	{
		out.println("String is "+c);
	}
	public static void print(double d)
	{
		out.println("double is "+d);
	}
	public static void print(boolean e)
	{
		out.println("boolean is "+e);
	}

}
