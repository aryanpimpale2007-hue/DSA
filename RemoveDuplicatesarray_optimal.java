import java.util.Scanner;

//time complexity = O(n)
//space complexity = O(1)

public class RemoveDuplicatesarray_optimal {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        int i=0;
        for(int j=1;j<n;j++){
            if (arr[j]!=arr[i]) {
                arr[i+1]=arr[j];
                i++;
            }
        }

        int uniquelength = i+1;
        System.out.println("Removed duplicates: ");

        for(int k=0;k<uniquelength;k++){
            System.out.println(arr[k]);
        }
        
        s.close();
    }
}
