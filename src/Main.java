import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        // pontoon
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many players are there?");
        int playerCount = Integer.parseInt(myScanner.nextLine());
        int cardNumber;
        boolean aces;
        // players
        // players
        int[] sums = new int[playerCount];
        Card[][] cards = new Card[1][53];
        for (int i = 0; i < playerCount; i++){
          // deal however many cards each player wants
          System.out.println("Player" + (i+1));
          System.out.println("How many cards do you want?");
          cardNumber = Integer.parseInt(myScanner.nextLine());
          cards = myDeck.deal(cardNumber, 1);
          // aces high or low
          System.out.println("Do you want aces to be high?");
          aces = Boolean.parseBoolean(myScanner.nextLine());
        // sum the value of these
          for (int j = 0; j < cards[0].length; j++){
            if (cards[0][j].getValue() == 1){
              if (aces == true){
                sums[i] += 11;
              }
              else{
                sums[i] += 1;
              }
            }else if(cards[0][j].getValue() >= 11){
              sums[i] += 10;
          }else{
              sums[i] += cards[0][1].getValue();
            }
        // repeat for each player
        }
        }
      // find the highest card in the array (that is under 21)
      int index = -1;
      int highest = -1;
      for (int i = 0; i < sums.length; i++){
        if (sums[i] > highest && sums[i] <= 21){
          index = i;
        }
      }
      // output the player that has won (i+1)
        System.out.println("Player " + (index+1) + " wins!");
        }
    }