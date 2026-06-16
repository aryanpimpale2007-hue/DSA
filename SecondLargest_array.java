import java.util.Scanner;
//This is a better approach
public class SecondLargest_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        int largest = arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        
        int slargest = -1;
        for(int i=0; i<n; i++){
            if (arr[i]<largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }

        System.out.println("Second largest: "+slargest);
        s.close();
    }
}
