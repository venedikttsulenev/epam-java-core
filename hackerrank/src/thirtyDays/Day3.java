package thirtyDays;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        if (n % 2 == 0 && (n <= 4 || n >= 22)) {
            ans = "Not Weird";
        }
        else {
            ans = "Weird";
        }
        System.out.println(ans);
    }
}
