public class Main {
    private enum Direction {
        UP, RIGHT, DOWN, LEFT;

        public Direction next() {
            int nextOrd = (this.ordinal() + 1) % values().length;
            return values()[nextOrd];
        }
    }

    private static final int ROW = 0;
    private static final int COLUMN = 1;

    /* Usage: java Main a00 a01 a02 ... */
    public static void main(String[] args) {
        int[][] matrix = parseArgs(args);
        if (null == matrix) {
            System.err.println("No matrix specified");
            return;
        }
        System.out.println("Matrix given:");
        printMatrix(matrix);

        System.out.println("Result:");
        int n = matrix.length;
        Direction dir = Direction.RIGHT;
        int indices[] = new int[]{0, 0};   // vector of indices: row number == i[ROW], column number == i[COLUMN]
        go(matrix, dir, indices, n);
        dir = dir.next();
        while (n-- > 0) {
            for (int k = 0; k < 2; ++k) {
                go(matrix, dir, indices, n);
                dir = dir.next();
            }
        }
        System.out.println();
    }

    private static void printMatrix(int m[][]) {
        if (null == m)
            System.out.println("null");
        else {
            for (int[] row : m) {
                if (null == row)
                    System.out.println("null");
                else
                    for (int element : row)
                        System.out.print(" " + element);
                System.out.println();
            }
        }
    }

    private static int[][] parseArgs(String[] args) {
        if (args.length == 0)
            return null;
        int n = 1;
        while (n * n < args.length)
            ++n;
        int[][] arr = new int[n][n];
        for (int i = 0; i < args.length; ++i)
            arr[i / n][i % n] = Integer.parseInt(args[i]);
        return arr;
    }

    private static void go(int a[][], Direction direction, int indices[], int howMuch) {
        switch (direction) {
            case UP:
                goI(a, -1, indices, ROW, howMuch);
                ++indices[COLUMN];
                break;
            case DOWN:
                goI(a, +1, indices, ROW, howMuch);
                --indices[COLUMN];
                break;
            case LEFT:
                goI(a, -1, indices, COLUMN, howMuch);
                --indices[ROW];
                break;
            case RIGHT:
                goI(a, +1, indices, COLUMN, howMuch);
                ++indices[ROW];
                break;
        }
    }

    private static void goI(int a[][], int step, int i[], int indexNum, int howMuch) {
        while (howMuch-- > 0) {
            System.out.print(" " + a[i[ROW]][i[COLUMN]]);
            i[indexNum] += step;
        }
        i[indexNum] -= step;
    }
}
