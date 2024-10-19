class A {
    A() {
        System.out.println("This is A constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B Constructor");
        // super();//wrong way...there will be an error
    }
}

public class CallSuperClassConstructor {
    public static void main(String[] args) {
        B ob = new B();
    }
}

// This is A constructor
// B Constructor
