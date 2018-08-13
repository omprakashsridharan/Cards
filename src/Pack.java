import java.util.ArrayList;
import java.util.List;

public class Pack {
    List<Card> cards;
    String PIP;
    String SUITS = "CDHS";

    public Pack(String PIP) {
        this.PIP = PIP;
    }

    public List<Card> getPack(){
        cards = new ArrayList<>();
        for(char suitChar: SUITS.toCharArray()){
            for(char pipChar: PIP.toCharArray() ){
                cards.add(new Card(suitChar,pipChar,PIP.indexOf(pipChar)));
            }
        }
        cards.add(new Card('*','*',13));
        cards.add(new Card('*','*',13));
        return cards;
    }
}
