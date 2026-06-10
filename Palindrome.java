import java.util.Scanner;

public class Palindrome{

    static String Reverseword(String word){
        String reverse ="";
        int i = word.length()-1;
        while (i>=0) {
            reverse=reverse+word.charAt(i);
            i--;
        }
        // for(int i= word.length()-1; i>=0;i--){
        //     reverse+=word.charAt(i);
        // }

        return reverse;
    }

    static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(Reverseword(word));
    }

    static boolean check_all_Palindrome(String word){ {
            
                if (!isPalindrome(word)) {
                    return false;
                }
            
            return true;
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String arr1 = s.nextLine();
       
        
        // String [] arr1 = {"racecar", "abc1", "civic"};
        // String [] arr2 = {"racecar", "shoe", "moon"};
        

        System.out.println(check_all_Palindrome(arr1));
        // System.out.println(check_all_Palindrome(arr2));
        s.close();

    }
}

