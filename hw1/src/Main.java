public class Main {
    private static double pointDistance(Point a, Point b) {
        return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        System.out.println(pointDistance(a, b));
    }
}
