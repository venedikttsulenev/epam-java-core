package thirtyDays.day20;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int swaps = bubbleSort(a);
        System.out.format("Array is sorted in %d swaps.%n", swaps);
        System.out.format("First Element: %d%n", a[0]);
        System.out.format("Last Element: %d%n", a[n - 1]);
    }

    private static void swap(int [] a, int index1, int index2) {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }

    private static int bubbleSort(int[] a) {
        int totalNumberOfSwaps = 0;
        for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }

            totalNumberOfSwaps += numberOfSwaps;
        }
        return totalNumberOfSwaps;
    }
}

