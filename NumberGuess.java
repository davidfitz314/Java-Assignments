import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess {
    public static void main(String[] args) {
		int number;
		int counter = 0;
		int guess;
		Scanner in;

        System.out.println("\nWelcome to Ricerca Binaria! \nI will pick a number between 1 and 100, inclusive. \nTry to guess my number in as few guesses as possible.\nDon't worry, I'm a nice program.  I'll give you hints.\n");
		
		number = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		System.out.println("Ok, I've picked my number. \n Your guess?");
		in = new Scanner(System.in);
        guess = in.nextInt();
		while (guess != number){
			if (guess > number){
				System.out.println("Too high.");			
			} else {
				System.out.println("Too low.");
			}
			counter ++;
			System.out.println("Your guess? ");
			in = new Scanner(System.in);
        	guess = in.nextInt();
		}
		System.out.println("Good Job! \nYou guessed my number in " + counter + " tries");
		
        System.exit(0);
    }

}
