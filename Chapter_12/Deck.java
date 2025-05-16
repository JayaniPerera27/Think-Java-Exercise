package Chapter_12;
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

    // Print all cards in the deck
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        for (int i = 0; i < this.cards.length; i++) {
            int randomIndex = randomInt(i, this.cards.length - 1);
            swapCards(i, randomIndex);
        }
    }
     //Helper method to generate a random integer between
    private static int randomInt(int low, int high) {
        Random random = new Random();
        int range = high - low + 1;
        return low + random.nextInt(range);
    }
      //Helper method to swap two cards in the deck.
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

    public static void main(String[] args) {

        Deck deck = new Deck();

        // Print first 5 cards before shuffling
        System.out.println("First 5 cards before shuffling:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.getCards()[i]);
        }

        deck.shuffle();

        // Print first 5 cards after shuffling
        System.out.println("\nFirst 5 cards after shuffling:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.getCards()[i]);
        }

        deck.selectionSort();

        System.out.println("\nFirst 5 cards after selection sort:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.getCards()[i]);
        }

    }
}
