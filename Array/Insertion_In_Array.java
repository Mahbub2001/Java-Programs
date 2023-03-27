import java.util.*;

public class Insertion_In_Array {
    public static int display(int A[], int size) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Array A: \n");
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] = ", i + 1);
            A[i] = sc.nextInt();
        }

        System.out.println("Printing the Array A : ");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }

        return 0;
    }

    // int insertion(int A[100], int size)
    // {

    // int number, pos;
    // printf("\nEnter the number that you want to add : ");
    // scanf("%d", &number);

    // while (pos <= 0 || pos > size + 1)
    // {
    // printf("Enter the position where you want to store number : ");
    // scanf("%d", &pos);
    // printf("Invalide Input...........Write the right value... \n");
    // }
    // for (int i = size - 1; i >= pos - 1; i--)
    // {
    // A[i + 1] = A[i]; // for creating space ...
    // }
    // A[pos - 1] = number; // for adding value.......
    // size++; // for increasing size ....

    // printf("The new Array A is : ");
    // for (int i = 0; i < size; i++)
    // {
    // printf("%d ", A[i]);
    // }

    // return 0;
    // }

    // int at_the_start_insertion(int A[100], int size)
    // {
    // int number;
    // printf("Enter the number that you want to add : ");
    // scanf("%d", &number);

    // for (int i = size - 1; i >= 0; i--)
    // {
    // A[i + 1] = A[i];
    // }

    // A[0] = number;
    // size++;

    // printf("The new Array A is : ");
    // for (int i = 0; i < size; i++)
    // {
    // printf("%d ", A[i]);
    // }

    // return 0;
    // }

    // int at_the_end_insertion(int A[100], int size)
    // {
    // int number;
    // printf("Enter the number that you want to add : ");
    // scanf("%d", &number);

    // A[size] = number;
    // size++;

    // for (int i = 0; i < size; i++)
    // {
    // printf("%d ", A[i]);
    // }

    // return 0;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, UserChoice;

        System.out.println("Enter the size of array A : ");
        size = sc.nextInt();

        int A[] = new int[size];

        display(A, size);

        System.out.println("\nEnter '1' for specific insertion\n" +
                "Enter '2' for add number at the start\n" +
                "Enter '3' for add number at the end ...\n");

        UserChoice = sc.nextInt();

        // switch (UserChoice) {
        // case 1:
        // insertion(A, size);
        // break;
        // case 2:
        // at_the_start_insertion(A, size);
        // break;
        // case 3:
        // at_the_end_insertion(A, size);
        // break;
        // default:
        // printf("You entered wrong number ");
        // break;
        // }

    }
}
