class Phone {
    public void on() {
        System.out.println("Starting the phone....");
    }

    public void greetings() {
        System.out.println("Hello World....!!");
    }
}

class SmartPhone extends Phone {
    public void on() {
        System.out.println("Starting the Smart Phone...");
    }

    public void music() {
        System.out.println("Playing Music....");
    }
}

class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    // override callme()
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // dynamic dispatch
        // runtime polymorphism
        Phone obj = new SmartPhone();

        obj.on();
        // obj.music();//It will show an error

        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C

        A r; // obtain a reference of type A
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme
        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }
}
