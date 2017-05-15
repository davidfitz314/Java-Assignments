import java.util.Scanner;

public class javaCricket {
    public static void main(String[] args) {
        int chirp;
        int outp;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the Chirps Counted ");
        chirp = in.nextInt();

        outp = (chirp + 40);
		if (outp > 55) {
			System.out.println("The temperature is: " + outp);
		} else {
			System.out.println("That's too cold for crickets");
		}
        System.exit(0);
    }

}
