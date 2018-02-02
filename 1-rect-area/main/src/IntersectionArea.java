public class IntersectionArea {
    static float clamp(float x, float a, float b) {
        if (x < a)
            return a;
        if (x > b)
            return b;
        return x;
    }
    /* Usage: java IntersectionArea  x11 y11 x12 y12  x21 y21 x22 y22 */
    public static void main(String[] args) {
        if (args.length != 8)
            System.err.println("Error: 8 arguments expected");

        Rectangle rect1 = new Rectangle(args, 0);
        Rectangle rect2 = new Rectangle(args, 4);

        Rectangle leftRect = (rect1.leftBound() < rect2.leftBound()) ? rect1 : rect2;
        Rectangle rightRect = (rect1 == leftRect) ? rect2 : rect1;
        float intersectionX = clamp(leftRect.rightBound() - rightRect.leftBound(), 0, rightRect.width());

        float intersectionY = 0;
        if (intersectionX != 0) {
            Rectangle lowerRect = (rect1.lowerBound() < rect2.lowerBound()) ? rect1 : rect2;
            Rectangle upperRect = (rect1 == lowerRect) ? rect2 : rect1;
            intersectionY = clamp(lowerRect.upperBound() - upperRect.lowerBound(), 0, upperRect.height());
        }
        System.out.println(intersectionX * intersectionY);
    }
}
