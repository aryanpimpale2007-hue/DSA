import java.util.Scanner;

public class SecondSmallestele_array {
        public static void main(String[] args) {
             Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if (arr[i]<smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i]!=smallest && arr[i]<ssmallest) {
                ssmallest=arr[i];
            }
        }
        
        System.out.println("Second smallest: "+ssmallest);
        s.close();
    }
}
