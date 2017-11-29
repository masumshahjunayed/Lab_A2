
package a2sheet;

import java.util.Scanner;


public class P5Triangle {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        
        int line = hp.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m < i*2; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
