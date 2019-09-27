import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[3];
        rect[0] = new Rectangle(1,3);
        rect[1] = new Rectangle(4,2);
        rect[2] = new Rectangle("white",true,100,200);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rect) {
            System.out.println(rectangle);
        }

        RectangleComparator rectComparator = new RectangleComparator();
        Arrays.sort(rect, rectComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rect) {
            System.out.println(rectangle);
        }
    }
}
