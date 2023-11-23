import java.awt.Color;
import java.awt.Graphics;

public class Player extends GraphicsObject {
    int x_int;
    int y_int;

    public Player(double x, double y) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int, this.y_int, 15, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 6, this.y_int + 3, 6, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int, this.y_int + 3, 15, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 15, this.y_int + 3, 6, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 9, this.y_int + 6, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 6, this.y_int + 6, 27, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 21, this.y_int + 6, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 12, this.y_int + 9, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 9, this.y_int + 9, 33, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 9, this.y_int + 9, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 24, this.y_int + 9, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 12, this.y_int + 12, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 9, this.y_int + 12, 33, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 24, this.y_int + 12, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 15, this.y_int + 15, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 12, this.y_int + 15, 30, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 18, this.y_int + 15, 6, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 15, this.y_int + 18, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 12, this.y_int + 18, 21, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 9, this.y_int + 18, 9, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 15, this.y_int + 21, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 12, this.y_int + 21, 12, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int, this.y_int + 21, 9, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 15, this.y_int + 24, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 12, this.y_int + 24, 21, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 9, this.y_int + 24, 9, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 15, this.y_int + 27, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 12, this.y_int + 27, 30, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 18, this.y_int + 27, 6, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 12, this.y_int + 30, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 9, this.y_int + 30, 33, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 24, this.y_int + 30, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 12, this.y_int + 33, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 9, this.y_int + 33, 33, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 24, this.y_int + 33, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 9, this.y_int + 36, 3, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int - 6, this.y_int + 36, 27, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 21, this.y_int + 36, 3, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int - 6, this.y_int + 39, 6, 3);
        g.setColor(new Color(255, 255, 0));
        g.fillRect(this.x_int, this.y_int + 39, 15, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int + 15, this.y_int + 39, 6, 3);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.x_int, this.y_int + 42, 15, 3);
    }

    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
        this.x_int += (int)this.speed_x;
        if (this.x_int < -25) {
            this.x_int = pic_width - 5;
        }
        if (this.x_int > pic_width) {
            this.x_int = -10;
        }
    }

    public int getX_int() {
        return this.x_int;
    }

    public int getY_int() {
        return this.y_int;
    }
}