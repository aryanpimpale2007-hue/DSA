package DSA;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }           
        if (count==2) {
                System.out.println("true");
            }
            else System.out.println("False"); 

        s.close();
    }
}
