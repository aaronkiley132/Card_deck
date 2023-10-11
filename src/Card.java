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

    public void setValue(int v){
        this.value = v;
    }

    public void setSuit(String s){
        this.suit = s;
    }
}
