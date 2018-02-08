package com.henry.model;

public class Card {
    
    Suite _suite;
    Rank _rank;
    Double _blackCardProbabilityWeight;

    public static enum Color
    {
        RED,
        BLACK
    }
    
    public static enum Rank
    {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
        
        public static boolean isFace(Card card)
        {
            boolean face = false;
            
            Rank cardRank = card.getRank();
            
            if (cardRank.name().equals(JACK.name()) || 
                cardRank.name().equals(QUEEN.name()) || 
                cardRank.name().equals(KING.name()))
            {
                face = true;
            }
            
            return face;
            
        }
    }
    
    public static enum Suite
    {
        CLUB(Color.BLACK),
        DIAMOND(Color.RED),
        HEART(Color.RED),
        SPADE(Color.BLACK);
        
        public Color _color;
        
        Suite(Color color)
        {
          this._color = color;
        }
    }
    
    public Card(Suite suite, Rank rank)
    {
        this._rank = rank;
        this._suite = suite;
    }

    public Suite getSuite() {
        return _suite;
    }

    public Rank getRank() {
        return _rank;
    }

    public Color getColor() {
        return this.getSuite()._color;
    }

}
