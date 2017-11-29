
package a2sheet;

import java.util.Scanner;


public class P7HollowR {
    
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        int star = hp.nextInt();
        int nxt = hp.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= nxt; j++) {
                if (i==1 || i==star || j==1 || j==nxt) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
