import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Deck {
    public abstract List<Card> constructDeck(int numberOfPacks);

    public List<Card> shuffle(List<Card> cards) {
        Random random = new Random();
        for ( int i = cards.size()-1; i >=0; i-- ) {
            int randomize = random.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i,cards.get(randomize));
            cards.set(randomize,temp);
        }
        return cards;
    }

    public abstract List<Card> removeJokersFromDeck(int numberOfJokersToBeRemoved);

    public Card drawFromDeck(List<Card> cards){
        return cards.remove(cards.size()-1);
    }
}
