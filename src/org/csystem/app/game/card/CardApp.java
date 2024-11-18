package org.csystem.app.game.card;

import java.util.Random;
import java.util.Scanner;

public class CardApp {
    public static void main(String[] args)
    {
        getDeck();
    }

    public static void getCard()
    {
        Scanner kb = new Scanner(System.in);
        RandomCardGenerator randomCardGenerator = new RandomCardGenerator(new Random());

        System.out.print("How many card would you like?");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            System.out.println("-------------------------");
            Card card = randomCardGenerator.create();
            CardType cardType = card.getCardType();
            CardValue cardValue = card.getCardValue();

            System.out.println(card.toString());
            System.out.printf("Ordinal %s is %d%nOrdinal of %s is %d%n", cardType, cardType.ordinal(), cardValue, cardValue.ordinal());

            System.out.println("-------------------------");
        }
    }

    public static void getDeck()
    {
        for (Card card : Card.getDeck())
            System.out.println(card.toString());
    }
}
