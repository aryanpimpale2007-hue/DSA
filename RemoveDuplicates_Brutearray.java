import java.util.HashSet;
import java.util.Scanner;

//time complexity: NlogN+N
//space complexity: O(n)

public class RemoveDuplicates_Brutearray {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();             
            }

        HashSet<Integer> set = new HashSet<>();

        for (Integer num : arr) {
            set.add(num);
        }

        System.out.println(set);
        
    }
}
