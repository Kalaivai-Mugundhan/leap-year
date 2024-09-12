import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear;

        // Leap year logic
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 100, it must also be divisible by 400 to be a leap
                // year
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not 100
            }
        } else {
            isLeapYear = false; // Not divisible by 4
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
