public class Card {
    public String suit;
    public int value;


    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }


    public String toString(){
        String name = " ";
        if (value == 1){
            name = "Ace of " + suit;
        }
        else if (value < 11){
            name = Integer.toString(value) + " of " + suit;
        } else if (value == 11) {
            name = "Jack of " + suit;
        } else if (value == 12) {
            name = "Queen of " + suit;
        } else if (value == 13){
            name = "King of " + suit;
        }
        return name;
    }
}
