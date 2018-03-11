package thirtyDays.day29;

import java.util.Scanner;

public class Solution {
    private static int solve(int n, int k) {
        int max = 0;
        for (int a = 1; a <= n; ++a)
            for (int b = a + 1; b <= n; ++b)
                if ((a & b) < k && (a & b) > max)
                    max = a & b;
        return max;
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T --> 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(solve(N, K));
        }
        scanner.close();
    }
}
