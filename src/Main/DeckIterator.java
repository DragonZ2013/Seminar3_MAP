package Main;

import java.util.Iterator;

public class DeckIterator implements Iterator<Spielkarte> {

    private Deck deck;
    private int cursor;
    public DeckIterator(Deck deck){
        this.deck=deck;
        this.cursor=0;
    }
    @Override
    public boolean hasNext() {
        if (this.cursor>this.deck.getCard_deck().size())
            return false;
        return true;
    }

    @Override
    public Spielkarte next() {//???????????????????????
        /*if(hasNext()){
            Spielkarte next_card = this.deck.getCard_deck().get(this.cursor);

            //cursor++;
            return next_card;
        }*/

        return null;
    }
}
