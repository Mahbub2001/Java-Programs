import java.util.*;
public class Sort_In_Lexicographical_Order {
    public static void main(String[] args){
            String stringArrray[] = {"Abc","zz","dce","gjis","a"};

            Arrays.sort(stringArrray,String.CASE_INSENSITIVE_ORDER);

            for (String string : stringArrray) {
                System.out.println(string + " ");
            }
            System.out.println();
    }
}
