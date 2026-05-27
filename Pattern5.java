package DSA;
import java.util.Scanner;

public class Pattern5 {
           public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        for(int i = 1; i<=n;i++){ //prints rows
            for(int j = 1; j<=n-i+1; j++){  //prints 4 stars(columns)
                System.out.print("*"); //prints = total rows - the row number + 1
            }
            System.out.println();
        }
         s.close();
    }
}