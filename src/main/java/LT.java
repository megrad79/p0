
import org.knowm.xchart.internal.chartpart.PlotContent_Category_Line_Area_Scatter;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.NumericColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Axis;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.components.Marker;
import tech.tablesaw.plotly.traces.ScatterTrace;
import tech.tablesaw.plotly.traces.Trace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


//Buffered Reader probably... (try this)
// Can even try incorporating maven

public class LT {
	// Variable declaration
	static int z = 0;
	static String m = "";
	static int y = 0;

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
		z = s.nextInt();

		// not the best check of zip code
		while(!(z > 10000)){
			System.out.println("Zip code not recognized. Please enter valid US zip code: ");
			z = s.nextInt();
		}
		return z;
	}

	// Request month from the command line
	public static String month(){
		// Allows and reads user inputs
		Scanner s = new Scanner(System.in);

		System.out.println("Shweet!!! Please enter the desired month (from 1 - 12): ");

		// month
		int x = s.nextInt();
		String m = "";

		String [] months = {"Invalid entry. Please try again.", "Jan.", "Feb.", "March", "April", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec." };
		// int [] M = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		/* if (!(m.length(5))){
			// where m must be a string
		} */

		// Try to implement enhanced for-loop***
		/*while(!(1<= x && x <= 12)){
			System.out.println(months[0]);
			x = s.nextInt();
		}*/
		if (1 <= x && x <= 12){
			m = m.concat(months[x]);
		}
		else {
			System.out.println(months[0]);
			x = s.nextInt();
		}
		return m;
	}

	// Request year from the command line
	public static int year(){
		// Allows and reads user inputs
		Scanner s = new Scanner(System.in);

		System.out.println("Gnarly!!! Please enter the desired year: ");

		// Year
		y = s.nextInt();

		// not the best check of year
		while (!(y > 1000)){
			System.out.println("Year not recognized. Please enter a year after 1000: ");
			y = s.nextInt();
		}
		return y;
	}

	public static void dataRead() throws Exception{
		// Call Lightning Data
		Scanner lg = new Scanner(new BufferedReader(new FileReader("C://Users/njone/Desktop/Revature/Project0/lt_long.csv")));
		Scanner lat = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_lat.csv"));
		Scanner frd = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_frd.csv"));
		Scanner vt = new Scanner(new File("C://Users/njone/Desktop/Revature/Project0/lt_vt.csv"));

		lg.useDelimiter(",");
		lat.useDelimiter(",");
		frd.useDelimiter(",");
		vt.useDelimiter(",");

		while (lg.hasNext() && lat.hasNext() && frd.hasNext() && vt.hasNext()) {
			/*DoubleColumn lgc = DoubleColumn.create("Longitude", lg);
			DoubleColumn latc = DoubleColumn.create("Latitude", lat);
			DoubleColumn frdc = DoubleColumn.create("Flash Rate Density", frd);
			DoubleColumn vtc = DoubleColumn.create("View Time", vt);*/

			/*if (lg.hasNext()){
				int row = 3600;
				int col = 1;
				double [][] M = new double[row][col];

				for (int i = 0; i < row; i++){
					for (int j = 0; i < col; j++){
						M[i][j] = lg.nextDouble();
					}

				}
			}*/

			/*if (lat.hasNext()){
				int row = 1;
				int col = 760;
				Scanner [] LT = lt.;
			}*/


			 System.out.println(lg.next());
			 System.out.println(lat.next());
			 System.out.println(frd.next());
			 System.out.println(vt.next());

			break;
		}
		System.out.println("Data loaded.");

		lg.close();
		lat.close();
		frd.close();
		vt.close();

		// Make Lightning Heat Map 1998-2013 (Tropics)
		/*Table ltHeatMap = Table.read().csv("C://Users/njone/Desktop/Revature/Project0/lt_frd.csv");

		// System.out.println(ltHeatMap.structure());

		ltHeatMap = ltHeatMap.where(ltHeatMap.nCol("Latitude").isGreaterThan(20));

		NumericColumn<?> x = ltHeatMap.nCol("Longitude");
		NumericColumn<?> y = ltHeatMap.nCol("Latitude");

		Layout layout = Layout.builder().title("Lightning Heat Map").height(3600).width(760).yAxis(Axis.builder().range(20,60).build()).build();

		Trace trace = ScatterTrace.builder(x,y).marker(Marker.builder().size(1).build()).name("lat/lon").build();

		Plot.show(new Figure(layout, trace));*/
	}


	public static void main(String[] args) throws Exception{
		// Read data
		dataRead();

		// Open application for user
		welcome();

		// Call Functions
		zip();
		year();

		// Give user nice summary of their request
		System.out.println("Here is BANG! BOOM! POW! Lightning Tracker's map for US zip code " + z + " in " + month() + " " + y + ".");
	}

}


/* KNOWN ISSUES:
	- move data to src/DATA
	- refactoring; think of objects and classes if time
	- make at least one map
	- make at least one multilinear regression?
	- CHECK PROJECT REQUIREMENTS TODAY AND CREATE A GOOD SKELETON
	- MAKE PROBABLY 3 NEW FUNCTIONS AND TESTS TODAY
	method(int z, int x, int y) >>> blank map
	>>> map according to year
	>>> map according to month
	>>> map according to lat, long
	>>> map according to frd
	(might either include us map outline or just points...)


 */