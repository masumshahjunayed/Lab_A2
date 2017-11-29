
package a2sheet;

import java.util.Scanner;


public class P14TriLeft {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                int count = j+1;
                System.out.print(count);
            }
            System.out.println();
        }
        
    }
    
}
