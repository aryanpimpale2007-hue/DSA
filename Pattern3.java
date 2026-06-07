import java.util.Scanner;

public class Pattern3 {
    
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        for(int i = 1; i<=n;i++){ //prints rows
            for(int j = 1; j<=i; j++){  //prints 4 stars(columns)
                System.out.print(" "+j); //prints value of j
            }
            System.out.println();
        }
         s.close();
    }
}


