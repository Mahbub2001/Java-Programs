import java.util.Scanner;

public class Simple_Subtruction_quiz {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " - " + number2 + "? ");

        int answer = input.nextInt();

        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +
                    " should be " + (number1 - number2));
        }
    }

}
