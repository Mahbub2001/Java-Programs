import java.util.*;

class Simple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the numbers that you want to store : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array : ");
        
        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();

    }
}