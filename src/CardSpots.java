import java.util.ArrayList;

public class CardSpots 
{
	public static ArrayList<Card> cards=new ArrayList<Card>();
	public boolean increasing;
	public boolean alternating;
	public CardSpots(boolean i, boolean a)
	{
		increasing=i;
		alternating=a;
	}
	public void removeCards(ArrayList<Card> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==cards.get(i))
			{
				cards.remove(i);
			}
		}
	}
	public ArrayList<Card> getCards()
	{
		return cards;
	}
	
}
