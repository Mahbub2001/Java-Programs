public class Java_Varargs {

    public int sumNumber(int... args) {
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Java_Varargs ex = new Java_Varargs();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
//you cannot use 2 args at a time...
