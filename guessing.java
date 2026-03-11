//Java Utils
import java.util.Scanner;
import java.util.Random;

//Main class / function
public class guessing {

    //Player guessing
    public static void playerGuessing(int admCheck) {
        //Adds a gap
        System.out.println("");

        //Allows for user input
        Scanner user = new Scanner(System.in);
        int userGuess = 0;

        //Grabs a random number
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100.");

        //Checks to see if the user did an admin check
        if (admCheck == 51) {
            System.out.println("Computers number: " + number);
        };

        //Counts the attemps
        int attempts = 0;

        while (userGuess != number) {
            System.out.println("==============================");
            
            //Ask / Grabs the users guess and adds to the attemps
            System.out.print("Whats your guess?: ");
            userGuess = user.nextInt();
            attempts++;

            if (userGuess < number) {
                System.out.println("Too low!");
            } 
            else if (userGuess > number) {
                System.out.println("Too high!");
            } 
            else {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
            }
        }
    }
    //Main function / Menu
    public static void main(String[] args) {

        //Allows for user input
        Scanner userInput = new Scanner(System.in);

        //Title
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("==============================");

        //Game selection
        System.out.println("1: Play against the computer");
        System.out.println("2: Computer manually plays against you");
        System.out.println("3: Computer automattically plays against you");

        //Allows for the admin view
        System.out.println("Admin View: (51: Can see the computers number), (53: Can see the computers guesses)");
        System.out.println("==============================");

        //User ask to select mode
        System.out.print("Mode Selection(1, 2, 3, Admin View(51, 52)): ");
        int userInp = userInput.nextInt();

        //Checks to see what mode got selected
        if (userInp == 1 || userInp == 51 ) {
            playerGuessing(userInp);
        } 
        else if (userInp == 2) {
            
        } 
        else {
            System.out.println("Invalid choice.");
        }

        userInput.close();
    }
}
