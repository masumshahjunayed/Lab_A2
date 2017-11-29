
package a2sheet;

import java.util.Scanner;


public class P13NumLine {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        for (int i = 1; i < number+1; i++) {
            int count = i;
            System.out.print(count);
        }
        System.out.println();
    }
    
}
