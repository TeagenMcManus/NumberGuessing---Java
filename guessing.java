//Java Utils
import java.util.Scanner;
import java.util.Random;

//Main class / function
public class guessing {

    //Player guessing
    public static void playerGuessing(int admCheck) {

        //Allows for user input
        Scanner userGuess = new Scanner(System.in);

        //Grabs a random number
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        //Checks to see if the user did an admin check
        if (admCheck == 51) {
            System.out.print("Computers number: " + number);
        };

        //Counts the attemps
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (userGuess != number) {

            //Ask / Grabs the users guess and adds to the attemps
            System.out.print("Whats your guess?: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low!");
            } 
            else if (guess > number) {
                System.out.println("Too high!");
            } 
            else {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
            }
    }

    //Main function / Menu
    public static void main(String[] args) {

        //Allows for user input
        Scanner userInput = new Scanner(System.in);

        //Title
        System.out.println("Welcome to the Number Guessing Game");

        //Game selection
        System.out.println("1: Play against the computer");
        System.out.println("2: Computer manually plays against you");
        System.out.println("3: Computer automattically plays against you")

        //Allows for the admin view
        System.out.println("Admin View: (51: Can see the computers number), (53: Can see the computers guesses)")
        
        //User ask to select mode
        System.out.print("Mode Selection(1, 2, 3, Admin View(51, 52)): ");
        int userInp = userInp.nextInt();

        //Checks to see what mode got selected
        if (userInp == 1) {
            playerGuessing(userInp);
        } 
        else if (userInp == 2) {
            
        } 
        else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
