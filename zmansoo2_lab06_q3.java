package zmansoo2_6;
import static java.lang.System.out;

public class zmansoo2_lab06_q3 {

	public static void main(String[] args) {
		
		Deck deck = new Deck ();
		deck . printCards ();		//prints deck
		

	}

}

class Card
{
	private int denomination;
	private char suit;
	
	public Card(int denominationIN, char suitIN) 		//constructor for cards
	{
		denomination = denominationIN;
		suit = suitIN;
		
		
		
	}
	public String face()			//method to return face of card
	{
		switch(denomination) {
		
		case 1:
			return (String)("A"+suit);
			
		case 11:
			return (String)("J"+suit);
			
		case 12:
			return (String)("Q"+suit);	
		
		case 13:
			return (String)("K"+suit);
			
		default:
			return (Integer.toString(denomination)+suit);
			
		}
		
		
	}

}

class Deck


{
	public Card cards[] = new Card[52];		//array to store card objects
	
	private char suits[] = new char[4];		//array to store suits
	
	private int denominations = 13;
	
	int cardNum = 0;	//variable for location of card in array
	
	public Deck()
	{
		suits[0] = 'S';
		suits[1] = 'H';
		suits[2] = 'C';
		suits[3] = 'D';
		
		for(int i =0;i<suits.length;i++)
		{
			for(int j = 1;j<=denominations;j++)
			{
				
				cards[cardNum] = new Card(j,suits[i]);	//creates card object based on suit and denomination	
				cardNum++;	//next location in array
			}
		}
		
		
	}
	public void printCards()
	{
		cardNum = 0;
		for(int i =0;i<4;i++)		//prints all SUITS
		{
			for(int j = 0;j<13;j++)	//prints all denominations
			{
				
				out.print(cards[cardNum].face()+ "!!!!");
				cardNum++;
			}
			out.println("");	//next line for next row of suits
		}
		
	}
}
