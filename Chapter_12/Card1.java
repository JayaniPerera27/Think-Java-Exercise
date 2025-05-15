package Chapter_12;

public class Card1 {
    private int rank;
    private int suit;

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"
    };

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    public Card1(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public static Card[] makeDeck() {
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

    public static void main(String[] args) {

        Card[] deck = makeDeck();


        for (Card card : deck) {
            System.out.println(card);
        }

    }
}
