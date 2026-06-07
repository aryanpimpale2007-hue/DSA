import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            for(char ch =(char)('E'-i); ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
