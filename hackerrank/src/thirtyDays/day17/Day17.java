package thirtyDays.day17;

import java.util.Scanner;

class Calculator {
    int power(int n, int p) {
        if (n < 0 || p < 0)
            throw new IllegalArgumentException("n and p should be non-negative");
        if (n < 2)
            return n;
        int result = 1;
        while (p != 0) {
            if (p % 2 == 0) {
                n *= n;
                p /= 2;
            }
            else {
                result *= n;
                --p;
            }
        }
        return result;
    }
}

public class Day17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
