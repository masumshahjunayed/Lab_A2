
package a2sheet;

import java.util.Scanner;


public class P15TriRight {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, k;
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            k = num - i;
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = k+1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
