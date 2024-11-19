package org.csystem.app.game.card;

import java.util.Random;

public class Card {
    private static final int CARD_COUNT_OF_DECK = 52;
    private static final int DEFAULT_SHUFFLE_COUNT = 100;
    private CardType m_cardType;
    private CardValue m_cardValue;

    public static Card [] newDeck()
    {
        Card [] deck = new Card[CARD_COUNT_OF_DECK];
        int idx = 0;

        for (CardType cardType : CardType.values())
            for (CardValue cardValue : CardValue.values())
                deck[idx++] = new Card(cardType, cardValue);

        return deck;
    }

    private static void swap(Card [] cards, int i, int k)
    {
        Card temp = cards[i];
        cards[i] = cards[k];
        cards[k] = temp;
    }

    public static Card [] newShuffledDeck(Random random)
    {
        return newShuffledDeck(random, DEFAULT_SHUFFLE_COUNT);
    }

    public static Card [] newShuffledDeck(Random random, int count)
    {
        Card [] deck = newDeck();

        for (int i = 0; i < count; ++i) {
            swap(deck, random.nextInt(deck.length), random.nextInt(deck.length));
        }

        return deck;
    }

    public Card(CardType cardType, CardValue cardValue)
    {
        m_cardType = cardType;
        m_cardValue = cardValue;
    }

    public CardType getCardType()
    {
        return  m_cardType;
    }

    public void setCardType(CardType cardType)
    {
        m_cardType = cardType;
    }

    public CardValue getCardValue()
    {
        return m_cardValue;
    }

    public void setCardValue(CardValue cardValue)
    {
        m_cardValue = cardValue;
    }

    public String toString()
    {
        return "%s-%s".formatted(m_cardType.toString(), m_cardValue.toString());
    }
}
