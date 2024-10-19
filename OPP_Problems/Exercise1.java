class Test {
    int a;

    Test(int i) {
        a = i;
    }

    void show() {
        System.out.println(a);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Test obj1 = new Test(10);
        Test obj2 = obj1;
        obj1.show();//10
        obj1.a = 20;
        obj2.show();//20
        obj1 = null;
        obj2.show();//20
    }
}
