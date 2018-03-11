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
            int N = 4 + random.nextInt(196);
            int K = 3 + random.nextInt(N - 3);
            System.out.format("%d %d%n", N, K);
            int studentsInTime = b ? 1 + random.nextInt(K - 1) : K + random.nextInt(N - K + 1);
            for (int i = 0; i < studentsInTime - 1; ++i)
                System.out.print(getProperTimeStudent(random) + " ");
            for (int i = studentsInTime; i < N; ++i)
                System.out.print(getLateStudent(random) + " ");
            System.out.format("%d%n", 0); /* This one student who came just in time */
        }
    }
}
