import java.util.Scanner;

public class ch_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(digitSum(n));
    }

    public static int digitSum(int n) {
        int result = 0;
        while (n>0) {
            int ch = n%10;
            result += ch;
            n/=10;
        }
        return result;
    }
}
