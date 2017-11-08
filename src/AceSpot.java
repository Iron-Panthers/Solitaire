import java.util.ArrayList;

public class AceSpot extends CardSpots 
{
	public ArrayList<Card> cards=new ArrayList<Card>();
	public int suit;
	public AceSpot(int s)
	{
		super(true,false);
		suit=s;
	}
	public void addCards(Card a)
	{
		cards.add(a);
	}
}
