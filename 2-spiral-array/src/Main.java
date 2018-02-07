public class Main {
    static final byte UP = 0;
    static final byte RIGHT = 1;
    static final byte DOWN = 2;
    static final byte LEFT = 3;
    static final int I = 0;
    static final int J = 1;
    /* Usage: java Main a00 a01 a02 ... */
    public static void main(String[] args) {
        int [][] matrix = parseArgs(args);
        if (null == matrix) {
            System.err.println("No matrix specified");
            return;
        }
        System.out.println("Matrix given:");
        printMatrix(matrix);
        System.out.println();

        int n = matrix.length;
        byte dir = RIGHT;
        int indices[] = new int[2];   // vector of indices: i == i[I], j == i[J]
        go(matrix, dir, indices, n);
        dir = nextDir(dir);
        while (n --> 0) {
            for (int k = 0; k < 2; ++k) {
                go(matrix, dir, indices, n);
                dir = nextDir(dir);
            }
        }
        System.out.println();
    }
    static void printMatrix(int m[][]) {
        if (null == m)
            System.out.println("null");
        else {
            for (int i = 0; i < m.length; ++i) {
                if (null == m[i])
                    System.out.println("null");
                else
                    for (int j = 0; j < m[i].length; ++j)
                        System.out.print(" " + m[i][j]);
                System.out.println();
            }
        }
    }
    static int [][] parseArgs(String [] args) {
        if (args.length == 0)
            return null;
        int n = 1;
        while (n*n < args.length)
            ++n;
        int [][] arr = new int[n][n];
        for (int i = 0; i < args.length; ++i)
            arr[i / n][i % n] = Integer.parseInt(args[i]);
        return arr;
    }
    static void go(int a[][], byte direction, int indices[], int howMuch) {
        switch (direction) {
            case UP:
                goI(a, -1, indices, I, howMuch);
                ++indices[J];
                break;
            case DOWN:
                goI(a, +1, indices, I, howMuch);
                --indices[J];
                break;
            case LEFT:
                goI(a, -1, indices, J, howMuch);
                --indices[I];
                break;
            case RIGHT:
                goI(a, +1, indices, J, howMuch);
                ++indices[I];
                break;
        }
    }
    static void goI(int a[][], int step, int i[], int indexNum, int howMuch) {
        while (howMuch --> 0) {
            System.out.print(" " + a[i[0]][i[1]]);
            i[indexNum] += step;
        }
        i[indexNum] -= step;
    }
    static byte nextDir(byte dir) {
        if (dir == 3)
            return 0;
        return ++dir;
    }
}
