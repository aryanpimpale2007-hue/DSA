import java.util.Scanner;

public class Selectionsort_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENter number of elements in array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
         System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        for(int i=0;i<=n-2;i++){   //fixes the range to sort for eg. 0 to n-2 , 1 to n-2
            int min = i;            // assuming
            for(int j=i+1;j<n;j++){  // traverses through the range
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }

            //swapping of elements
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
        System.out.println(+arr[i]);
        }
        s.close();
    }
}
