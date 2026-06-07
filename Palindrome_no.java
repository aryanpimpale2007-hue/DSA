
import java.util.Scanner;

public class Palindrome_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int dup=n;
        int rev = 0;
        while (n!=0) {
            int last = n%10;
            n=n/10;
            rev = (rev*10)+last;
        }
        if (dup==rev) {
            System.out.println("true");
        }    
        else System.out.println("false");
        s.close();
    }
}

