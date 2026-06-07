
import java.util.Scanner;

public class Pattern8 {
               public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        
        for(int i = 0; i<n;i++){
            for(int j = 0; j<i;j++){  //prints space
                System.out.print(" ");
            }
            for(int j = 0; j<2*n-(2*i+1);j++){    // prints stars = 2*n-(2*no of rows+1);
                System.out.print("*");
            }
             for(int j = 0; j<i;j++){   //prints space = total - no of row - 1;
                System.out.print(" ");
            }
              System.out.println();
        }
        s.close();
    }
}

