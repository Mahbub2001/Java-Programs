class Example {
    int a;

    Example(int i) {
        a = i;
    }

    Example ReturnObj() {
        return new Example(a + 5);
    }

}

public class Exercise2 {
    public static void main(String[] args) {

        Example obj1 = new Example(10);
        Example obj2 = obj1.ReturnObj();
        System.out.println(obj1.a + ", " + obj2.a);//10 15
        obj1 = obj2.ReturnObj();
        System.out.println(obj1.a + ", " + obj2.a);//20 15
    }
}
