public class RectArea {
    /* Usage java RectArea x1 y1 x2 y2 */
    public static void main(String[] args) {
        if (args.length != 4)
            System.err.println("Error: 4 arguments expected");
        Rectangle rect = new Rectangle(args, 0);
        System.out.println(rect.area());
    }
}
