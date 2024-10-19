public class CompareTo {
   public static void main(String[] args) {
        String s1="mahbub";
        String s2 = "Mahbub";
        String s3 = "World";
        String s4 = "mahbub";

        System.out.println(s1.compareTo(s2));// answer will be 32 ..because "m" is 32 times greater than "M". ASCII value of "m" is 109 and "M" is 77.
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
   } 
}
