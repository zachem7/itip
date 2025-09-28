import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(isPalindrome(s));
    }
    public static String reverseString(String s) {
        String r="";
        for (int i=s.length()-1; i>=0; i--) {
            r += s.charAt(i);
        }
        return r;
    }
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
