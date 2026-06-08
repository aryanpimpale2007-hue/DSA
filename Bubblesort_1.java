import java.util.Scanner;

public class Bubblesort_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENter number of elements in array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
         System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        for(int i=n-1;i>=1;i--){   //sorts from 0 to n-1; 0 to n-2; 0 to n-3
         boolean swapped = false;
            for(int j=0;j<=i-1;j++){ // starts from 0 to n-1, n-2, n-3...
                if (arr[j]>arr[j+1]) {    //checks which is greater
                    int temp = arr[j+1];  //actual swapping
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

         System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
        System.out.println(+arr[i]);
        }
        s.close();

        }
    }


