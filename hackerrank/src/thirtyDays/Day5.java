package thirtyDays;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; ++i)
            System.out.format("%d x %d = %d\n", n, i, n*i);
    }
}
