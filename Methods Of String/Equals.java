// The Java String class equals() method compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
public class Equals {
    public static void main(String[] args) {
        String s1 = "java world";
        String s2 = "java world";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
