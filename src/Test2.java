import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("s: ");
        String s = scanner.nextLine();

        System.out.print("t: ");
        String t = scanner.nextLine();

        System.out.println(isAnagram(s, t));
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return Arrays.equals(charArrayS, charArrayT);
    }
}
