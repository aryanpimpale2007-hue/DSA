package DSA;

import java.util.Scanner;

public class Pattern17{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }

            //alphabet
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if (j<=breakpoint) {     //divides the triangle and reverses the pattern
                    ch++;
                }
                else ch--;
            }

            //sapce
             for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        s.close();
    }
}

