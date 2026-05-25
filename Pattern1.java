package DSA;
import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        for(int i = 0; i<n;i++){ //prints rows
            for(int j = 0; j<n; j++){  //prints 4 stars(columns)
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}

