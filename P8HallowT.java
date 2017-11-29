
package a2sheet;

import java.util.Scanner;


public class P8HallowT {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int input = hp.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==1 || i==2 || i==input || j==1 | j==i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
