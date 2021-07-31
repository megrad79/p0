import java.util.Scanner;

public class LT {

	// Print welcome message to the command line
	public static void welcome(){
		System.out.println("Welcome to BANG! BOOM! POW! Lightning Tracker,");
		System.out.println("where we track the lightning... before it tracks YOU. ^_^ ");
		System.out.println("To get started, we'll ask you for some information.");
	}

	// Request US zip code from the command line
	public static int zip(){
		// Allows and reads user inputs
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter US zip code: ");

		// Zip code
		int z = s.nextInt();
		return z;
	}

	// Request month from the command line
	public static String month(){
		// Allows and reads user inputs
		Scanner s = new Scanner(System.in);

		System.out.println("Shweet!!! Please enter the desired month: ");

		// month
		String m = s.next();
		return m;
	}

	// Request year from the command line
	public static int year(){
		// Allows and reads user inputs
		Scanner s = new Scanner(System.in);

		System.out.println("Gnarly!!! Please enter the desired year: ");

		// Year
		int y = s.nextInt();
		return y;
	}

	public static void main(String[] args){
		welcome();

		// Give user nice summary of their request
		System.out.println("Here is BANG! BOOM! POW! Lightning Tracker's map for US zip code " + zip() + " in " + month() + " " + year() + ".");
	}

}
