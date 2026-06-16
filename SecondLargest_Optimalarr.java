import java.util.Scanner;

public class SecondLargest_Optimalarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        int largest = arr[0];  //assuming the values for comparison
        int slargest = -1;        

        for(int i=1;i<n;i++){
            if (arr[i]>largest) {    //comparing each value of array with the presumed value
                slargest=largest;       //swapping, if the 2nd value is greater than the first
                largest=arr[i];     //storing the new largest
            }
            else if (arr[i]<largest && arr[i]>slargest) {  // comparing for the second largest 
                slargest = arr[i];
            }
        }
        System.out.println(" Second largest is: "+slargest);
        s.close();
    }
}
