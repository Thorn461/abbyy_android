public class Rect {
    private Point topLeft;
    private Point bottomRight;

    public Rect(Point topLeft_, Point bottomRight_) {
        if (topLeft_.getX() >= bottomRight_.getX() || topLeft_.getY() <= bottomRight_.getY()) {
            throw new IllegalArgumentException("Некорректные точки");
        }
        topLeft = topLeft_;
        bottomRight = bottomRight_;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }
}
