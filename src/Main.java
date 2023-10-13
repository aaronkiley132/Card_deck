public class Main {
    public static void main(String[] args) {
        Card cardOne = new Card("Hearts", 7);
        Card cardTwo = new Card("Hearts", 7);
        System.out.println(cardOne.compareTo(cardTwo));
        }
    }