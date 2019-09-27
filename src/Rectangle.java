public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(String color, boolean filled, int a, int b) {
        super(color, filled);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getArea() {
        return this.a * this.b;
    }

    @Override
    public String toString() {
        return "A Rectangle with a = "
                + getA() + " b = " + getB() +" Area: "+getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}