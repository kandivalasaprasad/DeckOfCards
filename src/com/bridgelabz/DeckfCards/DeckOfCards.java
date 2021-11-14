package com.bridgelabz.DeckfCards;

public class DeckOfCards {
	
	public static void main(String[] args) {
		String[] deck = new String[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		int count=0;
		// Initialize the deck
		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < ranks.length; j++) {

				deck[count] = suits[i] + "-" + ranks[j];
				count++;
			}
		}

		// shuffle the cards
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < deck.length; i++) {

				int randomIndex = (int) Math.floor(Math.random()*52);
				String temp = deck[i];
				deck[i] = deck[randomIndex];
				deck[randomIndex] = temp;
			}
		}

		for (int i = 0; i <deck.length; i++) {
			System.out.println(deck[i]);
		}
	}
}
