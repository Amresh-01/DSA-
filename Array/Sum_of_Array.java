
import java.util.*;

public class Sum_of_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;
    }
}
