import java.awt.Color;
import java.awt.Graphics;

public class Strawberry extends GraphicsObject {
    int x_int;
    int y_int;

    public Strawberry(double x, double y) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(152, 251, 152));
        g.fillRect(this.x_int, this.y_int, 3, 3);
        g.fillRect(this.x_int - 6, this.y_int + 3, 15, 3);
        g.setColor(new Color(220, 20, 60));
        g.fillRect(this.x_int - 9, this.y_int + 6, 6, 3);
        g.setColor(new Color(152, 251, 152));
        g.fillRect(this.x_int - 3, this.y_int + 6, 9, 3);
        g.setColor(new Color(220, 20, 60));
        g.fillRect(this.x_int + 6, this.y_int + 6, 6, 3);
        g.fillRect(this.x_int - 9, this.y_int + 9, 3, 3);
        g.setColor(new Color(240, 128, 128));
        g.fillRect(this.x_int - 6, this.y_int + 9, 3, 3);
        g.setColor(new Color(220, 20, 60));
        g.fillRect(this.x_int - 3, this.y_int + 9, 3, 3);
        g.setColor(new Color(152, 251, 152));
        g.fillRect(this.x_int, this.y_int + 9, 3, 3);
        g.setColor(new Color(220, 20, 60));
        g.fillRect(this.x_int + 3, this.y_int + 9, 9, 3);
        g.fillRect(this.x_int - 9, this.y_int + 12, 21, 3);
        g.fillRect(this.x_int - 6, this.y_int + 15, 15, 3);
        g.fillRect(this.x_int - 6, this.y_int + 18, 15, 3);
        g.fillRect(this.x_int - 3, this.y_int + 21, 9, 3);
    }

    @Override
    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
        this.y_int += (int)this.speed_y;
    }

    public int getX_int() {
        return this.x_int;
    }

    public int getY_int() {
        return this.y_int;
    }

    public boolean collidesWith(Player Pacman) {
        double strawberryLeft = this.getX_int() - 9;
        double strawberryRight = this.getX_int() + 12;
        double strawberryTop = this.getY_int();
        double strawberryBottom = this.getY_int() + 21;
        double PacmanLeft = Pacman.getX_int() - 15;
        double PacmanRight = Pacman.getX_int() + 24;
        double PacmanTop = Pacman.getY_int();
        double PacmanBottom = Pacman.getY_int() + 42;
        return strawberryRight >= PacmanLeft && strawberryLeft <= PacmanRight && strawberryBottom >= PacmanTop && strawberryTop <= PacmanBottom;
    }
}