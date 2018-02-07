package thirtyDays;

import java.util.Scanner;

public class Day11 {
    static int hourglassSum(int[][] a, int i, int j) {
        return a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] +
                a[i][j] +
                a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = -63;
        for (int i = 1; i < 5; ++i) {
            for (int j = 1; j < 5; ++j) {
                int sum = hourglassSum(arr, i, j);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
