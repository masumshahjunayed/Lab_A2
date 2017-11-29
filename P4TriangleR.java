
package a2sheet;

import java.util.Scanner;


public class P4TriangleR {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int line = hp.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = i; j <= line; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
