
package a2sheet;

import java.util.Scanner;


public class P12RactNum {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int count ;
        int col = scan.nextInt();
        int raw = scan.nextInt();
        
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < raw+1; j++) {
                count = j;
                System.out.print(count);
            }
            System.out.println();
        }
        
    }
    
}
