import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BreakoutGame extends JPanel implements ActionListener {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private Timer timer;
    private int ballX = WIDTH / 2, ballY = HEIGHT / 2, ballXSpeed = 2, ballYSpeed = -2;
    private int paddleX = WIDTH / 2 - 50, paddleY = HEIGHT - 30, paddleWidth = 100;
    private boolean[] bricks;
    private final int ROWS = 5;
    private final int COLS = 8;

    public BreakoutGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        bricks = new boolean[ROWS * COLS];
        for (int i = 0; i < bricks.length; i++) bricks[i] = true;

        timer = new Timer(5, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
                    paddleX -= 15;
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < WIDTH - paddleWidth) {
                    paddleX += 15;
                }
            }
        });
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBricks(g);
        drawPaddle(g);
        drawBall(g);
    }

    private void drawBricks(Graphics g) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (bricks[row * COLS + col]) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(col * 100 + 20, row * 30 + 50, 80, 20);
                }
            }
        }
    }

    private void drawPaddle(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(paddleX, paddleY, paddleWidth, 10);
    }

    private void drawBall(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 15, 15);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += ballXSpeed;
        ballY += ballYSpeed;

        if (ballX < 0 || ballX > WIDTH - 15) ballXSpeed = -ballXSpeed;
        if (ballY < 0) ballYSpeed = -ballYSpeed;

        // Paddle collision
        if (ballY >= paddleY - 15 && ballX >= paddleX && ballX <= paddleX + paddleWidth) {
            ballYSpeed = -ballYSpeed;
            ballY = paddleY - 15; // Reset position
        }

        // Brick collision
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int brickIndex = row * COLS + col;
                if (bricks[brickIndex]) {
                    int brickX = col * 100 + 20;
                    int brickY = row * 30 + 50;
                    if (ballX + 15 >= brickX && ballX <= brickX + 80 && ballY + 15 >= brickY && ballY <= brickY + 20) {
                        bricks[brickIndex] = false;
                        ballYSpeed = -ballYSpeed;
                    }
                }
            }
        }

        // Game over condition
        if (ballY > HEIGHT) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over!");
            System.exit(0);
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakout Game");
        BreakoutGame game = new BreakoutGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
