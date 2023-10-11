public class Main {
    public static void main(String[] args) {
        Card cardOne = new Card("Hearts", 7);
        Deck myDeck = new Deck();
        myDeck.displayDeck();

        myDeck.sortAlphabetically();
        }
    }