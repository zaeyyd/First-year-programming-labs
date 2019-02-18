package zmansoo2_4;
import java.util.Scanner;
import static java.lang.System.out;


public class zmansoo2_lab04_q2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		char optionGAME = ' ';
		
		do {
		
		StringBuilder wd = new StringBuilder("");
		String word = "", 	GW;
		char   GL       ,   optionWL;
		
		
		out.println("                             HANG MAN             ");
		out.println("ENTER WORD");
		
		word = scan.nextLine();
		
		for(int k = 0;k<24;k++)		
		{
		out.println("\n");
		}
		
		for(int i = 0;i<word.length();i++)		
		{
			if(word.charAt(i)==' ')
			{
				wd.append('_');
			}
			else
				wd.append("*");
			
		}
		
			boolean WIN = false;
			int j = 0;
			
			while(j<10&&WIN==false)
			{
		
			out.println(wd);
			out.println(10-j+ " Tries left");
			out.println("\n");
			
			
			
			do {
				out.println("Guess letter or word? (l/w)");
				optionWL = scan.next().charAt(0);
				
			}while(optionWL!='w'&&optionWL!='l');
			
			switch(optionWL)
			{
			case'l':
				
				do {
					
				out.println("ENTER LETTER");
				
				GL = scan.next().charAt(0);
				
				}while(GL==' ');
				
				if(checkLETTER(GL,word)==true)
				{
					changeLETTER(GL,wd,word);
					if(wd.toString().equals(word))
						{
						out.println(wd);
						WIN=true;
						}
				}
				else
				{
					out.println("INCORRECT");
					j++;	
				}
				break;
				
			case'w':
			
				do {
					
					out.println("ENTER WORD");
					
					scan.nextLine();
					GW = scan.nextLine();
					
					}while(GW==" ");
				
				
				if(GW.equals(word)) 
				{
					out.println(wd.replace(0, word.length(), word));
					WIN = true;
				}
				else
				{
					out.println("INCORRECT");
					j++;	
				}
				
				break;
				}
			
			
			}
			
			if(WIN==true)
			{
				out.println("YOU WIN (play again? (y/n))");
				do {
					out.println("play again? (y/n)");
					optionGAME = scan.next().charAt(0);
					
				}while(optionGAME=='y'||optionGAME=='n');
				
			}
			else
			{
				out.println("YOU LOSE (play again? (y/n))");
				do {
					out.println("play again? (y/n)");
					optionGAME = scan.next().charAt(0);
					
				}while(optionGAME=='y'||optionGAME=='n');
			}
		
		}while(optionGAME=='y');
		
		out.println("GO WORK NOW");
		scan.close();
		
	}


	static boolean checkLETTER(char Gletter, String word)
	{
		if(word.indexOf(Gletter)!=-1)
		{
			return true;
			
		}
		else
			return false;
	}
	
	static void changeLETTER(char GL , StringBuilder wd , String word)
	{
		int index = 0;
		
		
		do{
			
			index = word.indexOf(GL, index);
			
			
			if(index!=-1)
			wd.replace(index, index+1, Character.toString(GL));
			
			
			index++;
			
		}while(index!=0);
		
	}
	
}
	
