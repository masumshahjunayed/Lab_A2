package a2sheet;

import java.util.Scanner;


public class P16Triangle {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int count = j+1;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    
}
