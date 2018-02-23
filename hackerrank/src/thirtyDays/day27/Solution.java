package thirtyDays.day27;

import java.util.Random;

public class Solution {
    private static int getProperTimeStudent(Random random) {
        return -random.nextInt(1001);
    }
    private static int getLateStudent(Random random) {
        return 1 + random.nextInt(1000);
    }
    public static void main(String[] args) {
        boolean [] answers = new boolean[] {true, false, true, false, true};
        Random random = new Random();
        System.out.println(answers.length);
        for (boolean b : answers) {
            int N = 1 + random.nextInt(200);
            int K = 1 + random.nextInt(N);
            System.out.format("%d %d%n", N, K);
            int studentsInTime = b ? random.nextInt(K) : K + random.nextInt(N - K + 1);
            for (int i = 0; i < studentsInTime; ++i)
                System.out.print(getProperTimeStudent(random) + " ");
            for (int i = studentsInTime; i < N - 1; ++i)
                System.out.print(getLateStudent(random) + " ");
            System.out.format("%d%n", getLateStudent(random)); /* Last student */
        }
    }
}
