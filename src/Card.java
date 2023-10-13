public class Card {
    private String suit;
    private int value;


    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }


    public String toString(){
        String name = " ";
        if (this.value == 1){
            name = "Ace of " + suit;
        }
        else if (this.value < 11){
            name = Integer.toString(value) + " of " + suit;
        } else if (this.value == 11) {
            name = "Jack of " + suit;
        } else if (this.value == 12) {
            name = "Queen of " + suit;
        } else if (this.value == 13){
            name = "King of " + this.suit;
        }
        return name;
    }

    // compares card values
    public int compareTo(Card cardTwo){
      int comparison = this.value - cardTwo.value;
      if (comparison == 0){
        int comparisonTwo = this.suit.compareTo(cardTwo.suit);
        if (comparisonTwo > 0){
          return 1; // one means that the first card is greater than the second
        }
        else if (comparisonTwo < 0){
          return -1;
        }
        else{
          return 0; //they are the same card
        }
      }
    else if (comparison >= 1){
      return 1; // one means that the first card is greater than the second
    }
    else if (comparison < 0){
      return -1; // minus one means that the second card is greater
    }
      else{
        return 0; // the same card
      }
    }

    //getters
    public int getValue(){
      return this.value;
    }

    public String getSuit(){
      return this.suit;
    }
  
    // setters
    public void setValue(int v){
        this.value = v;
    }

    public void setSuit(String s){
        this.suit = s;
    }
}
