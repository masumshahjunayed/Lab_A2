
package a2sheet;

import java.util.Scanner;


public class P3TriangleL {
    
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int input = hp.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
