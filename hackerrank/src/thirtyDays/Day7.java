package thirtyDays;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.print(arr[n-1]);
        for (int i = n - 2; i >= 0; --i) {
            System.out.print(' ');
            System.out.print(arr[i]);
        }
    }
}
