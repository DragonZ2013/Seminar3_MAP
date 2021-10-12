package Main;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Spielkarte card1 = new Spielkarte(FarbeEnum.HERZ,"5");
        Spielkarte card2 = new Spielkarte(FarbeEnum.KARO,"J");
        List<Spielkarte> card_deck = new ArrayList<>();
        card_deck.add(card1);
        card_deck.add(card2);

        for(Spielkarte c : card_deck){//??????
            System.out.println(c.getFarbe()+" "+c.getWert());
        }
        List<String> channel_list = new ArrayList<>(Arrays.asList("Channel1","Channel2","Channel3"));
        TV tv1 = new TV(channel_list);
        Remote remote1 = new Remote(tv1);
        remote1.channel_up();
        System.out.println(tv1.getCurrent());
        remote1.channel_up();
        //remote1.channel_up();//throws exception

    }
}
