public class Wall {

    public static void main(String[] args) {

        Wall wall = new Wall(1.125, -1.0);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    // fields
    private double width;
    private double height;


    // main constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // default value constructor
    public Wall() {
        this(0.0, 0.0);
    }

    // getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    // setters
    public void setWidth(double value) {
        if (value < 0) {
            this.width = 0;
        } else {
            this.width = value;
        }
    }

    public void setHeight(double value) {
        if (value < 0) {
            this.height = 0;
        } else {
            this.height = value;
        }
    }
}
