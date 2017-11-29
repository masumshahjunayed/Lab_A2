
package a2sheet;

import java.util.Scanner;


public class P2Rectangle {
    
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        int star = hp.nextInt();
        int nxt = hp.nextInt();
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < nxt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
