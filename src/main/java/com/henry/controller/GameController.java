package com.henry.controller;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import com.henry.model.Card;

public class GameController {
    
    static Deque<Card> _DECK  = new ArrayDeque<>();
    static Card[] _CLUBS = new Card[13];
    static Card[] _DIAMONDS = new Card[13];
    static Card[] _HEARTS = new Card[13];
    static Card[] _SPADES = new Card[13];
    
    static final double _PROBABILITY = .75;
    
    Deque<Card> _gameDeck  = new ArrayDeque<>();
    
    static
    {
        int idx = 0;
        for (Card.Rank rank : Card.Rank.values())
        {
            GameController._CLUBS[idx] = new Card(Card.Suite.CLUB, rank);
            GameController._DIAMONDS[idx] = new Card(Card.Suite.DIAMOND, rank);
            GameController._HEARTS[idx] = new Card(Card.Suite.HEART, rank);
            GameController._SPADES[idx] = new Card(Card.Suite.SPADE, rank);
            idx++;
        }
        
        GameController._DECK.addAll(Arrays.asList(_CLUBS));
        GameController._DECK.addAll(Arrays.asList(_DIAMONDS));
        GameController._DECK.addAll(Arrays.asList(_HEARTS));
        GameController._DECK.addAll(Arrays.asList(_SPADES));
 
    }
    
    public GameController() {
        this.shuffle();
    }

    public Card deal()
    {
        if (!_gameDeck.isEmpty()) {
            return _gameDeck.pop();            
        } else {
            return null;
        }
        
    }
    
    public void dealWeighted()
    {
        List<Card> weightedShuffledDeck = new ArrayList<Card>(52);
        List<Card> blackCards = new ArrayList<Card>(26);
        blackCards.addAll(Arrays.asList(GameController._CLUBS));
        blackCards.addAll(Arrays.asList(GameController._SPADES));
        
        List<Card> redCards = new ArrayList<Card>(26);
        redCards.addAll(Arrays.asList(GameController._DIAMONDS));
        redCards.addAll(Arrays.asList(GameController._HEARTS));
        
        
//        while (!_gameDeck.isEmpty()) {
//            Card c = this.deal();
//            if (c.getColor().name().equals(Card.Color.RED)) {
//                redCards.add(c);
//            } else {
//                blackCards.add(c);
//            } 
//        }
       
    }
    
    
    private void addCard(List<Card> weightedShuffledDeck, double weight)
    {
        
    }
    
    
    public void shuffle()
    {
        List<Card> shuffledDeck = new ArrayList<Card>(52);
        shuffledDeck.addAll(GameController._DECK);
        Collections.shuffle(shuffledDeck);
        _gameDeck.removeAll(GameController._DECK);
        _gameDeck.addAll(shuffledDeck);
    }
    
    public int getDeckSize()
    {
        return _gameDeck.size();
    }
    
    static class WeightedDeck 
    {
        double _probability = 0.0;
        Card _card;
        //1st card 100% probability of being black
        //2nd card 90%
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
        //11
        //12
        //13
        //14
        //15
        //3rd
        //3rd
        //3rd
        //3rd
        //3rd
        //3rd
        //3rd
        //3rd
        
        //26th card has 50%
        
        //52nd card 0% probability of being black
        
        
        
        
    }

}
