import java.util.Scanner;
/**
 * A Birthday guessing game based on a 5 bit representation of 31 total days.
 * Based on the input of the user, the program will output the user's birthday.
 * @author dillanvictory
 * @version January 13th 2023
 */
public class Main {

    //public String userName;

    /**
     * Main Method for the birthday guessing game.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Establish main variables.
        int count = 0;

        System.out.println("Welcome to the birthday guessing game!");

        //userName a String variable which stores the name of the user in this game.
        System.out.println("Please type your name.");
        String userName = input.nextLine();
        System.out.println("Type 1 if " + userName + " is correct or 0 if you need to make a change.");
        //userAnswer an int input from the user which should always be either 0 or 1.
        int userAnswer = input.nextInt();
        //The following is a logical AND statement to check if the user has type something other than 0 or 1.
        //I felt it was unnecessary to put this throughout.
        if(userAnswer != 0 && userAnswer != 1){
            System.out.println("Please type either 1 or 0.");
            userAnswer = input.nextInt();
        }
        if(userAnswer == 1){
            System.out.println("Great!");
        }
        if (userAnswer == 0) {
            System.out.println("Please type the correct name!");
            userName = input.next();
            System.out.println("Welcome " + userName + ".");
        }

        System.out.println("In order to guess your birthday please look at the following cards. \n");
        System.out.println("Answer 1 if the day of your birth is in a card \nAnswer 0 if your birthday is not in a card.\n");
        //Card 0
        System.out.println("Card 0: \n 1,3,5,7, \n 9,11,13,15, \n 17,19,21,23, \n 25,27,29,31");

        userAnswer = input.nextInt();
        if(userAnswer == 1){
            System.out.println("Okay!");
            count = count+1;
        }
        if(userAnswer == 0){
            System.out.println("Okay!");
        }

        //Card 1
        System.out.println("Card 1: \n 2,3,6,7 \n 10,11,14,15 \n 18,19,22,23 \n 26,27,30,31 \n");

        userAnswer = input.nextInt();
        if(userAnswer == 1){
            System.out.println("Okay!");
            count = count+2;
        }
        if(userAnswer == 0){
            System.out.println("Okay!");
        }
        //Card 2
        System.out.println("Card 2: \n 4,5,6,7 \n 12,13,14,15 \n 20,21,22,23 \n 28,29,30,31 \n");
        userAnswer = input.nextInt();
        if(userAnswer == 1){
            System.out.println("Okay!");
            count = count+4;
        }
        if(userAnswer == 0){
            System.out.println("Okay!");
        }
        //Card 3
        System.out.println("Card 3: \n 8,9,10,11 \n 12,13,14,15 \n 24,25,26,27 \n 28,29,30,31 \n");
        userAnswer = input.nextInt();
        if(userAnswer == 1){
            System.out.println("Okay!");
            count = count+8;
        }
        if(userAnswer == 0){
            System.out.println("Okay!");
        }
        //Card 4
        System.out.println("Card 4: \n 16,17,18,19 \n 20,21,22,23 \n 24,25,26,27 \n 28,29,30,31 \n");
        userAnswer = input.nextInt();
        if(userAnswer == 1){
            System.out.println("Okay!");
            count = count+16;
        }
        if(userAnswer == 0){
            System.out.println("Okay!");
        }
        /*
         The count is calculated based on the userAnswer. Each card represents a numerical value.
         This value represents a scaled weighed against 5 bits.
         The total of all bits is 31; the maximum amount of days in a month. It goes 1 2 4 8 16 = 31
        */
        System.out.println(userName + "'s birthday is " + count + " days into the month.");

    }

}