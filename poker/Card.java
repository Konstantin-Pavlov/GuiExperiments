package poker;

public  class Card {

    private Suit suit; // масть
    private String rank; // ранг  или значение карты

    public Card(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + this.suit.getSuit();
    }
}
