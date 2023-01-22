import java.util.Scanner;
/**
 * A Birthday guessing game based on a 5 bit representation of 31 total days.
 * Based on the input of the user, the program will output the user's birthday.
 * @author dillanvictory
 * @version January 23rd 2023
 */
public class Main {
    public static String [] cards = {"Card 0: \n 1,3,5,7, \n 9,11,13,15, \n 17,19,21,23, \n 25,27,29,31 \n",
            "Card 1: \n 2,3,6,7 \n 10,11,14,15 \n 18,19,22,23 \n 26,27,30,31 \n",
            "Card 2: \n 4,5,6,7 \n 12,13,14,15 \n 20,21,22,23 \n 28,29,30,31 \n",
            "Card 3: \n 8,9,10,11 \n 12,13,14,15 \n 24,25,26,27 \n 28,29,30,31 \n",
            "Card 4: \n 16,17,18,19 \n 20,21,22,23 \n 24,25,26,27 \n 28,29,30,31 \n"};
    public static int [] guessCount = {1,2,4,8,16};
    public static int count = 0;
    public static int userAnswer;
    public static Scanner input = new Scanner(System.in);

    /**
     * Main Method for the birthday guessing game.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("こにちは、ビクトリーさん！ -> Hello, Mr. Victory！\nWelcome to the birthday guessing game!\nPlease type your name.");
        String userName = input.nextLine();
        System.out.println("Welcome " + userName + "." + "\nIn order to guess your birthday please look at the following cards. \nAnswer 1 if the day of your birth is in a card \nAnswer 0 if your birthday is not in a card.\n");
        cardRollOut();
        System.out.println(userName + "'s birthday is " + count + " days into the month.");
    }
    public static void cardRollOut()
    {
        for(int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
            userAnswer = input.nextInt();
            if (userAnswer == 1) {
                System.out.println("Okay!");
                count = count + guessCount[i];
            } else if (userAnswer == 0) System.out.println("Okay!");
        }
    }
}