public class Contains {
    public static void main(String[] args) {
        String str = "Hello World!! how are you?";  
        boolean isContains = str.contains("World");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str.contains("world"));
    }
}
