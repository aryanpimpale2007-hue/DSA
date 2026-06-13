import java.util.Scanner;

public class Largestelement_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }
            
        int max=arr[0];  //storing 1st element as largest
        for(int i=1;i<arr.length;i++){         
            if (arr[i]>max){  //checking each element by comparing it with the first element which is max=arr[0]
                max=arr[i];   //If arr[i] is greater then value is exchanged
            }
        }
         System.out.println("Largest: "+max);
         s.close();
        }
    }

