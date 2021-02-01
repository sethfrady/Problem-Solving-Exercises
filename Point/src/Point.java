public class Point {

    public static void main(String[] args) {

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
        Point thisPoint = new Point(6, 5);
        System.out.println("distance(x, y) = " + thisPoint.distance(2, 2));
        Point anotherPoint = new Point(3, 1);
        System.out.println("distance(anotherPoint) = " + thisPoint.distance(anotherPoint));
    }

    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public double distance() {
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }
}
