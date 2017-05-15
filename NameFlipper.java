import java.util.Scanner;

public class NameFlipper {
	public static String nameFlipper(String names) {
		String[] each = names.split(" ");
		each[1] += ", ";		
		return (each[1] + each[0]);
	}
	
    public static void main(String[] args) {
        
		
        Scanner in;
		String[] tests = {"Bill Salter", "Michael Green", "J Graff"};
        in = new Scanner(System.in);
        
		for (int i = 0; i< tests.length; i++)
		{
			String name = nameFlipper(tests[i]);
			System.out.println(name);			
			System.out.println(tests[i] + " has passed.");
			
		}
        		
        System.exit(0);
    }

}
