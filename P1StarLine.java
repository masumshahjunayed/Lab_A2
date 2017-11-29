
package a2sheet;

import java.util.Scanner;


public class P1StarLine {
    
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        int star = hp.nextInt();
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
