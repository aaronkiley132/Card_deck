public class Deck {

    private Card[] deck;
    public String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private int size = 52;
    private int suitSize = size / 4;

    public Deck() {
        deck = new Card[size];
        Card placeholder = new Card("", 0);
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < suitSize; j++) {
                placeholder.value = j + 1;
                placeholder.suit = suits[i];
            }
        }
    }

    public void sortAlphabetically() { //bubble sort to sort the cards alphabetically
        String cardOne;
        String cardTwo;
        Card x = new Card(" ", 0);
        boolean swaps = true;
        int counter = 0;
        while ((counter < size) && (swaps = true)) {
            for (int i = 0; i < (size - 1 - counter); i++) {
                cardOne = deck[i].toString();
                cardTwo = deck[i + 1].toString();
                if (String.compareTo(cardOne, cardTwo)){

                }
            }
        }
    }
}
