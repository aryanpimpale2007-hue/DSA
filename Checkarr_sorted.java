import java.util.Scanner;

public class Checkarr_sorted {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){                   //input of numebrs
            arr[i]=s.nextInt();             
            }

        for(int i=1;i<n;i++){               //sorting happens here
            if (arr[i]<=arr[i-1]) {
                System.out.println("False");    //if false result stops here
                return;
            }
        }
        System.out.println("true");         //Shows result
        s.close();
    }
}
