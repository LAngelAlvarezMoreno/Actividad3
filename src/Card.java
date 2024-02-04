public class Card {
    private final Suit suit;
    private final String color;
    private final Rank value;

    public Card(Suit suit, String color, Rank value){
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + suit + ", " + color + ", " + value;
    }
}





