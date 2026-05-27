package DSA;

import java.util.Scanner;

public class Pattern7 {
           public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n-i-1;j++){  //prints space
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1;j++){    // prints stars = 2*no of rows+1 for eg = 2*2+1 = 5 for the third row
                System.out.print("*");
            }
             for(int j = 0; j<n-i-1;j++){   //prints space = total - no of row - 1;
                System.out.print(" ");
            }
              System.out.println();
        }
        s.close();
    }
}