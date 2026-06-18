import java.util.Scanner;

public class Leftrotate_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        System.out.println("Rotated array: ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        s.close();
    }
}
