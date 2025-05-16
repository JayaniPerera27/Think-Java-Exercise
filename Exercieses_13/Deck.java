package Exercieses_13;

import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Card[] getCards() {
        return this.cards;
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    public void shuffle() {
        for (int i = 0; i < this.cards.length; i++) {
            int randomIndex = randomInt(i, this.cards.length - 1);
            swapCards(i, randomIndex);
        }
    }

    private static int randomInt(int low, int high) {
        Random random = new Random();
        int range = high - low + 1;
        return low + random.nextInt(range);
    }

    private void swapCards(int i, int j) {
        Card temp = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < cards.length; i++) {
            int lowestIndex = indexLowest(i, cards.length - 1);
            swapCards(i, lowestIndex);
        }
    }

    private int indexLowest(int low, int high) {
        int lowestIndex = low;
        for (int j = low + 1; j <= high; j++) {
            if (cards[j].compareTo(cards[lowestIndex]) < 0) {
                lowestIndex = j;
            }
        }
        return lowestIndex;
    }
     //Merge sort implementation for a deck of cards.
    public Deck mergeSort() {
        if (this.cards.length < 2) {
            return this;
        }

        int mid = this.cards.length / 2;
        Deck deck1 = this.subdeck(0, mid - 1);
        Deck deck2 = this.subdeck(mid, this.cards.length - 1);

        deck1 = deck1.mergeSort();
        deck2 = deck2.mergeSort();


        return merge(deck1, deck2);
    }
     // "Almost" merge sort implementation that uses selection sort
    public Deck almostMergeSort() {
        if (this.cards.length < 2) {
            return this;
        }

        int mid = this.cards.length / 2;
        Deck deck1 = this.subdeck(0, mid - 1);
        Deck deck2 = this.subdeck(mid, this.cards.length - 1);

        deck1.selectionSort();
        deck2.selectionSort();

        return merge(deck1, deck2);
    }

     //Merges two sorted decks into a single sorted deck.
    private static Deck merge(Deck d1, Deck d2) {
        Deck result = new Deck(d1.cards.length + d2.cards.length);

        int i = 0;  // index for d1
        int j = 0;  // index for d2

        for (int k = 0; k < result.cards.length; k++) {
            if (i >= d1.cards.length) {
                result.cards[k] = d2.cards[j];
                j++;
            }
            else if (j >= d2.cards.length) {
                result.cards[k] = d1.cards[i];
                i++;
            }
            else if (d1.cards[i].compareTo(d2.cards[j]) < 0) {
                result.cards[k] = d1.cards[i];
                i++;
            }
            else {
                result.cards[k] = d2.cards[j];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();

        System.out.println("First 5 cards of shuffled deck:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.cards[i]);
        }

        Deck sortedDeck = deck.mergeSort();

        System.out.println("\nFirst 5 cards of sorted deck:");
        for (int i = 0; i < 5; i++) {
            System.out.println(sortedDeck.cards[i]);
        }

        System.out.println("\nLast 5 cards of sorted deck:");
        for (int i = sortedDeck.cards.length - 5; i < sortedDeck.cards.length; i++) {
            System.out.println(sortedDeck.cards[i]);
        }

        System.out.println("\nTesting merge with small decks:");
        Deck d1 = new Deck(3);
        d1.cards[0] = new Card(1, 0);  // Ace of Clubs
        d1.cards[1] = new Card(3, 0);  // 3 of Clubs
        d1.cards[2] = new Card(5, 0);  // 5 of Clubs

        Deck d2 = new Deck(2);
        d2.cards[0] = new Card(2, 0);  // 2 of Clubs
        d2.cards[1] = new Card(4, 0);  // 4 of Clubs

        System.out.println("Deck 1:");
        d1.print();
        System.out.println("Deck 2:");
        d2.print();

        Deck merged = merge(d1, d2);
        System.out.println("Merged deck:");
        merged.print();
    }
}

