public class Utils {

    private Utils() {}

    public static int area(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        int x = a.getX() - b.getX();
        int y = a.getY() - b.getY();
        return x * y;
    }

    public static int perimeter(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        int x = a.getX() - b.getX();
        int y = a.getY() - b.getY();
        return 2*(x + y);
    }

    public static double diagonalLength(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        int x = a.getX() - b.getX();
        int y = a.getY() - b.getY();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
