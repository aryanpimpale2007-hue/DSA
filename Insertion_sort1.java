import java.util.Scanner;

public class Insertion_sort1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENter number of elements in array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
         System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        for(int i=0;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }   
        }
        
         System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
        System.out.println(+arr[i]);
        }
        s.close();
    }
}
