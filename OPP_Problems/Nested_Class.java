//Without static class
class Outer {
    Outer() {
        System.out.println("hello world outside");
    }

    class Inner {
        Inner() {
            System.out.println("hello world inside");
        }
    }
}

public class Nested_Class {
    public static void main(String[] args) {
        Outer h = new Outer();
        Outer.Inner h2 = h.new Inner();
    }
}

// With static

// class Outer{
// Outer(){
// System.out.println("hello world outside");
// }
// static class Inner{
// Inner(){
// System.out.println("hello world inside");
// }
// }
// }
// public class Nested_Class {
// public static void main(String args[]) {
// Outer.Inner obj2 = new Outer.Inner();

// }
// }