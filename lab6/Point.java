public class Point {
    int xCoord;
    int yCoord;


    public Point(int xCoord, int yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public double distanceFromAPoint(Point point){
        int xDiff =xCoord - point.xCoord;
        int yDiff =yCoord - point.yCoord;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
