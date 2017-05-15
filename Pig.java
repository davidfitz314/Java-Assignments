import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Pig {

    public static void Directions() {
	System.out.println("Welcome to the Game of Pig.  To win, be the player with the most points at the end of the game.  The game ends at the end of a round where at least one player has 100 or more points.\n On each turn, you may roll the die as many times as you like to obtain more points.  However, if you roll a 1, your turn is over, and you do not obtain any points that turn.\n");
    }

    public static void main(String[] args) {
        Scanner in;
	
        in = new Scanner(System.in);
        //System.out.println("Enter the Chirps Counted ");
        //chirp = in.nextInt();
	Directions();
	boolean player1 = true;
	int score1 = 0;
	int score2 = 0;
	int temp = 0;
	boolean gameGo = true;
	while (gameGo){
	    System.out.println("player 1 has " + score1 + " points");
	    System.out.println("player 2 has " + score2 + " points");
	    System.out.println("player please type 'y' or 'n' to begin your turn");
	    if (score1 >= 100){System.out.println("player 1 wins"); break;}
	    if (score1 >= 100){System.out.println("player 2 wins"); break;}
	    String minput = in.next();
	    while (minput.equals("y") || minput.equals("Y")){
		int number = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		System.out.println("you rolled a " + number);
		if (number != 1){
		    if (player1 == true){
			System.out.println("player 1");
		        temp += number;
		        System.out.println("your current score is " + score1);
		        System.out.println("Do you wish to continue 'y' or 'n'?");
		        in = new Scanner(System.in);
		        minput = in.next();
		    } else {
			System.out.println("player 2");
			temp += number;
		        System.out.println("your current score is " + score1);
		        System.out.println("Do you wish to continue 'y' or 'n'?");
		        in = new Scanner(System.in);
		        minput = in.next();
		    }
		    
		} else { temp = 0; if (player1){player1 = false;}else{player1 =true;} break; }
	    }
	    if (player1){
		score1 += temp;
		player1 = false;
		temp = 0;
	    } else {
		score2 += temp;
		player1 = true;
		temp = 0;
	    }
	    if (score1 >= 100){System.out.println("player 1 wins"); break;}
	    if (score1 >= 100){System.out.println("player 2 wins"); break;}

	  
	}

        System.exit(0);
    }

}
