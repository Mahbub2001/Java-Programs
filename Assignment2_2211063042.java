import java.util.Scanner;

class InvalidPasswordException extends Exception {
    String password;

    InvalidPasswordException(String password) {
        this.password = password;
    }

    public String toString() {
        return "InvalidPasswordException: Invalid password format. Password: " + password;
    }
}

public class Assignment2_2211063042 {
    static void validatePassword(String password) throws InvalidPasswordException {
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}$")) {
            throw new InvalidPasswordException(password);
        } else {
            System.out.println("Password is valid.");
            System.out.println("Password " + password);
            if (password.length() > 10) {
                System.out.println("Password is too strong");
            } else {
                System.out.println("Passsword is not strong");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit of input: ");
        int input = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < input; i++) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
            } catch (InvalidPasswordException e) {
                System.out.println("Exception Caught: " + e);
            }
        }
        scanner.close();

    }

}
