import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        while (true) {
            System.out.println("Enter a number or 'q' to quit");
            String input = sc.nextLine();
            if (input.equals("q")) {
                System.out.println((double) sum / i);
                break;
            }
            i++;
            sum = sum + Integer.parseInt(input);

        }
        sc.close();
    }
}
