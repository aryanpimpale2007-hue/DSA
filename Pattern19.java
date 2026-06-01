package DSA;
import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int space=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }

        for(int j=0;j<space;j++){
            System.out.print(" ");
        }

        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }
        space+=2;
        System.out.println();
    }

         space=2*(n-1);
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //stars
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        s.close();
    }
}
