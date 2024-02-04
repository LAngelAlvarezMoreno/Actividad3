import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
                ExecuteProccess();
    }

    private static void ExecuteProccess()
    {
        try {
            Deck deck = new Deck();
            reader = new Scanner(System.in);
            PrintOptions();
            boolean inputExit = false;
            while (!inputExit) {
                switch (reader.nextInt()) {
                    case 1:
                        deck.shuffle();
                        break;
                    case 2:
                        Card getHead = deck.head();
                        if (getHead == null)
                            System.out.println("No hay cartas disponibles.");
                        break;
                    case 3:
                       ArrayList<Card> getHand = deck.Hand();
                       if (getHand == null)
                           System.out.println("No hay cartas suficientes.");
                        break;
                    case 4:
                       Card getPick = deck.Pick();
                       if (getPick == null)
                           System.out.println("No hay cartas disponibles.");
                        break;
                    case 5:
                        deck.getDeck();
                        break;
                    case 6:
                        inputExit = true;
                        break;
                    default:
                        System.out.println("Opción NO valida.");
                        PrintOptions();
                        break;
                }
            }
        }catch (Exception ex){
            ExecuteProccess();
        }
    }

    private static void PrintOptions() {
        System.out.println("************************************************");
        System.out.println("1: MEZCLAR");
        System.out.println("2: TOMAR UNA CARTA");
        System.out.println("3: MOSTRAR MANO");
        System.out.println("4: TOMAR CARTA AL AZAR");
        System.out.println("5: NUEVO MAZO");
        System.out.println("6: SALIR");
        System.out.println("************************************************");
    }
}

