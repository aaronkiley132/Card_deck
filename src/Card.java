public class Card {
    private String suit;
    private int value;


    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }


    public String toString(){
        String name;
        name = Integer.toString(value) + ” “ + suit;
        return name;
    }
}
