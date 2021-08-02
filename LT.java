import java.io.File;
import java.util.Scanner;


//Buffered Reader probably... (try this)
// Can even try incorporating maven

public class LT {

	// Read Nasa Data on Lightning
	/* public static void readData(){
		try {
			Scanner data = new Scanner(new File("~Desktop/Revature/Project0/lt_long.csv"));
			// System.out.println(data.nextInt());
		}
		finally {

		}
	} */

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

	public static void main(String[] args) throws Exception {
		// Call Lightning Data
		Scanner lg = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_long.csv"));
		Scanner lat = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_lat.csv"));
		Scanner frd = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_frd.csv"));
		Scanner vt = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_vt.csv"));

		lg.useDelimiter(",");
		lat.useDelimiter(",");
		frd.useDelimiter(",");
		vt.useDelimiter(",");

		while (lg.hasNext() && lat.hasNext() && frd.hasNext() && vt.hasNext()) {
			// System.out.println(lg.next());
			// System.out.println(lat.next());
			// System.out.println(frd.next());
			// System.out.println(vt.next());

			break;
		}
		System.out.println("Data loaded.");

		lg.close();
		lat.close();
		frd.close();
		vt.close();

		// Open application for us
		welcome();

		// Give user nice summary of their request
		System.out.println("Here is BANG! BOOM! POW! Lightning Tracker's map for US zip code " + zip() + " in " + month() + " " + year() + ".");
	}

}


/* KNOWN ISSUES:
	- COULD TRY RETURNING Z, Y, AND M OUTSIDE OF THE BLOCKS... (NOT SURE IF WILL CALL SINCE STATIC VARIABLES....)
	- CHECK PROJECT REQUIREMENTS TODAY AND CREATE A GOOD SKELETON
	- MAKE PROBABLY 3 NEW FUNCTIONS AND TESTS TODAY

 */