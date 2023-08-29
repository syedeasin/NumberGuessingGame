package gussingGame;

import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        //Generate A Unique Number
        int randomNumber = (int)(Math.random()*100);

        //Scanner Class
        Scanner sc = new Scanner(System.in);
        int userInput;
        do {
            //Number Guessing
            System.out.print("Guess A Number between 1 to 100(To Stop The Game, Type: -1) : ");
            userInput = sc.nextInt();

            if(userInput==randomNumber)
            {
                System.out.println("Congratulations! Your Number is matched");
                break;
            }
            else if (userInput<1 && userInput != -1)
            {
                System.out.println("Your Number Is Very Small");
                continue;
            }
            else if (userInput>100)
            {
                System.out.println("Your Number Is Bigger Then Range");
                continue;
            } else if (userInput==-1) {
                System.out.println("Thanks for playing this game");
                break;
            } else
            {
                System.out.println("Sorry! Please Try Again");

            }
        }while (true);

        System.out.println("The Lucky Number Was: " + randomNumber);
    }
}
