package behavior;

public class Point2D {
    int curX;
    int curY;

    int widht;
    int height;

    public Point2D(int x, int y) {
        curX = x;
        curY = y;
        widht = 10;
        height = 10;
    }
    public int getX(){return curX;}
    public int getY(){return curY;}
    // public void set(int x) {curX = x; }
    // public void set(int y) {curY = y; }

    
    public boolean isMove(int x, int y){
        return x >= 0 && x < widht && y >= 0 && y < height;
    }
    public void moveTo(int dx, int dy) {
        if (isMove(curX + dx, curY + dy)){
            curX += dx;
            curY += dy;
        }
    }
    public String toString()
    {
        return curX + ":" + curY;        
    }
}