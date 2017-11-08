
public class Game 
{
	public Game()
	{
		//Ace Spots
				AceSpot hearts=new AceSpot(3);
				AceSpot diamonds=new AceSpot(2);
				AceSpot clubs=new AceSpot(1);
				AceSpot spades=new AceSpot(0);
				//Playing Spots
				PlayingSpot a=new PlayingSpot();
				PlayingSpot b=new PlayingSpot();
				PlayingSpot c=new PlayingSpot();
				PlayingSpot d=new PlayingSpot();
				PlayingSpot e=new PlayingSpot();
				PlayingSpot f=new PlayingSpot();
				PlayingSpot g=new PlayingSpot();
				//Heart Cards
				Card h1=new Card(1,false,3);
				Card h2=new Card(2,false,3);
				Card h3=new Card(3,false,3);
				Card h4=new Card(4,false,3);
				Card h5=new Card(5,false,3);
				Card h6=new Card(6,false,3);
				Card h7=new Card(7,false,3);
				Card h8=new Card(8,false,3);
				Card h9=new Card(9,false,3);
				Card h10=new Card(10,false,3);
				Card h11=new Card(11,false,3);
				Card h12=new Card(12,false,3);
				Card h13=new Card(13,false,3);
				//Diamond Cards
				Card d1=new Card(1,false,2);
				Card d2=new Card(2,false,2);
				Card d3=new Card(3,false,2);
				Card d4=new Card(4,false,2);
				Card d5=new Card(5,false,2);
				Card d6=new Card(6,false,2);
				Card d7=new Card(7,false,2);
				Card d8=new Card(8,false,2);
				Card d9=new Card(9,false,2);
				Card d10=new Card(10,false,2);
				Card d11=new Card(11,false,2);
				Card d12=new Card(12,false,2);
				Card d13=new Card(13,false,2);
				//Club Cards
				Card c1=new Card(1,true,1);
				Card c2=new Card(2,true,1);
				Card c3=new Card(3,true,1);
				Card c4=new Card(4,true,1);
				Card c5=new Card(5,true,1);
				Card c6=new Card(6,true,1);
				Card c7=new Card(7,true,1);
				Card c8=new Card(8,true,1);
				Card c9=new Card(9,true,1);
				Card c10=new Card(10,true,1);
				Card c11=new Card(11,true,1);
				Card c12=new Card(12,true,1);
				Card c13=new Card(13,true,1);
				//Spade Cards
				Card s1=new Card(1,true,0);
				Card s2=new Card(2,true,0);
				Card s3=new Card(3,true,0);
				Card s4=new Card(4,true,0);
				Card s5=new Card(5,true,0);
				Card s6=new Card(6,true,0);
				Card s7=new Card(7,true,0);
				Card s8=new Card(8,true,0);
				Card s9=new Card(9,true,0);
				Card s10=new Card(10,true,0);
				Card s11=new Card(11,true,0);
				Card s12=new Card(12,true,0);
				Card s13=new Card(13,true,0);
	}
}
