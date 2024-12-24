package maze;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
    Grid grid = new Grid();
    Maze main = new Maze();
    private final int w = 100;
    private final int h = 100;
    JFrame frame = new JFrame("MAZE");
    JButton[][] buttons = new JButton[100][100];
    char[][] maze;
    int x;
    int y;
    private String rpos;

    public GUI() {
        this.maze = this.grid.getGrid();
        this.x = 1;
        this.y = 3;
    }

    public void createMaze() {
        this.frame.setLayout(new GridLayout(100, 100));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.pack();
        this.frame.setSize(1300, 700);

        for(int var1 = 0; var1 < 100; ++var1) {
            for(int var2 = 0; var2 < 100; ++var2) {
                this.buttons[var1][var2] = new JButton();
                this.frame.add(this.buttons[var1][var2]);
                this.buttons[var1][var2].setSize(7, 7);
                this.buttons[var1][var2].setBorderPainted(false);
            }
        }

        this.frame.setVisible(true);
        this.updateColor();
    }

    public void updateColor() {
        for(int var1 = 0; var1 < 100; ++var1) {
            for(int var2 = 0; var2 < 100; ++var2) {
                if (this.maze[var1][var2] == 'w') {
                    this.buttons[var1][var2].setBackground(Color.BLACK);
                    this.buttons[var1][var2].setForeground(Color.BLACK);
                } else if (this.maze[var1][var2] == 'p') {
                    this.buttons[var1][var2].setBackground(Color.ORANGE);
                    this.buttons[var1][var2].setForeground(Color.ORANGE);
                } else if (this.maze[var1][var2] == 'r') {
                    this.buttons[var1][var2].setBackground(Color.RED);
                    this.buttons[var1][var2].setForeground(Color.RED);
                } else {
                    this.buttons[var1][var2].setBackground(Color.MAGENTA);
                    this.buttons[var1][var2].setForeground(Color.MAGENTA);
                }
            }
        }
    }

    public void updateColorn(char[][] var1) {
        for(int var2 = 0; var2 < 100; ++var2) {
            for(int var3 = 0; var3 < 100; ++var3) {
                if (var1[var2][var3] == 'p') {
                    this.buttons[var2][var3].setBackground(Color.ORANGE);
                    this.buttons[var2][var3].setForeground(Color.ORANGE);
                } else if (var1[var2][var3] == 'r') {
                    this.buttons[var2][var3].setBackground(Color.RED);
                    this.buttons[var2][var3].setForeground(Color.RED);
                }
            }
        }
    }

    public String getString(String var1) {
        this.moveRat(var1);

        try {
            String var2 = String.valueOf(this.maze[this.x - 1][this.y - 1]);
            String var3 = String.valueOf(this.maze[this.x - 1][this.y]);
            String var4 = String.valueOf(this.maze[this.x - 1][this.y + 1]);
            String var5 = String.valueOf(this.maze[this.x][this.y - 1]);
            String var6 = String.valueOf(this.maze[this.x][this.y]);
            String var7 = String.valueOf(this.maze[this.x][this.y + 1]);
            String var8 = String.valueOf(this.maze[this.x + 1][this.y - 1]);
            String var9 = String.valueOf(this.maze[this.x + 1][this.y]);
            String var10 = String.valueOf(this.maze[this.x + 1][this.y + 1]);
            this.rpos = var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
        } catch (ArrayIndexOutOfBoundsException var11) {
            System.err.println("It seems as if the rat stepped out-of-bounds or successfully finished the maze");
        }

        return this.rpos;
    }

    public void moveRat(String var1) {
        if (var1.indexOf(114) == 1) {
            this.maze[this.x][this.y] = 'p';
            --this.x;
            this.maze[this.x][this.y] = 'r';
        }

        if (var1.indexOf(114) == 3) {
            this.maze[this.x][this.y] = 'p';
            --this.y;
            this.maze[this.x][this.y] = 'r';
        }

        if (var1.indexOf(114) == 5) {
            this.maze[this.x][this.y] = 'p';
            ++this.y;
            this.maze[this.x][this.y] = 'r';
        }

        if (var1.indexOf(114) == 7) {
            this.maze[this.x][this.y] = 'p';
            ++this.x;
            this.maze[this.x][this.y] = 'r';
        }

        this.main.update(this.maze);
    }
}
