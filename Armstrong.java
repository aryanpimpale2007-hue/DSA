import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int dup=n;
        int sum=0;
        while (n>0) {
            int last = n%10;
            sum = sum+(last*last*last);
            n=n/10;
        }
        if (dup==sum) {
            System.out.println("It is armstrong");
        }
        else System.out.println("It is not armstrong");
        s.close();
    }

}
