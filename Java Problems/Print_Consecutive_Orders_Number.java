import java.util.*;

public class Print_Consecutive_Orders_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 2; j++) {
                if (arr[j] == arr[j + 1] && arr[j + 1] == arr[j + 2]) {
                    System.out.println(arr[j] + " ");
                } else
                    break;
            }
        }
        sc.close();
    }
}
