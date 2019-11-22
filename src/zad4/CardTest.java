package zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
        List<Card> cards = generateCards();
        Scanner input = new Scanner(System.in);
        System.out.println("wprowadz język");
        String languageStr = input.nextLine();
        Language language = Language.valueOf(languageStr);
        input.close();

        switch (language){
            case PL:
                for(Card card : cards){
                    System.out.println(card.getPlTranslation());
                }
                break;
            case EN:
                for (Card card : cards){
                    System.out.println(card.getEnTranslation());
                }
                break;
                default:
                    System.out.println("nieznany język");
        }
    }

    private static List<Card> generateCards() {
        List<Card> cards = new ArrayList<>();

        for(CardColor color : CardColor.values()){
            for(CardValue value : CardValue.values()){
                cards.add(new Card(color, value));
            }
        }
        return cards;
    }
}
