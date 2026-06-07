import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int num=1;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
        s.close();
    }
}
