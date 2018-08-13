import java.util.ArrayList;
import java.util.List;

public class RummyDeck extends Deck {
    List<Card> rummyCards;

    public RummyDeck(int numOfPacks) {
        rummyCards = constructDeck(numOfPacks);
        System.out.println();
        rummyCards = shuffle(rummyCards);
        System.out.println();

    }

    @Override
    public List<Card> constructDeck(int numberOfPacks) {
        List<Card> cards = new ArrayList<>();
        for(int i=0;i<numberOfPacks;i++){
            Pack pack = new Pack("23456789TJKQA");
            cards.addAll(pack.getPack());
        }
        return cards;
    }

    @Override
    public List<Card> removeJokersFromDeck(int numberOfJokersToBeRemoved) {
        return rummyCards;
    }




}
