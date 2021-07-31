import java.util.Scanner;


public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Please input name:");

		Scanner s = new Scanner(System.in);
		System.out.println("Hello "+ s.next());
	}
}
