import java.util.Scanner;

public class Checkarr_sorted {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        for(int i=1;i<n;i++){
            if (arr[i]<=arr[i-1]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");
        s.close();
    }
}
