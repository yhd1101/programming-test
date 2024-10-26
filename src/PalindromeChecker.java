import java.util.HashMap;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.println(isPalindrome(x));
        HashMap<String, String> h1 = new HashMap<String, String>( );
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
