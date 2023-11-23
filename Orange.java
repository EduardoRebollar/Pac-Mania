import java.awt.Color;
import java.awt.Graphics;

public class Orange extends GraphicsObject {
    int x_int;
    int y_int;

    public Orange(double x, double y) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int, this.y_int, 6, 3);
        g.setColor(new Color(34, 139, 34));
        g.fillRect(this.x_int + 6, this.y_int, 3, 3);
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int + 9, this.y_int, 3, 3);
        g.fillRect(this.x_int - 3, this.y_int + 3, 6, 3);
        g.setColor(new Color(34, 139, 34));
        g.fillRect(this.x_int + 3, this.y_int + 3, 9, 3);
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int + 12, this.y_int + 3, 3, 3);
        g.fillRect(this.x_int - 6, this.y_int + 6, 12, 3);
        g.setColor(new Color(34, 139, 34));
        g.fillRect(this.x_int + 6, this.y_int + 6, 3, 3);
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int + 9, this.y_int + 6, 9, 3);
        g.fillRect(this.x_int - 6, this.y_int + 9, 18, 3);
        g.setColor(new Color(255, 215, 0));
        g.fillRect(this.x_int + 12, this.y_int + 9, 3, 3);
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int + 15, this.y_int + 9, 3, 3);
        g.fillRect(this.x_int - 6, this.y_int + 12, 18, 3);
        g.setColor(new Color(255, 215, 0));
        g.fillRect(this.x_int + 12, this.y_int + 12, 3, 3);
        g.setColor(new Color(255, 165, 0));
        g.fillRect(this.x_int + 15, this.y_int + 12, 3, 3);
        g.fillRect(this.x_int - 6, this.y_int + 15, 24, 3);
        g.fillRect(this.x_int - 3, this.y_int + 18, 18, 3);
        g.fillRect(this.x_int, this.y_int + 21, 12, 3);
    }

    @Override
    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
        this.y_int -= (int)this.speed_y;
    }

    public int getX_int() {
        return this.x_int;
    }

    public int getY_int() {
        return this.y_int;
    }
}