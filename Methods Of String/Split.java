// public String split(String regex)  
// or,  
// public String split(String regex, int limit)  

class Split {
    public static void main(String[] args) {
        String s1 = "My name is Mahbub Ahmed Turza.";
        String[] words = s1.split(" ");
        String[] words2 = s1.split(" ", 3);
        for (String w : words) {
            System.out.println(w);
        }
        // with limit
        for (String w : words2) {
            System.out.println(w);
        }

        String str = "hello";
        System.out.println("Returning words:");
        String[] arr = str.split("l", 0);
        for (String w : arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: " + arr.length);

        // multiple
        String input = "2+3-4*5";
        String[] tokens = input.split("[+\\-*]");
        for (String token : tokens) {
            System.out.println(token);
        }

    }
}
