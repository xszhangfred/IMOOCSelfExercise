import java.util.*;

/**
 * Created by xuesong on 9/14/15.
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("---------------Here is the cards!----------------");
        ArrayList<Card> cardsList = new ArrayList<>();
        ArrayList<Card> cardsWashList = new ArrayList<>();
        //HashSet<String> cardsSet = new HashSet<>();

        String[] allCardType = new String[4];
        allCardType[0] = "Spade";
        allCardType[1] = "Heart";
        allCardType[2] = "Diamond";
        allCardType[3] = "Club";

        String[] allCardNumber = new String[13];
        allCardNumber[0] = "2";
        allCardNumber[1] = "3";
        allCardNumber[2] = "4";
        allCardNumber[3] = "5";
        allCardNumber[4] = "6";
        allCardNumber[5] = "7";
        allCardNumber[6] = "8";
        allCardNumber[7] = "9";
        allCardNumber[8] = "10";
        allCardNumber[9] = "J";
        allCardNumber[10] = "Q";
        allCardNumber[11] = "K";
        allCardNumber[12] = "A";

        Card[] CardArray = new Card[52];

        for(int i = 0; i < 52; i++) {
            CardArray[i] = new Card();
        }

        int i = 0;
        for(String cardType: allCardType){
            for(String cardNumber: allCardNumber){
                CardArray[i].cardType = cardType;
                CardArray[i].cardNumber = cardNumber;
                cardsList.add(CardArray[i]);
                i++;
            }
        }


        System.out.print(cardsList.toString());
        System.out.println();

        System.out.println("--------------Wash the Card!----------------");

        while(true) {
            if (cardsWashList.size() == 52) {
                break;
            }
            int j = (int) (Math.random()*52);
            if(!cardsWashList.contains(cardsList.get(j))) {
                cardsWashList.add(cardsList.get(j));
            }
        }

        System.out.println(cardsWashList);

        System.out.println("Enter Player 1 ID:");

        Scanner consoleId = new Scanner(System.in);
        int player1ID = consoleId.nextInt();
        Player player1 = new Player();
        player1.setId(player1ID);

        System.out.println("Enter Player 1 Name:");

        Scanner consoleName = new Scanner(System.in);
        String player1Name = consoleName.next();
        player1.setName(player1Name);

        System.out.println("Enter Player 2 ID:");

        Scanner consoleId2 = new Scanner(System.in);
        int player2ID = consoleId2.nextInt();
        Player player2 = new Player();
        player2.setId(player2ID);

        System.out.println("Enter Player 2 Name:");

        Scanner consoleName2 = new Scanner(System.in);
        String player2Name = consoleName2.next();
        player2.setName(player2Name);

        System.out.println("Welcome " + player1.getName() + " and " + player2.getName());
        System.out.println("-------------Start to play!---------------");

        System.out.println(player1.getName() + " gets first card");
        player1.cardsInHand.add(cardsWashList.get(0));

        System.out.println(player2.getName() + " gets first card");
        player2.cardsInHand.add(cardsWashList.get(1));

        System.out.println(player1.getName() + " gets second card");
        player1.cardsInHand.add(cardsWashList.get(2));

        System.out.println(player2.getName() + " gets second card");
        player2.cardsInHand.add(cardsWashList.get(3));

        System.out.println("-------------The result is:-------------");

        Card player1FinalCard = new Card();
        Card player2FinalCard = new Card();

        String winner;
        int winnerId;

        if(player1.cardsInHand.get(0).compareTo(player1.cardsInHand.get(1)) > 0) {
            player1FinalCard = player1.cardsInHand.get(0);
        } else {
            player1FinalCard = player1.cardsInHand.get(1);
        }

        System.out.println(player1.getName() + " shows the bigger card: " + player1FinalCard);

        if(player2.cardsInHand.get(0).compareTo(player2.cardsInHand.get(1)) > 0) {
            player2FinalCard = player2.cardsInHand.get(0);
        } else {
            player2FinalCard = player2.cardsInHand.get(1);
        }

        System.out.println(player2.getName() + " shows the bigger card: " + player2FinalCard);

        if(player1FinalCard.compareTo(player2FinalCard) > 0) {
            winner = player1.getName();
            winnerId = player1.getId();
        } else {
            winner = player2.getName();
            winnerId = player2.getId();
        }

        System.out.println("The Number " + winnerId + " Player " + winner + " WINS!");

        System.out.println("--------------The game details:--------------");


        System.out.println(player1.getName() + "'s first card is " + player1.cardsInHand.get(0));
        System.out.println(player2.getName() + "'s first card is " + player2.cardsInHand.get(0));
        System.out.println(player1.getName() + "'s second card is " + player1.cardsInHand.get(1));
        System.out.println(player2.getName() + "'s second card is " + player2.cardsInHand.get(1));



    }



}
