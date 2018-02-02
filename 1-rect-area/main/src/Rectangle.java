public class Rectangle {
    private float x1, x2, y1, y2;
    public Rectangle(String [] args, int offset) {
        this.x1 = Float.parseFloat(args[offset]);
        this.y1 = Float.parseFloat(args[offset + 1]);
        this.x2 = Float.parseFloat(args[offset + 2]);
        this.y2 = Float.parseFloat(args[offset + 3]);
    }
    public float area() {
        return Math.abs((y1 - y2)*(x1 - x2));
    }
    public float leftBound() {
        return Math.min(x1, x2);
    }
    public float rightBound() {
        return Math.max(x1, x2);
    }
    public float upperBound() {
        return Math.max(y1, y2);
    }
    public float lowerBound() {
        return Math.min(y1, y2);
    }
    public float width() {
        return Math.abs(x2 - x1);
    }
    public float height() {
        return Math.abs(y2 - y1);
    }
}
