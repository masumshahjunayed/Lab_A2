
package a2sheet;

import java.util.Scanner;


public class P17Trivoj {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        
        int line = hp.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m < i*2; m++) {
                int count = m;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    
}
