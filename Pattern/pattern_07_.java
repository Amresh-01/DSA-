
//                                     ## Pattern - 07 ##
// 
//                                      Butterfly Patterns
// 
// 
//                                         *        *
//                                         **      **
//                                         ***    ***
//                                         ****  ****
//                                         **********
//                                         ****  ****
//                                         ***    ***
//                                         **      **
//                                         *        *
// 
// 
import java.util.*;

public class pattern_07_ {

    public static void Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butterfly(5);
    }
}
