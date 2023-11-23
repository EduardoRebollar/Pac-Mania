import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameBackground extends GraphicsObject {
    int x_int;
    int y_int;
    int width;
    int height;

    public GameBackground(double x, double y, int width, int height) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int, this.y_int, this.width, this.height);
    }
}