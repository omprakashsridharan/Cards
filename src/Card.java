
public class Card {

	char pips;
	char suit;
	final String Suits="CDHS";
	final String Pips="23456789TJQKA";
	
	Card(char p, char s){
		this.pips=p;
		this.suit=s;
	}
	public char getPips(){
		return pips;
	}
	public char getSuits(){
		return suit;
	}
	
	public int compareSuit(char c1, char c2){
		return ((Suits.indexOf(c1))-Suits.indexOf(c2));
	}
	public int comparePips(char c1, char c2){
		return ((Pips.indexOf(c1))-Pips.indexOf(c2));
	}
}
