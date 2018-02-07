package thirtyDays;

import java.util.Scanner;

public class Day9 {
    static int factorial(int n) {
        switch (n) {
            case 2:
                return 2;
            case 3:
                return 6;
            default:
                return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
