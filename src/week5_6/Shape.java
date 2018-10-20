package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * class hình
 */
public abstract class Shape{
    protected Color color = new Color((new Random()).nextInt(255),(new Random()).nextInt(255),(new Random()).nextInt(255));

    public void setColor(Color c) {
        color = c;
    }
    public Color getColor() {
        return color;
    }

    public abstract void Update();

}
class ToaDo{
    private int x,y;

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}