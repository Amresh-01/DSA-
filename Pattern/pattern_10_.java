
//                            ##  Pattern - 10  ##
//                         
//                              * * * * * * *          
//                               *         *        
//                                *       *
//                                 *     *
//                                  *   *
//                                   * *
//                                    *
//                                   * *
//                                  * * *
//                                 * * * *
//                                * * * * *
//                               * * * * * * 
//                              * * * * * * * 
 
import java.util.Scanner;

public class pattern_10_{ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1 || i == 1) {
                    System.out.print("*");
                } else if (i == n / 2 && j < st) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i == n / 2) {
                st++;
            }
            System.out.println();
        }
    }
}
