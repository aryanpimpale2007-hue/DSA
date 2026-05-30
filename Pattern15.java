package DSA;
import java.util.Scanner;

public class Pattern15{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            for(char ch = 'A' ; ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
