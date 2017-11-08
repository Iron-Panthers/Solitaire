
public class Card 
{
	private int numVal;
	private boolean isBlack;
	private int suit;//0-3,0=spade,1=club,2=diamond,3=heart
	
	public Card(int n, boolean iB,int s)
	{
		numVal=n;
		isBlack=iB;
		suit=s;
	}
	public int getVal()
	{
		return numVal;
	}
	public boolean getBlack()
	{
		return isBlack;
	}
	public int getSuit()
	{
		return suit;
	}
}
