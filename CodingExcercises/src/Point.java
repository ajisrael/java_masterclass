public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int x, int y) {
        int xComponent = x - this.x;
        int yComponent = y - this.y;

        return Math.sqrt(xComponent * xComponent + yComponent * yComponent);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
