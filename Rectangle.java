class Rectangle {
    private double length;
    private double width;
    private double height;

    // Constructor with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor with length, width, and height
    public Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height=height;
    }

    // Constructor with length and width, assuming height is 0
    public Rectangle(double length, double width, int nullParameter) {
        this.length = length;
        this.width = width;
    }

    // Constructor with length and width as 0 when parameters are not provided
    public Rectangle() {
        this.length=0;
        this.width=0;

        System.out.println("This is default parameter.");
    }

    public double calculateArea() {
        return length * width;
    }
    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create a rectangle with length and width
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle 1 Area: " + rectangle1.calculateArea());

        // Create a rectangle with length, width, and height
        Rectangle rectangle2 = new Rectangle(4.0, 2.5, 3.0);
        System.out.println("Rectangle 2 Volume: " + rectangle2.calculateVolume());
        System.out.println("Rectangle 2 Area: " + rectangle2.calculateArea());

        // Create a rectangle with length and width, assuming height is 0
        Rectangle rectangle3 = new Rectangle(6.0, 4.0, 0);
        System.out.println("Rectangle 3 Area: " + rectangle3.calculateArea());

        // Create a rectangle with default parameters
        Rectangle rectangle4 = new Rectangle();
        System.out.println("Rectangle 4 Area: " + rectangle4.calculateArea());
    }
}
