import java.util.Scanner;

public class DayGuess {
    public static void main (String[] args) {
      int counter = 1;
      String dayString;
      Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to this day game!");
       System.out.println("The computer will guess what day it is based on the number you input.");
       System.out.println("This program is special because it doesn't use if-then statements... can you guess what it might use instead?");
       System.out.println("Enter the number corresponding to the day of the week it is today:");
      int day = scan.nextInt();
      switch (day) {
        case 1: dayString = "Sunday";
          counter = 0;
          break;
        case 2: dayString = "Monday";
         counter = 0;
         break;
        case 3: dayString = "Tuesday";
          counter = 0;
          break;
        case 4: dayString = "Wednesday";
          counter = 0;
          break;
        case 5: dayString = "Thursday";
          counter = 0;
          break;
        case 6: dayString = "Friday";  
          counter = 0;
          break;
        case 7: dayString = "Saturday";
          counter = 0;
          break;
        default: dayString = "Please enter a day number from 1-7.\n Try again.";
          break;
            }
      System.out.println("It's " + dayString + "!");
    }
}
