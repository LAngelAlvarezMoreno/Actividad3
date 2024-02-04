import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        createdDeck();
    }

    /**
     * metod para obtener un nuevo mazo
     * @return deck
     */
    public ArrayList<Card> getDeck(){
         createdDeck();
         System.out.println("mazo creado.");
         return deck;
    }


    /**
     * funcion para crear un nuevo mazo
     * 52 elementos de tipo carta.
     */
    private void createdDeck(){
        deck = new ArrayList<>();
        String[] Colors = {"RED","BLACK"};

        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                Card card = new Card(suit, Colors[new Random().nextInt(1)] , rank);
                deck.add(card);
            }
        }
    }

    /**
     * funcion para mezclar el mazo
     */
    public void shuffle(){
        Collections.shuffle(deck);
        System.out.println("deck shuffled.");
    }

    /**
     * función para mostrar la primera carta disponible.
     * verifica que el mazo tenga elementos suficientes.
     * @return card
     */
    public Card head() {
        Card card = null;

        if (!deck.isEmpty()) {
            card = deck.getFirst();
            deck.removeFirst();
            System.out.println("card taken: " + card);
            System.out.println(deck.size() + " cartas disponibles en el mazo.");
        }

        return card;
    }

    /**
     * funcion para tomar una carta random de las dispoibles.
     * verifica que el mazo tenga elementos suficientes.
     * @return card
     */
    public Card Pick(){
        Card card = null;
        if (!deck.isEmpty()) {
            int randomIndex = new Random().nextInt(deck.size());
            if (deck.size() > randomIndex) {
                card = deck.get(randomIndex);
                deck.remove(randomIndex);
                System.out.println("picked: " + card);
                System.out.println(deck.size() + " cartas disponibles en el mazo");
            }
        }
        return card;
    }

    /**
     * funcion para dar una mano de 5 cartas disponibles
     * verifica que el mazo tenga elementos suficientes
     * @return hand
     */
    public ArrayList<Card> Hand() {
        ArrayList<Card> hand = null;
        if (deck.size() >= 5) {
            hand = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                hand.add(deck.getFirst());
                deck.removeFirst();
            }

            for (Card card : hand) {
                System.out.println(card);
            }

            System.out.println(deck.size() + " cartas disponibles en el mazo.");
        }
        return hand;
    }
}

