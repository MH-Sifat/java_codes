
import java.awt.*;

public abstract class GameEntity {
    protected int x, y, size;

    public GameEntity(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public abstract void draw(Graphics g);

    // Getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
