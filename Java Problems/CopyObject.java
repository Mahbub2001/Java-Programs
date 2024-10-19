class Hello_world {

    int x = 10, y = 20;

    void print() {
        System.out.println(x + " " + y);
    }

    void add() {
        x = x + 10;
    }

}

public class CopyObject {
    public static void main(String[] args) {

        Hello_world ob1 = new Hello_world();

        System.out.println(ob1.x + " " + ob1.y);

        Hello_world ob2 = ob1;

        ob1.add();

        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);

    }
}
