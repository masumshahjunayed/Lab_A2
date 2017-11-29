
package a2sheet;

import java.util.Scanner;


public class P11HalR {
    
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        
        int line = hp.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if (j==1 || j==(2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        for (int i = line-1; i >= 1; i--) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2*i-1); j++) {
                if (j==1 || j==(2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    
}
