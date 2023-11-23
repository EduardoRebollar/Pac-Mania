import java.awt.Color;
import java.awt.Graphics;

public class Enemies extends GraphicsObject {
    int x_int;
    int y_int;
    static double speed_enemies_x = 1.0;
    static double speed_enemies_y = 5.0;
    Color color;

    public Enemies(double x, double y, Color color) {
        super(x, y);
        this.x_int = (int)x;
        this.y_int = (int)y;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x_int, this.y_int, 9, 3);
        g.fillRect(this.x_int - 6, this.y_int + 3, 21, 3);
        g.fillRect(this.x_int - 9, this.y_int + 6, 27, 3);
        g.fillRect(this.x_int - 12, this.y_int + 9, 9, 3);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(this.x_int - 3, this.y_int + 9, 6, 3);
        g.setColor(this.color);
        g.fillRect(this.x_int + 3, this.y_int + 9, 9, 3);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(this.x_int + 12, this.y_int + 9, 6, 3);
        g.setColor(this.color);
        g.fillRect(this.x_int + 18, this.y_int + 9, 3, 3);
        if (this.color == Color.CYAN) {
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 12, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 12, 6, 3);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int, this.y_int + 12, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 12, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 12, 6, 3);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int + 15, this.y_int + 12, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 15, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 15, 6, 3);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int, this.y_int + 15, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 15, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 15, 6, 3);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int + 15, this.y_int + 15, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 15, this.y_int + 18, 9, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 18, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 18, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 18, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 21, this.y_int + 18, 3, 3);
        }

        if (this.color == Color.PINK) {
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 12, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 12, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int, this.y_int + 12, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 12, 3, 6);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 12, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 15, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 15, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 3, this.y_int + 15, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 15, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 18, this.y_int + 15, 3, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 15, this.y_int + 18, 9, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 18, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 18, 3, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 18, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 21, this.y_int + 18, 3, 3);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int - 3, this.y_int + 15, 6, 9);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int + 12, this.y_int + 15, 6, 9);
        }

        if (this.color == Color.ORANGE) {
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 12, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 12, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 12, 3, 9);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 12, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 15, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 15, this.y_int + 18, 9, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 15, 12, 6);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 15, 12, 6);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int - 3, this.y_int + 12, 6, 6);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int + 12, this.y_int + 12, 6, 6);
        }

        if (this.color == Color.RED) {
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 12, 6, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 12, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int + 6, this.y_int + 12, 3, 9);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 12, 12, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 12, this.y_int + 15, 6, 3);
            g.setColor(this.color);
            g.fillRect(this.x_int - 15, this.y_int + 18, 9, 3);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int - 6, this.y_int + 15, 12, 6);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(this.x_int + 9, this.y_int + 15, 12, 6);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int - 6, this.y_int + 15, 6, 6);
            g.setColor(new Color(45, 114, 178));
            g.fillRect(this.x_int + 9, this.y_int + 15, 6, 6);
        }

        g.setColor(this.color);
        g.fillRect(this.x_int - 15, this.y_int + 21, 12, 3);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(this.x_int - 3, this.y_int + 21, 6, 3);
        g.setColor(this.color);
        g.fillRect(this.x_int + 3, this.y_int + 21, 9, 3);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(this.x_int + 12, this.y_int + 21, 6, 3);
        g.setColor(this.color);
        g.fillRect(this.x_int + 18, this.y_int + 21, 6, 3);
        g.fillRect(this.x_int - 15, this.y_int + 24, 39, 3);
        g.fillRect(this.x_int - 15, this.y_int + 27, 39, 3);
        g.fillRect(this.x_int - 15, this.y_int + 30, 39, 3);
        g.fillRect(this.x_int - 15, this.y_int + 33, 39, 3);
        g.fillRect(this.x_int - 15, this.y_int + 36, 6, 3);
        g.fillRect(this.x_int - 6, this.y_int + 36, 6, 3);
        g.fillRect(this.x_int + 6, this.y_int + 36, 9, 3);
        g.fillRect(this.x_int + 18, this.y_int + 36, 6, 3);
        g.fillRect(this.x_int - 15, this.y_int + 39, 3, 3);
        g.fillRect(this.x_int - 3, this.y_int + 39, 3, 3);
        g.fillRect(this.x_int + 6, this.y_int + 39, 6, 3);
        g.fillRect(this.x_int + 21, this.y_int + 39, 3, 3);
    }

    @Override
    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
        this.x_int += (int)speed_enemies_x;
        if (frame % 30 == 0) {
            this.x_int -= 30;
            this.y_int += (int)speed_enemies_y;
        }

    }

    public int getX() {
        return this.x_int;
    }

    public int getY() {
        return this.y_int;
    }

    public boolean collidesWith(Orange orange) {
        double enemyLeft = this.getX() - 15;
        double enemyRight = this.getX() + 24;
        double enemyTop = this.getY();
        double enemyBottom = this.getY() + 39;
        double orangeLeft = orange.getX_int() - 6;
        double orangeRight = orange.getX_int() + 24;
        double orangeTop = orange.getY_int();
        double orangeBottom = orange.getY_int() + 21;
        return enemyRight >= orangeLeft && enemyLeft <= orangeRight && enemyBottom >= orangeTop && enemyTop <= orangeBottom;
    }

    public boolean collidesWith(Player Pacman) {
        double enemyLeft = this.getX() - 15;
        double enemyRight = this.getX() + 24;
        double enemyTop = this.getY();
        double enemyBottom = this.getY() + 39;
        double PacmanLeft = Pacman.getX_int() - 15;
        double PacmanRight = Pacman.getX_int() + 24;
        double PacmanTop = Pacman.getY_int();
        double PacmanBottom = Pacman.getY_int() + 42;
        return enemyRight >= PacmanLeft && enemyLeft <= PacmanRight && enemyBottom >= PacmanTop && enemyTop <= PacmanBottom;
    }
}
