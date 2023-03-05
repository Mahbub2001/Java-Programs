//same as equals but this method doesn't compare with case..
public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
