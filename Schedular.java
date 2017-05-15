//import java.util.Scanner;
import java.util.*;

public class Schedular {
	public static void main(String[] args) {
		String[] courses = new String[13];
		String first;
		Scanner in;
		System.out.println("Welcome to Dixie State please choose from the list of available class times by using the number for your choice \n 1- 8:00am MWF \n 2- 9:00am MWF \n 3- 10:00am MWF \n 4- 11:00am MWF \n 5- 12:00pm MWF \n 6- 1:00pm MWF \n 7- 2:00pm MWF \n 8- 3:00pm MWF \n 9- 7:30am TR \n 10- 9:00am TR \n 11- 10:30am TR \n 12- 1:00pm TR \n 13- 2:30pm TR ");
       	in = new Scanner(System.in);
		first = in.next();
		String stime;		
		stime = first;
		if (stime.equals("1")){
			courses[0] = "8:00am MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
			
		} else if (stime.equals("2")){
			courses[0] = "9:00am MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("3")){
			courses[0] = "10:00am MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("4")){
			courses[0] = "11:00am MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("5")){
			courses[0] = "12:00pm MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("6")){
			courses[0] = "1:00pm MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("7")){
			courses[0] = "2:00pm MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("8")){
			courses[0] = "3:00pm MWF ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("9")){
			courses[0] = "7:30am TR ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("10")){
			courses[0] = "9:00am TR ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("11")){
			courses[0] = "10:30am TR ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("12")){
			courses[0] = "1:00pm TR ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} else if (stime.equals("13")){
			courses[0] = "2:30pm TR ";
			System.out.println("Course Name? ");
			in = new Scanner(System.in);
			first = in.next();
			courses[0] += first;
		} 

		System.out.println("Would you like to add more? yes or no?");
		in = new Scanner(System.in);
		first = in.next();
		String cont = first;
		int count = 1;
		System.out.println("\nHere is your current schedule.");
			for (int i = 0; i<courses.length; i++)
			{ 	
				if (courses[i]==null){
					continue;
				} else {
					System.out.println(courses[i]);
				}
			}
		System.out.println("\n");
		while ((cont.equals("y") || cont.equals("Y") || cont.equals("yes") || cont.equals("Yes") || cont.equals("YES")) && (count < 13)){
			System.out.println("Please choose a time");
			in = new Scanner(System.in);
			first = in.next();	
			stime = first;
			if (stime.equals("1")){
				courses[count] = "8:00am MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			
			} else if (stime.equals("2")){
				courses[count] = "9:00am MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("3")){
				courses[count] = "10:00am MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("4")){
				courses[count] = "11:00am MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("5")){
				courses[count] = "12:00pm MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("6")){
				courses[count] = "1:00pm MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("7")){
				courses[count] = "2:00pm MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("8")){
				courses[count] = "3:00pm MWF ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("9")){
				courses[count] = "7:30am TR ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("10")){
				courses[count] = "9:00am TR ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("11")){
				courses[count] = "10:30am TR ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("12")){
				courses[count] = "1:00pm TR ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} else if (stime.equals("13")){
				courses[count] = "2:30pm TR ";
				System.out.println("Course Name? ");
				in = new Scanner(System.in);
				first = in.next();
				courses[count] += first;
			} 
			count += 1;

			System.out.println("\nHere is your current schedule.");
			for (int i = 0; i<courses.length; i++)
			{ 	
				if (courses[i]==null){
					continue;
				} else {
					System.out.println(courses[i]);
				}
			}
			System.out.println("\n");

			System.out.println("Would you like to add more? yes or no?");
			in = new Scanner(System.in);
			first = in.next();
			cont = first;
			
			

	
		}		
		
        System.exit(0);
    }

}
