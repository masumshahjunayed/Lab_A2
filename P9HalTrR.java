
package a2sheet;

import java.util.Scanner;


public class P9HalTrR {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int line = hp.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = i; j <= line; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i==1 || i==2 || i==line || j==1 | j==i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
