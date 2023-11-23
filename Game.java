// utility
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

// graphics
import java.awt.image.BufferStrategy;

// swing
import javax.swing.JFrame;

// events
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;

public class Game extends Canvas implements KeyListener {

    private int width = 800;
    private int height = 600;
    private int frame_rate = 25;
    private int ms_per_frame = 1000 / frame_rate;

    private BufferStrategy strategy;

    // Initialized my own member variables
    private GameBackground Background;
    public double BACKGROUND_X = 0;
    public double BACKGROUND_Y = 0;

    private Player Pacman;
    public double PACMAN_X = 380;
    public double PACMAN_Y = 500;

    private Enemies Ghosts;
    private Enemies Ghosts2;
    private Enemies Ghosts3;
    private Enemies Ghosts4;
    private Enemies Ghosts5;
    private Enemies Ghosts6;
    private Enemies Ghosts7;
    private Enemies Ghosts8;
    private Enemies Ghosts9;
    private Enemies Ghosts10;
    private Enemies Ghosts11;
    private Enemies Ghosts12;
    private Enemies Ghosts13;
    private Enemies Ghosts14;
    private Enemies Ghosts15;
    private Enemies Ghosts16;
    private Enemies Ghosts17;
    private Enemies Ghosts18;
    private Enemies Ghosts19;
    private Enemies Ghosts20;
    private Enemies Ghosts21;
    private Enemies Ghosts22;
    private Enemies Ghosts23;
    private Enemies Ghosts24;
    private Enemies Ghosts25;
    private Enemies Ghosts26;
    private Enemies Ghosts27;
    private Enemies Ghosts28;
    private Enemies Ghosts29;
    private Enemies Ghosts30;
    private Enemies Ghosts31;
    private Enemies Ghosts32;
    private Enemies Ghosts33;
    private Enemies Ghosts34;
    private Enemies Ghosts35;
    private Enemies Ghosts36;
    private Enemies Ghosts37;
    private Enemies Ghosts38;
    private Enemies Ghosts39;
    private Enemies Ghosts40;
    private Enemies Ghosts41;
    private Enemies Ghosts42;
    private Enemies Ghosts43;
    private Enemies Ghosts44;
    private Enemies Ghosts45;
    private Enemies Ghosts46;
    private Enemies Ghosts47;
    private Enemies Ghosts48;
    private Enemies Ghosts49;
    private Enemies Ghosts50;
    private Enemies Ghosts51;
    private Enemies Ghosts52;
    private Enemies Ghosts53;
    private Enemies Ghosts54;
    private Enemies Ghosts55;
    private Enemies Ghosts56;
    private Enemies Ghosts57;
    private Enemies Ghosts58;
    private Enemies Ghosts59;
    private Enemies Ghosts60;

    private WinGameScreen Win;

    private LoseGameScreen Lose;
    ArrayList<Enemies> ghosts = new ArrayList<Enemies>();

    private ArrayList<Orange> oranges = new ArrayList<>();

    private ArrayList<Strawberry> strawberries = new ArrayList<>();


    public double GHOSTS_X = 50;
    public double GHOSTS_Y = 50;

    /**
     * Constructor.
     *
     * @param width  The width of the window.
     * @param height  The height of the window.
     */
    public Game(int width, int height) {
        this(width, height, 25);
    }

    /**
     * Constructor.
     *
     * @param width  The width of the window.
     * @param height  The height of the window.
     * @param frame_rate  The frame rate.
     */
    public Game(int width, int height, int frame_rate) {
        this.width = width;
        this.height = height;
        this.frame_rate = frame_rate;
        this.ms_per_frame = 1000 / this.frame_rate;
        this.setupWindow();
    }

    private void setupWindow() {
        // create a window
        JFrame jframe = new JFrame("Game");

        // set the resolution of the window
        Container pane = jframe.getContentPane();
        pane.setPreferredSize(new Dimension(this.width, this.height));
        pane.setLayout(null);

        // set the resolution of the canvas and add it to the window
        this.setBounds(0, 0, this.width, this.height);
        this.setIgnoreRepaint(true);
        pane.add(this);

        // make the window visible
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);

        // exit the program when the window is closed
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // respond to key presses
        this.requestFocus();
        this.addKeyListener(this);

        // use a double buffer
        this.createBufferStrategy(2);
        strategy = this.getBufferStrategy();

        // create all objects
        this.createObjects();
    }

    // Created my own objects
    private void createObjects() {
        Background = new GameBackground(BACKGROUND_X, BACKGROUND_Y, width, height);
        Win = new WinGameScreen(BACKGROUND_X,BACKGROUND_Y);
        Lose = new LoseGameScreen(BACKGROUND_X,BACKGROUND_Y);
        Pacman = new Player(PACMAN_X, PACMAN_Y);
        Ghosts = new Enemies(GHOSTS_X,GHOSTS_Y, Color.RED);
        Ghosts2= new Enemies(GHOSTS_X + 60, GHOSTS_Y, Color.ORANGE);
        Ghosts3= new Enemies(GHOSTS_X + 120, GHOSTS_Y, Color.PINK);
        Ghosts4= new Enemies(GHOSTS_X + 180, GHOSTS_Y, Color.CYAN);
        Ghosts5= new Enemies(GHOSTS_X + 240, GHOSTS_Y, Color.RED);
        Ghosts6= new Enemies(GHOSTS_X + 300, GHOSTS_Y, Color.ORANGE);
        Ghosts7= new Enemies(GHOSTS_X + 360, GHOSTS_Y, Color.PINK);
        Ghosts8= new Enemies(GHOSTS_X + 420, GHOSTS_Y, Color.CYAN);
        Ghosts9= new Enemies(GHOSTS_X + 480, GHOSTS_Y, Color.RED);
        Ghosts10= new Enemies(GHOSTS_X + 540, GHOSTS_Y, Color.ORANGE);
        Ghosts11= new Enemies(GHOSTS_X + 600, GHOSTS_Y, Color.PINK);
        Ghosts12= new Enemies(GHOSTS_X + 660, GHOSTS_Y, Color.CYAN);
        Ghosts13= new Enemies(GHOSTS_X,GHOSTS_Y+60, Color.ORANGE);
        Ghosts14= new Enemies(GHOSTS_X + 60, GHOSTS_Y+60, Color.PINK);
        Ghosts15= new Enemies(GHOSTS_X + 120, GHOSTS_Y+60, Color.CYAN);
        Ghosts16= new Enemies(GHOSTS_X + 180, GHOSTS_Y+60, Color.RED);
        Ghosts17= new Enemies(GHOSTS_X + 240, GHOSTS_Y+60, Color.ORANGE);
        Ghosts18= new Enemies(GHOSTS_X + 300, GHOSTS_Y+60, Color.PINK);
        Ghosts19= new Enemies(GHOSTS_X + 360, GHOSTS_Y+60, Color.CYAN);
        Ghosts20= new Enemies(GHOSTS_X + 420, GHOSTS_Y+60, Color.RED);
        Ghosts21= new Enemies(GHOSTS_X + 480, GHOSTS_Y+60, Color.ORANGE);
        Ghosts22= new Enemies(GHOSTS_X + 540, GHOSTS_Y+60, Color.PINK);
        Ghosts23= new Enemies(GHOSTS_X + 600, GHOSTS_Y+60, Color.CYAN);
        Ghosts24= new Enemies(GHOSTS_X + 660, GHOSTS_Y+60, Color.RED);
        Ghosts25= new Enemies(GHOSTS_X,GHOSTS_Y+120, Color.PINK);
        Ghosts26= new Enemies(GHOSTS_X + 60, GHOSTS_Y+120, Color.CYAN);
        Ghosts27= new Enemies(GHOSTS_X + 120, GHOSTS_Y+120, Color.RED);
        Ghosts28= new Enemies(GHOSTS_X + 180, GHOSTS_Y+120, Color.ORANGE);
        Ghosts29= new Enemies(GHOSTS_X + 240, GHOSTS_Y+120, Color.PINK);
        Ghosts30= new Enemies(GHOSTS_X + 300, GHOSTS_Y+120, Color.CYAN);
        Ghosts31= new Enemies(GHOSTS_X + 360, GHOSTS_Y+120, Color.RED);
        Ghosts32= new Enemies(GHOSTS_X + 420, GHOSTS_Y+120, Color.ORANGE);
        Ghosts33= new Enemies(GHOSTS_X + 480, GHOSTS_Y+120, Color.PINK);
        Ghosts34= new Enemies(GHOSTS_X + 540, GHOSTS_Y+120, Color.CYAN);
        Ghosts35= new Enemies(GHOSTS_X + 600, GHOSTS_Y+120, Color.RED);
        Ghosts36= new Enemies(GHOSTS_X + 660, GHOSTS_Y+120, Color.ORANGE);
        Ghosts37= new Enemies(GHOSTS_X,GHOSTS_Y+180, Color.CYAN);
        Ghosts38= new Enemies(GHOSTS_X + 60, GHOSTS_Y+180, Color.RED);
        Ghosts39= new Enemies(GHOSTS_X + 120, GHOSTS_Y+180, Color.ORANGE);
        Ghosts40= new Enemies(GHOSTS_X + 180, GHOSTS_Y+180, Color.PINK);
        Ghosts41 = new Enemies(GHOSTS_X + 240, GHOSTS_Y + 180, Color.CYAN);
        Ghosts42= new Enemies(GHOSTS_X + 300, GHOSTS_Y+180, Color.RED);
        Ghosts43= new Enemies(GHOSTS_X + 360, GHOSTS_Y+180, Color.ORANGE);
        Ghosts44= new Enemies(GHOSTS_X + 420, GHOSTS_Y+180, Color.PINK);
        Ghosts45= new Enemies(GHOSTS_X + 480, GHOSTS_Y+180, Color.CYAN);
        Ghosts46= new Enemies(GHOSTS_X + 540, GHOSTS_Y+180, Color.RED);
        Ghosts47= new Enemies(GHOSTS_X + 600, GHOSTS_Y+180, Color.ORANGE);
        Ghosts48= new Enemies(GHOSTS_X + 660, GHOSTS_Y+180, Color.PINK);
        Ghosts49= new Enemies(GHOSTS_X,GHOSTS_Y+240, Color.RED);
        Ghosts50= new Enemies(GHOSTS_X + 60, GHOSTS_Y+240, Color.ORANGE);
        Ghosts51= new Enemies(GHOSTS_X + 120, GHOSTS_Y+240, Color.PINK);
        Ghosts52= new Enemies(GHOSTS_X + 180, GHOSTS_Y+240, Color.CYAN);
        Ghosts53= new Enemies(GHOSTS_X + 240, GHOSTS_Y+240, Color.RED);
        Ghosts54= new Enemies(GHOSTS_X + 300, GHOSTS_Y+240, Color.ORANGE);
        Ghosts55= new Enemies(GHOSTS_X + 360, GHOSTS_Y+240, Color.PINK);
        Ghosts56= new Enemies(GHOSTS_X + 420, GHOSTS_Y+240, Color.CYAN);
        Ghosts57= new Enemies(GHOSTS_X + 480, GHOSTS_Y+240, Color.RED);
        Ghosts58= new Enemies(GHOSTS_X + 540, GHOSTS_Y+240, Color.ORANGE);
        Ghosts59= new Enemies(GHOSTS_X + 600, GHOSTS_Y+240, Color.PINK);
        Ghosts60= new Enemies(GHOSTS_X + 660, GHOSTS_Y+240, Color.CYAN);

        ghosts.add(Ghosts);
        ghosts.add(Ghosts2);
        ghosts.add(Ghosts3);
        ghosts.add(Ghosts4);
        ghosts.add(Ghosts5);
        ghosts.add(Ghosts6);
        ghosts.add(Ghosts7);
        ghosts.add(Ghosts8);
        ghosts.add(Ghosts9);
        ghosts.add(Ghosts10);
        ghosts.add(Ghosts11);
        ghosts.add(Ghosts12);
        ghosts.add(Ghosts13);
        ghosts.add(Ghosts14);
        ghosts.add(Ghosts15);
        ghosts.add(Ghosts16);
        ghosts.add(Ghosts17);
        ghosts.add(Ghosts18);
        ghosts.add(Ghosts19);
        ghosts.add(Ghosts20);
        ghosts.add(Ghosts21);
        ghosts.add(Ghosts22);
        ghosts.add(Ghosts23);
        ghosts.add(Ghosts24);
        ghosts.add(Ghosts25);
        ghosts.add(Ghosts26);
        ghosts.add(Ghosts27);
        ghosts.add(Ghosts28);
        ghosts.add(Ghosts29);
        ghosts.add(Ghosts30);
        ghosts.add(Ghosts31);
        ghosts.add(Ghosts32);
        ghosts.add(Ghosts33);
        ghosts.add(Ghosts34);
        ghosts.add(Ghosts35);
        ghosts.add(Ghosts36);
        ghosts.add(Ghosts37);
        ghosts.add(Ghosts38);
        ghosts.add(Ghosts39);
        ghosts.add(Ghosts40);
        ghosts.add(Ghosts41);
        ghosts.add(Ghosts42);
        ghosts.add(Ghosts43);
        ghosts.add(Ghosts44);
        ghosts.add(Ghosts45);
        ghosts.add(Ghosts46);
        ghosts.add(Ghosts47);
        ghosts.add(Ghosts48);
        ghosts.add(Ghosts49);
        ghosts.add(Ghosts50);
        ghosts.add(Ghosts51);
        ghosts.add(Ghosts52);
        ghosts.add(Ghosts53);
        ghosts.add(Ghosts54);
        ghosts.add(Ghosts55);
        ghosts.add(Ghosts56);
        ghosts.add(Ghosts57);
        ghosts.add(Ghosts58);
        ghosts.add(Ghosts59);
        ghosts.add(Ghosts60);
    }

    /**
     * Respond to key type events.
     *
     * A key type is when a character is typed.
     *
     * @param event  An object describing what key was typed.
     */
    public void keyTyped(KeyEvent event) {
        // This function is part of the KeyListener interface.
        // You can leave this function empty.
    }

    /**
     * Respond to key release events.
     *
     * A key release is when you let go of a key.
     *
     * @param event  An object describing what key was released
     */
    public void keyReleased(KeyEvent event) {
        // This function is part of the KeyListener interface.
        // You can leave this function empty.
    }

    /**
     * Respond to key press events.
     *
     * A key type is when you press then let go of a key.
     *
     * @param event  An object describing what key was typed.
     */
    public void keyPressed(KeyEvent event) {
        if (this.hasWonGame() || this.hasLostGame()) {
            return;
        }
        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            Pacman.speed_x = -10;
        } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            Pacman.speed_x = 10;
        } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {
            Orange newOrange = new Orange(Pacman.getX_int(), PACMAN_Y);
            newOrange.speed_y = 10;
            oranges.add(newOrange);
        }
    }

    /**
     * Update the objects.
     *
     * @param frame  The frame number.
     */
    private void update(int frame) {
        if (this.hasWonGame() || this.hasLostGame()) {
            return;
        }
        // Updated Game Objects
        Pacman.update(width, height, frame);

        for (int i = 0; i < oranges.size(); i++) {
            Orange orange = oranges.get(i);
            oranges.get(i).update(width, height, frame);
            if (orange.getY_int() < 0) {
                oranges.remove(i);
                i--;
            }
        }

        for (int i = 0; i < ghosts.size(); i++) {
            ghosts.get(i).update(width, height, frame);
            ghosts.get(i).update(width, height, frame);
            Random rand = new Random();
            int int_random = rand.nextInt(1000);
            if (int_random == 1) {
                Strawberry newStrawberry = new Strawberry(ghosts.get(i).getX(), ghosts.get(i).getY());
                newStrawberry.speed_y = 10;
                strawberries.add(newStrawberry);
            }
            for (int j = 0; j < oranges.size(); j++) {
                Orange orange = oranges.get(j);
                if (ghosts.get(i).collidesWith(orange)) {
                    ghosts.remove(i);
                    oranges.remove(j);
                    i--;
                    break;
                }
            }
            if (hasLostGame()) {
                drawLoseScreen(this.strategy.getDrawGraphics());
                return;
            }
            if (hasWonGame()){
                drawWinScreen(this.strategy.getDrawGraphics());
                return;
            }
        }
        for (int i = 0; i < strawberries.size(); i++) {
            Strawberry strawberry = strawberries.get(i);
            strawberries.get(i).update(width, height, frame);
            if (strawberry.getY_int() > height) {
                strawberries.remove(i);
                i--;
            }
        }
    }
    /**
     * Clear the screen.
     */
    private void clear() {
        Graphics graphics = this.strategy.getDrawGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, this.width, this.height);
    }

    /**
     * Draw the objects.
     */
    private void draw() {
        Graphics graphics = this.strategy.getDrawGraphics();
        if (this.hasWonGame()) {
            drawWinScreen(graphics);
        } else if (hasLostGame()) {
            drawLoseScreen(graphics);
        } else {
            drawGameScreen(graphics);
        }
    }

    /* Check if the player has lost the game
     *
     * @returns  true if the player has lost, false otherwise
     */
    private boolean hasLostGame() {
        for (int i = 0; i < ghosts.size(); i++) {
            if (ghosts.get(i).collidesWith(Pacman)){
                return true;
            }
            if (ghosts.get(i).getY()+10> height){
                return true;
            }
        }
        for (int i = 0; i < strawberries.size(); i++) {
            if (strawberries.get(i).collidesWith(Pacman)){
                return true;
            }
        }
        return false;
    }

    /* Check if the player has won the game
     *
     * @returns  true if the player has won, false otherwise
     */
    private boolean hasWonGame() {
        return ghosts.isEmpty();
    }

    /**
     * Draw the screen during normal gameplay.
     *
     * @param g The Graphics for the JPanel.
     */
    private void drawGameScreen(Graphics g) {
        // Drew my game objects
        Background.draw(g);
        Pacman.draw(g);
        for (int i = 0; i < ghosts.size(); i++){
            ghosts.get(i).draw(g);
        }
        for (int i = 0; i <oranges.size(); i++) {
            oranges.get(i).draw(g);
        }
        for (int i = 0; i < strawberries.size(); i++) {
            strawberries.get(i).draw(g);
        }
    }

    /**
     * Draw the screen when the player has won.
     *
     * @param graphics The Graphics for the JPanel.
     */
    private void drawWinScreen(Graphics graphics) {
        clear();
        Win.draw(graphics);
    }

    /**
     * Draw the screen when the player has lost.
     *
     * @param graphics The Graphics for the JPanel.
     */
    private void drawLoseScreen(Graphics graphics) {
        clear();
        Lose.draw(graphics);
    }

    /**
     * Display everything that has been drawn.
     */
    private void display() {
        this.strategy.getDrawGraphics().dispose();
        this.strategy.show();
    }

    /**
     * Pause to reduce the frame rate.
     */
    private void pause() {
        try {
            Thread.sleep(this.ms_per_frame);
        } catch (Exception e) {
        }
    }

    /**
     * Start the game.
     */
    public void main() {
        int frame = 0;
        while (true) {
            frame++;
            this.update(frame);
            this.clear();
            this.draw();
            this.display();
            this.pause();
        }
    }

    public static void main(String[] args) {
        Game game = new Game(800, 600);
        game.main();
    }

}