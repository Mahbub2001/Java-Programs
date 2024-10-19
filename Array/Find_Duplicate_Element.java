import java.util.*;

class Find_Duplicate_Element {
    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 4, 5, 3, 6, 6, 6 };

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        int[] duplicatesArray = new int[duplicates.size()];
        int i = 0;
        for (int duplicate : duplicates) {
            duplicatesArray[i++] = duplicate;
        }

        System.out.println("Duplicate elements in the array: ");
        for (int duplicate : duplicatesArray) {
            System.out.print(duplicate + " ");
        }

    }
}