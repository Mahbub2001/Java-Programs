import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(isLeapYear ? year + " is leap year" : year + " is not a leap year");
    }
}
