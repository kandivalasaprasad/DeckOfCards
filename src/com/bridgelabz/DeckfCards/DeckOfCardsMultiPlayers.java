package com.bridgelabz.DeckfCards;

import java.util.Arrays;

public class DeckOfCardsMultiPlayers {
	String player1[][] = new String[1][9];
	String player2[][] = new String[1][9];
	String player3[][] = new String[1][9];
	String player4[][] = new String[1][9];

	public void destributeCards(String[] deck) {

		int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
		for (int i = 0; i < deck.length; i++) {
			if (p1 < 9 || p2 < 9 || p3 < 9 || p4 < 9) {
				if (i % 4 == 0) {
					player1[0][p1] = deck[i];
					p1++;
				} else if (i % 4 == 1) {
					player2[0][p2] = deck[i];
					p2++;
				} else if (i % 4 == 2) {
					player3[0][p3] = deck[i];
					p3++;
				} else if (i % 4 == 3) {
					player4[0][p4] = deck[i];
					p4++;
				}
			}
		}

		System.out.println("player 1 cards : ");
		for (int i = 0; i < player1[0].length; i++) {
			System.out.print(player1[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 2 cards : ");
		for (int i = 0; i < player2[0].length; i++) {
			System.out.print(player2[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 3 cards : ");
		for (int i = 0; i < player3[0].length; i++) {
			System.out.print(player3[0][i] + " ");
		}
		System.out.println();

		System.out.println("player 4 cards : ");
		for (int i = 0; i < player4[0].length; i++) {
			System.out.print(player4[0][i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] deck = new String[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int count = 0;
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

				int randomIndex = (int) Math.floor(Math.random() * 52);
				String temp = deck[i];
				deck[i] = deck[randomIndex];
				deck[randomIndex] = temp;
			}
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
		DeckOfCardsMultiPlayers deckOfCards = new DeckOfCardsMultiPlayers();
		deckOfCards.destributeCards(deck);
	}
}
