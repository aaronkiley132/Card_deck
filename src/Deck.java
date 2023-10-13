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
                placeholder.setValue(j+1);
                placeholder.setSuit(suits[i]);
                deck[counter] = placeholder;
                counter++;
            }
        }
    }

    public void sortAlphabetically() { //bubble sort to sort the cards alphabetically
        String cardOne;
        String cardTwo;
        boolean swaps = true;
        int counter = 0;
        int comparison;
        while ((counter < size) && (swaps = true)) {
            for (int i = 0; i < ((size - 1) - counter); i++) {
              swaps = false;
              Card x = new Card(" ", 0);
              comparison = deck[i].getValue() - deck[i+1].getValue();
              if (comparison > 0){
                x = deck[i];
                deck[i] = deck[i+1];
                deck[i+1] = x;
                swaps = true;
              }
            }
          counter++;
        }
    }

  public void sortSuits(){
    this.sortAlphabetically();
    String cardOne;
    String cardTwo;
    boolean swaps = true;
    int counter = 0;
    int comparison;
    while ((counter < size) && (swaps = true)) {
        for (int i = 0; i < ((size - 1) - counter); i++) {
          swaps = false;
          Card x = new Card(" ", 0);
          cardOne = deck[i].getSuit();
          cardTwo = deck[i + 1].getSuit();
          comparison = cardOne.compareTo(cardTwo);
          if (comparison > 0){
            x = deck[i];
            deck[i] = deck[i+1];
            deck[i+1] = x;
            swaps = true;
          }
        }
      counter++;
    }
  }

    //returns a string of the deck
    public void displayDeck(){
        for (int i = 0; i < size; i++) {
            System.out.println(deck[i].toString());
        }
    }
}
