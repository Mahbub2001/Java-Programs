public class EndsWith {
    public static void main(String[] args) {
        String str = "Welcome to java.com";
        System.out.println(str.endsWith("java"));
        if (str.endsWith(".com")) {
            System.out.println("String ends with .com");
        } else
            System.out.println("It does not end with .com");
    }
}
