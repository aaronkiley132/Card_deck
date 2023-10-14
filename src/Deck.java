import java.util.Random;

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
        while ((counter < size) && (swaps = true)) {
            for (int i = 0; i < ((size - 1) - counter); i++) {
              swaps = false;
              Card x = new Card(" ", 0);
              if (deck[i].compareTo(deck[i+1]) > 0){
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

  public void shuffle(){
    Random rand = new Random();

    for (int i = 0; i < size; i++) {
      Card x = new Card("", 0);
      int randomIndexToSwap = rand.nextInt(size);
      x = deck[randomIndexToSwap];
      deck[randomIndexToSwap] = deck[i];
      deck[i] = x;
    }
  }

  //deals a hand of x to y players
  public Card[][] deal(int hand, int players){
    Card[][] output = new Card[players][hand];
    this.shuffle();
    int counter = 0;
    for (int i = 0; i < hand; i++){
      for (int j = 0; j < players; j++){
        output[j][i] = deck[counter];
        counter++;
      }
    }

    // display hands
    for (int i = 0; i < players; i++){
      //System.out.println("Player " + (i + 1) + ":");
      for (int j = 0; j < hand; j++){
        System.out.print(output[i][j].toString() + ", ");
      }
      System.out.println("\n");
    }
    return output; 
  }


    //returns a string of the deck
    public void displayDeck(){
        for (int i = 0; i < size; i++) {
            System.out.println(deck[i].toString());
        }
    }
}
