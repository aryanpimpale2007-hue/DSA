import java.util.Scanner;

public class Smallestele_array {
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
        for(int i=0; i<n;i++){
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element: "+smallest);
    }
}
