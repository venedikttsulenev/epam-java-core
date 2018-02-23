package thirtyDays.day26;

import java.util.Scanner;

public class Solution {
    private static int fine(int dayReturned, int monthReturned, int yearReturned,
                            int dayExpected, int monthExpected, int yearExpected)
    {
        if (yearReturned > yearExpected)
            return 10000;
        else if (yearReturned == yearExpected) {
            if (monthReturned > monthExpected)
                return 500 * (monthReturned - monthExpected);
            else if (monthReturned == monthExpected && dayReturned > dayExpected)
                return 15 * (dayReturned - dayExpected);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();
        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();
        scanner.close();
        System.out.println(fine(dayReturned, monthReturned, yearReturned, dayExpected, monthExpected, yearExpected));
    }
}
