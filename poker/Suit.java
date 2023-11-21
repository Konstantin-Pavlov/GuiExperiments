package poker;

public enum Suit {
   HEARTS("\u2660"),TILES("\u2665"), CLOVES("\u2666"), PIKES( "\u2663");
    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
