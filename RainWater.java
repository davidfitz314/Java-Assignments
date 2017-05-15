import java.util.Scanner;

public class RainWater {
    public static void main(String[] args) {
        double rainIn;
		double width;
		double length;
		double gall = 7.48;
        double outp;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the Amount in inches of heavy rain fall. \n");
        rainIn = in.nextDouble();

		System.out.println("Please enter the Width of your catchment area in feet. \n");
        width = in.nextDouble();

		System.out.println("Please enter the Length of your catchment area in feet. \n");
        length = in.nextDouble();

        outp = ((rainIn * width * length * gall)/12);
		System.out.println("you need a " + outp + " galleon tank.");
        System.exit(0);
    }

}
