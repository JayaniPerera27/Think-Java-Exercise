package Chapter_12;
import java.util.Arrays;

public class Card {
        private int rank;
        private int suit;

        public Card(int rank, int suit) {
            this.rank = rank;
            this.suit = suit;
        }

    /*public String toString() {
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }*/

    //using class variable
        public static final String[] RANKS = {
                null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"
        };
        public static final String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        public String toString() {
            return RANKS[this.rank] + " of " + SUITS[this.suit];
        }

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public static Card[] createDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }
    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;

        while (low <= high) {
            System.out.println(low + ", " + high);  // Trace statement
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);

            if (comp == 0) {
                return mid;
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        //Card card = new Card(11, 1);
        //System.out.println(card);

        Card[] deck = createDeck();

       // printDeck(deck);
        System.out.println();

        //System.out.println(Arrays.toString(deck));

        Card target = new Card(1, 3);  // Ace of Spades
        int index = search(deck, target);

        if (index >= 0) {
            System.out.println("Found at position " + index);
        } else {
            System.out.println("Not found");
        }

        Card card = new Card(1, 3);
        int cardnumber = binarySearch(deck, card);// Jack of Clubs
        System.out.println("index is " + cardnumber);
    }

}
