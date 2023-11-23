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

    // width of the window
    private int width = 800;

    // height of the window
    private int height = 600;

    // frame-rate of the window
    private int frame_rate = 25;
    private int ms_per_frame = 1000 / frame_rate;

    private BufferStrategy strategy;

    // Initialization of variables (class instances)
    private GameBackground Background;
    public double BACKGROUND_X = 0;
    public double BACKGROUND_Y = 0;

    private Player Pacman;
    public double PACMAN_X = 380;
    public double PACMAN_Y = 500;

    private Text Level1_Text;
    private Text Level2_Text;
    private Text Level3_Text;
    public double Level_X = 820;
    public double Level_Y = 35 ;

    int level = 0;

    private WinGameScreen Win;
    private LoseGameScreen Lose;

    // Initialized instances of Enemies (Ghosts) in createObjects function
    public double GHOSTS_X = 50;
    public double GHOSTS_Y = 50;
    ArrayList<Enemies> ghosts = new ArrayList<Enemies>();

    private ArrayList<Orange> oranges = new ArrayList<>();

    private ArrayList<Strawberry> strawberries = new ArrayList<>();

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

    // Creates the objects
    private void createObjects() {
        Background = new GameBackground(BACKGROUND_X, BACKGROUND_Y, width, height);
        Win = new WinGameScreen(BACKGROUND_X,BACKGROUND_Y);
        Lose = new LoseGameScreen(BACKGROUND_X,BACKGROUND_Y);
        Pacman = new Player(PACMAN_X, PACMAN_Y);
        Level1_Text = new Text(Level_X, Level_Y, "Pac-Mania!");
        Level2_Text = new Text(Level_X, Level_Y, "Level 2!");
        Level3_Text = new Text(Level_X, Level_Y, "Final Level!");
        Enemies Ghosts = new Enemies(GHOSTS_X,GHOSTS_Y, Color.RED);
        Enemies Ghosts2= new Enemies(GHOSTS_X + 60, GHOSTS_Y, Color.ORANGE);
        Enemies Ghosts3= new Enemies(GHOSTS_X + 120, GHOSTS_Y, Color.PINK);
        Enemies Ghosts4= new Enemies(GHOSTS_X + 180, GHOSTS_Y, Color.CYAN);
        Enemies Ghosts5= new Enemies(GHOSTS_X + 240, GHOSTS_Y, Color.RED);
        Enemies Ghosts6= new Enemies(GHOSTS_X + 300, GHOSTS_Y, Color.ORANGE);
        Enemies Ghosts7= new Enemies(GHOSTS_X + 360, GHOSTS_Y, Color.PINK);
        Enemies Ghosts8= new Enemies(GHOSTS_X + 420, GHOSTS_Y, Color.CYAN);
        Enemies Ghosts9= new Enemies(GHOSTS_X + 480, GHOSTS_Y, Color.RED);
        Enemies Ghosts10= new Enemies(GHOSTS_X + 540, GHOSTS_Y, Color.ORANGE);
        Enemies Ghosts11= new Enemies(GHOSTS_X + 600, GHOSTS_Y, Color.PINK);
        Enemies Ghosts12= new Enemies(GHOSTS_X + 660, GHOSTS_Y, Color.CYAN);
        Enemies Ghosts13= new Enemies(GHOSTS_X,GHOSTS_Y+60, Color.ORANGE);
        Enemies Ghosts14= new Enemies(GHOSTS_X + 60, GHOSTS_Y+60, Color.PINK);
        Enemies Ghosts15= new Enemies(GHOSTS_X + 120, GHOSTS_Y+60, Color.CYAN);
        Enemies Ghosts16= new Enemies(GHOSTS_X + 180, GHOSTS_Y+60, Color.RED);
        Enemies Ghosts17= new Enemies(GHOSTS_X + 240, GHOSTS_Y+60, Color.ORANGE);
        Enemies Ghosts18= new Enemies(GHOSTS_X + 300, GHOSTS_Y+60, Color.PINK);
        Enemies Ghosts19= new Enemies(GHOSTS_X + 360, GHOSTS_Y+60, Color.CYAN);
        Enemies Ghosts20= new Enemies(GHOSTS_X + 420, GHOSTS_Y+60, Color.RED);
        Enemies Ghosts21= new Enemies(GHOSTS_X + 480, GHOSTS_Y+60, Color.ORANGE);
        Enemies Ghosts22= new Enemies(GHOSTS_X + 540, GHOSTS_Y+60, Color.PINK);
        Enemies Ghosts23= new Enemies(GHOSTS_X + 600, GHOSTS_Y+60, Color.CYAN);
        Enemies Ghosts24= new Enemies(GHOSTS_X + 660, GHOSTS_Y+60, Color.RED);
        Enemies Ghosts25= new Enemies(GHOSTS_X,GHOSTS_Y+120, Color.PINK);
        Enemies Ghosts26= new Enemies(GHOSTS_X + 60, GHOSTS_Y+120, Color.CYAN);
        Enemies Ghosts27= new Enemies(GHOSTS_X + 120, GHOSTS_Y+120, Color.RED);
        Enemies Ghosts28= new Enemies(GHOSTS_X + 180, GHOSTS_Y+120, Color.ORANGE);
        Enemies Ghosts29= new Enemies(GHOSTS_X + 240, GHOSTS_Y+120, Color.PINK);
        Enemies Ghosts30= new Enemies(GHOSTS_X + 300, GHOSTS_Y+120, Color.CYAN);
        Enemies Ghosts31= new Enemies(GHOSTS_X + 360, GHOSTS_Y+120, Color.RED);
        Enemies Ghosts32= new Enemies(GHOSTS_X + 420, GHOSTS_Y+120, Color.ORANGE);
        Enemies Ghosts33= new Enemies(GHOSTS_X + 480, GHOSTS_Y+120, Color.PINK);
        Enemies Ghosts34= new Enemies(GHOSTS_X + 540, GHOSTS_Y+120, Color.CYAN);
        Enemies Ghosts35= new Enemies(GHOSTS_X + 600, GHOSTS_Y+120, Color.RED);
        Enemies Ghosts36= new Enemies(GHOSTS_X + 660, GHOSTS_Y+120, Color.ORANGE);
        Enemies Ghosts37= new Enemies(GHOSTS_X,GHOSTS_Y+180, Color.CYAN);
        Enemies Ghosts38= new Enemies(GHOSTS_X + 60, GHOSTS_Y+180, Color.RED);
        Enemies Ghosts39= new Enemies(GHOSTS_X + 120, GHOSTS_Y+180, Color.ORANGE);
        Enemies Ghosts40= new Enemies(GHOSTS_X + 180, GHOSTS_Y+180, Color.PINK);
        Enemies Ghosts41 = new Enemies(GHOSTS_X + 240, GHOSTS_Y + 180, Color.CYAN);
        Enemies Ghosts42= new Enemies(GHOSTS_X + 300, GHOSTS_Y+180, Color.RED);
        Enemies Ghosts43= new Enemies(GHOSTS_X + 360, GHOSTS_Y+180, Color.ORANGE);
        Enemies Ghosts44= new Enemies(GHOSTS_X + 420, GHOSTS_Y+180, Color.PINK);
        Enemies Ghosts45= new Enemies(GHOSTS_X + 480, GHOSTS_Y+180, Color.CYAN);
        Enemies Ghosts46= new Enemies(GHOSTS_X + 540, GHOSTS_Y+180, Color.RED);
        Enemies Ghosts47= new Enemies(GHOSTS_X + 600, GHOSTS_Y+180, Color.ORANGE);
        Enemies Ghosts48= new Enemies(GHOSTS_X + 660, GHOSTS_Y+180, Color.PINK);
        Enemies Ghosts49= new Enemies(GHOSTS_X,GHOSTS_Y+240, Color.RED);
        Enemies Ghosts50= new Enemies(GHOSTS_X + 60, GHOSTS_Y+240, Color.ORANGE);
        Enemies Ghosts51= new Enemies(GHOSTS_X + 120, GHOSTS_Y+240, Color.PINK);
        Enemies Ghosts52= new Enemies(GHOSTS_X + 180, GHOSTS_Y+240, Color.CYAN);
        Enemies Ghosts53= new Enemies(GHOSTS_X + 240, GHOSTS_Y+240, Color.RED);
        Enemies Ghosts54= new Enemies(GHOSTS_X + 300, GHOSTS_Y+240, Color.ORANGE);
        Enemies Ghosts55= new Enemies(GHOSTS_X + 360, GHOSTS_Y+240, Color.PINK);
        Enemies Ghosts56= new Enemies(GHOSTS_X + 420, GHOSTS_Y+240, Color.CYAN);
        Enemies Ghosts57= new Enemies(GHOSTS_X + 480, GHOSTS_Y+240, Color.RED);
        Enemies Ghosts58= new Enemies(GHOSTS_X + 540, GHOSTS_Y+240, Color.ORANGE);
        Enemies Ghosts59= new Enemies(GHOSTS_X + 600, GHOSTS_Y+240, Color.PINK);
        Enemies Ghosts60= new Enemies(GHOSTS_X + 660, GHOSTS_Y+240, Color.CYAN);

        // adds all instances of Enemies class to an arraylist named 'ghosts'
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
        Level1_Text.speed_x = 10;
        Level1_Text.update(width, height, frame);
        if (Level1_Text.x_int == -1000){
            Level1_Text.x_int = (int)Level_X;
        }
        Level2_Text.update(width, height, frame);
        if (Level2_Text.x_int == -1000){
            Level2_Text.x_int = (int)Level_X;
        }
        Level3_Text.update(width, height, frame);
        if (Level3_Text.x_int == -1000){
            Level3_Text.x_int = (int)Level_X;
        }

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
            Random rand = new Random();
            int int_random;
            if (level == 2) {
                Enemies.speed_enemies_y = 13.0;
                int_random = rand.nextInt(700);
            } else if (level == 1){
                Enemies.speed_enemies_y = 9.0;
                int_random = rand.nextInt(1000);
            } else {
                int_random = rand.nextInt(1300);
            }
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
                if (level == 0 && ghosts.isEmpty()){
                    level += 1;
                    resetLevel2();
                    Level2_Text.speed_x = 10;
                } else if (level == 1 && ghosts.isEmpty()){
                    level += 1;
                    resetLevel3();
                    Level3_Text.speed_x = 10;
                } else if (level == 2 && ghosts.isEmpty()){
                    drawWinScreen(this.strategy.getDrawGraphics());
                }
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
    private void resetLevel2(){
        ghosts.clear();
        oranges.clear();
        strawberries.clear();
        int columns = 12; // Number of columns of enemies
        int rows = 5; // Number of rows of enemies
        int startX = (int)GHOSTS_X; // Initial X position of the first enemy
        int startY = (int)GHOSTS_Y; // Initial Y position of the first enemy
        int spacingX = 60; // Horizontal spacing between enemies
        int spacingY = 60; // Vertical spacing between enemies

        Color[] enemyColorsFirstLevel = {Color.RED, Color.ORANGE, Color.PINK, Color.CYAN}; // Colors for enemies

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                // Calculate the position of each enemy based on row and column
                int xPos = startX + col * spacingX;
                int yPos = startY + row * spacingY;

                // Choose an enemy color from the array cyclically for variety
                Color enemyColor = enemyColorsFirstLevel[(row * columns + col) % enemyColorsFirstLevel.length];

                // Create an enemy with the calculated position and color
                Enemies newEnemy = new Enemies(xPos, yPos, enemyColor);

                // Add the newly created enemy to the ghosts ArrayList
                ghosts.add(newEnemy);
                }
            }
        }

    private void resetLevel3(){
        ghosts.clear();
        oranges.clear();
        strawberries.clear();
        int columns = 12; // Number of columns of enemies
        int rows = 5; // Number of rows of enemies
        int startX = (int)GHOSTS_X; // Initial X position of the first enemy
        int startY = (int)GHOSTS_Y; // Initial Y position of the first enemy
        int spacingX = 60; // Horizontal spacing between enemies
        int spacingY = 60; // Vertical spacing between enemies

        ArrayList<Color> enemyColors = new ArrayList<>(); //Arraylist with colors
        // Adds colors to the ArrayList
        enemyColors.add(Color.RED);
        enemyColors.add(Color.ORANGE);
        enemyColors.add(Color.PINK);
        enemyColors.add(Color.CYAN);

        Random random = new Random(); // Random object to generate random indices

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                // Calculate the position of each enemy based on row and column
                int xPos = startX + col * spacingX;
                int yPos = startY + row * spacingY;

                // Get a random index to pick a color from the ArrayList
                int randomIndex = random.nextInt(enemyColors.size());

                // Get the color using the random index
                Color enemyColor = enemyColors.get(randomIndex);

                // Create an enemy with the calculated position and color
                Enemies newEnemy = new Enemies(xPos, yPos, enemyColor);

                // Add the newly created enemy to the ghosts ArrayList
                ghosts.add(newEnemy);
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
        } else if (level == 1){
            drawGameScreen2(graphics);
        } else if (level == 2) {
            drawGameScreen3(graphics);
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
     * Draws the first screen (level1) during normal gameplay.
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
        Level1_Text.draw(g);
    }

    /**
     * Draws the second screen (level2) during normal gameplay.
     *
     * @param g The Graphics for the JPanel.
     */
    private void drawGameScreen2(Graphics g) {
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
        Level2_Text.draw(g);
    }

    /**
     * Draws the last screen (level3) during normal gameplay.
     *
     * @param g The Graphics for the JPanel.
     */
    private void drawGameScreen3(Graphics g) {
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
        Level3_Text.draw(g);
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