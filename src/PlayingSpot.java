import java.util.ArrayList;

public class PlayingSpot extends CardSpots 
{
	public ArrayList<Card> cards=new ArrayList<Card>();
	public PlayingSpot()
	{
		super(false,true);
	}
	public void addCards(ArrayList<Card> a)
	{
		for(int i=0;i<a.size();i++)
		{
			cards.add(0, a.get(i));
		}
	}
}
