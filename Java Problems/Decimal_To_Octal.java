import java.util.*;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The number" + " " + number + Integer.toOctalString(number));
    }
}
