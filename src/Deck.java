public class Deck {

    private Card[] deck;
    public String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private int size = 52;
    private int suitSize = 13;

    public Deck() {
        deck = new Card[size];
        int counter = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                Card placeholder = new Card("Clubs", 12);
                placeholder.value = j + 1;
                placeholder.suit = suits[i];
                deck[counter] = placeholder;
                counter++;
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
                //if (String.compareTo(cardOne, cardTwo)){

                //}
            }
        }
    }

    //returns a string of the deck
    public void displayDeck(){
        for (int i = 0; i < size; i++) {
            System.out.println(deck[i].toString());
        }
    }
}
