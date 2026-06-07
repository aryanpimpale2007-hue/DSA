import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=s.nextInt();

        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;

                int min = Math.min(Math.min(top, down),Math.min(left, right));
            
                System.out.print((n-min)+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
