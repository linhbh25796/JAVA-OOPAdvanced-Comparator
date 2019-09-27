import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[3];
        rect[0] = new Rectangle(1,3);
        rect[1] = new Rectangle(4,2);
        rect[2] = new Rectangle("white",true,100,200);

        System.out.println("Pre-sorted:");
        for (Rectangle rects : rect) {
            System.out.println(rect);
        }

        RectangleComparator rectComparator = new RectangleComparator();
        Arrays.sort(rect, rectComparator);

        System.out.println("After-sorted:");
        for (Rectangle rects : rect) {
            System.out.println(rect);
        }
    }
}
