
package a2sheet;

import java.util.Scanner;


public class P10HallowTri {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        
        int line = hp.nextInt();
        
        for (int i = 1; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if (i==line || j==1 || j==(2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
