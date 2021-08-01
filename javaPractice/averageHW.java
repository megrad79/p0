// SoloLearn Time for HW Program

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int math = scanner.nextInt();
       int history = scanner.nextInt();
       int geometry = scanner.nextInt();
       
       //your code goes here
       int sum = math + history + geometry;
       int hr = sum/60;
       int min = sum % 60;

       System.out.println(hr);
       System.out.println(min);
   }
}
