package thirtyDays.day14;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int [] elements) {
        this.elements = elements;
    }
    public void computeDifference() {
        int min = elements[0], max = elements[0];
        for (int i = 1; i < elements.length; ++i) {
            if (elements[i] < min)
                min = elements[i];
            else if (elements[i] > max)
                max = elements[i];
        }
        maximumDifference = max - min;
    }
} // End of Difference class

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
