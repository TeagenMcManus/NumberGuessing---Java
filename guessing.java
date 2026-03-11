//Java Utils
import java.util.Scanner;
import java.util.Random;

//Main class / function
public class guessing {

    //Player guessing
    public static void playerGuessing(int admCheck) {

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

        //Keeps the loop running until the number gets guessed
        while (userGuess != number) {
            System.out.println("==============================");

            //Ask / Grabs the users guess and adds to the attemps
            System.out.print("Whats your guess?: ");
            userGuess = user.nextInt();
            attempts++;

            //Checks to see if the number guessed was to high or low
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
        user.close();
    }

    //Computer guessing manually
    public static void computerGuessMan() {

        //Values for the lowest and highest numbered guessed
        int low = 0;
        int high = 100;

        //Counts the attempts
        int attempts = 0;

        //Creates the input
        Scanner userInp = new Scanner(System.in);

        //Creates a random variable and the computers variables
        Random rand = new Random();
        int computerGuess = 0;

        //Ask the user to pick a number
        System.out.printf("Choose a number between 1-100: ");
        int number = userInp.nextInt();
        userInp.nextLine();

        //Adds a gap
        System.out.println("");

        //Shows the user their number (in case the forget)
        System.out.println("Your number: " + number);
        System.out.println("==============================");

        //Makes sure the user give a number greater than 0
        if (number <= 0){
            System.out.println("Please pick an number greater than 0");
        };

        //Constant loop until the computer gets it
        while (computerGuess != number) {
            
            //Adds to the attempts counter
            attempts++;

            //Makes the computers guess
            computerGuess = (low + high)/2;
            System.out.println("Computers guess: " + computerGuess);

            //Ask the user if the guess is correct
            System.out.printf("Is this guess (L)ow, (H)igh, or (C)orrect?: ");
            String lowHighCorr = userInp.nextLine();
            System.out.println("==============================");

            //Checks to see what the user put
            if (lowHighCorr.equalsIgnoreCase("l")) {

                //Adds the computers guess to low if the input is low then adds 1 so it cant be called again (number)
                low = computerGuess + 1;
            }
            else if (lowHighCorr.equalsIgnoreCase("h")) {

                //Adds the computers guess to high if the input is low then adds 1 so it cant be called again (number)
                high = computerGuess + 1;
            }
            else if (lowHighCorr.equalsIgnoreCase("c")) {

                //If the computer guess it then it tells the user how many attempts it took
                System.out.println("The computer guessed your number, " + number + " in " + attempts + " attempts");
            }
            else {
                System.out.println("Incorrect input please try again");
                attempts -= 1;
            }
        }
    }

    //Main function / Menu
    public static void main(String[] args) {
        //Adds a gap
        System.out.println("");
        
        //Allows for user input
        Scanner userInput = new Scanner(System.in);

        //Title
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("==============================");

        //Game selection
        System.out.println("1: Play against the computer");
        System.out.println("2: Computer manually plays against you");

        //Allows for the admin view
        System.out.println("Admin View: (51: Can see the computers number)");
        System.out.println("==============================");

        //User ask to select mode
        System.out.print("Mode Selection(1 (Admin View: 51), 2): ");
        int userInp = userInput.nextInt();

        //Adds a gap
        System.out.println("");

        //Checks to see what mode got selected
        if (userInp == 1 || userInp == 51 ) {
            playerGuessing(userInp);
        } 
        else if (userInp == 2) {
            computerGuessMan();
        } 
        else {
            System.out.println("Invalid choice.");
        }

        userInput.close();
    }
}
