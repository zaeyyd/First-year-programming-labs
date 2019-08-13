package cs50;
import java.util.Scanner;
import static java.lang.System.out;

public class caesar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
		
		
		out.println("Enter key");
		
		String key = scan.nextLine();
		
		key = key.toLowerCase();
		
		out.println("Enter text");
	
		String text = scan.nextLine();
		
		StringBuilder cipher = new StringBuilder();
		
		
		
		for (int i = 0, j = 0; i<text.length() ; i++) {
			
			
			
			int keyletter = key.charAt(j%key.length())-97;
			
			
			
			if(text.charAt(i)>=65&&text.charAt(i)<=90)
			{
				
				cipher.append((char)(text.charAt(i)+keyletter));
				
				j++;
			}
			else if(text.charAt(i)>=97&&text.charAt(i)<=122)
			{
				cipher.append((char)(text.charAt(i)+keyletter));
				j++;
			}
			else
				cipher.append((text.charAt(i)));
		}

		out.println(cipher);
		
	}
		
	}

}
