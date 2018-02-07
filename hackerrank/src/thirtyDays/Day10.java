package thirtyDays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int r = n % 2;
        int count = r, maxCount = 0;
        do {
            n /= 2;
            r = n % 2;
            if (r == 1)
                ++count;
            else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        } while (n != 0);
        System.out.println(Math.max(count, maxCount));
    }
}