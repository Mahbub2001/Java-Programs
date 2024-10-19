import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a long number: ");
        long input = scanner.nextLong();

        String inputString = Long.toString(input);
        
        String reversedString = new StringBuilder(inputString).reverse().toString();
        long reversedLong = Long.parseLong(reversedString);

        if (reversedLong == input) {
            System.out.println("The number is paindrome");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
        scanner.close();
    }
}
