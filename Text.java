import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Text extends GraphicsObject {
    int x_int;
    int y_int;
    String text;

    public Text(double x, double y, String text) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString(this.text, this.x_int, this.y_int);
    }

    @Override
    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
        this.x_int -= (int)this.speed_x;
    }
}