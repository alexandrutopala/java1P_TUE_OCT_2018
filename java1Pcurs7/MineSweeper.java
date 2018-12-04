import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MineSweeper extends JFrame {
    private JPanel optionsPanel;
    private JPanel playPanel;
    private JButton resetButton;
    private JButton[][] matrix;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    
    private ImageIcon ico1 = new ImageIcon(
        new ImageIcon("smiley.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private ImageIcon ico2 = new ImageIcon(
        new ImageIcon("dead.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private boolean[][] bombs;
    private int dimN;
    private int dimM;
    private int casuteRamase;
    
    public MineSweeper() {
        super("Mine Sweeper");
        initComponents();
        
        
        setSize(600, 600);
        setLocationRelativeTo(null);
    }
    
    private void initComponents() {
        optionsPanel = new JPanel();
        playPanel = new JPanel();
        resetButton = new JButton(ico1);
        mb = new JMenuBar();
        m1 = new JMenu("Optiuni de joc");
        mi1 = new JMenuItem("10 x 10");
        mi2 = new JMenuItem("15 x 15");
        mi3 = new JMenuItem("17 x 17");
        
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        mb.add(m1);
        setJMenuBar(mb);
        
        mi1.addActionListener(ev -> initGame(10, 10));
        mi2.addActionListener(ev -> initGame(15, 15));
        mi3.addActionListener(ev -> initGame(17, 17));
        
        // set up the optionsPanel
        resetButton.addActionListener(ev -> initGame(dimN, dimM));
        optionsPanel.setLayout(new FlowLayout());
        optionsPanel.add(resetButton);
        add(optionsPanel, BorderLayout.NORTH);
        
        // set up the playPanel
        initGame(10, 10);
        add(playPanel);
        
    }
    
    private void initGame(int n, int m) {
        // n - nr de linii
        // m - nr de coloane
        dimN = n;
        dimM = m;
        
        playPanel.setLayout(new GridLayout(n, m));
        playPanel.removeAll();
        matrix = new JButton[n][m];
        bombs = new boolean[n][m];
        resetButton.setIcon(ico1);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = new JButton();
                final int I = i;
                final int J = j;
                matrix[i][j].addActionListener(ev -> buttonPressed(I, J));
                playPanel.add(matrix[i][j]);
            }
        }
        
        generateBombs(n, m);
        showBombs(); // TODO: delete when done
        playPanel.revalidate();
    }
    
    private void buttonPressed(int x, int y) {
        if (bombs[x][y]) {
            gameOver();
            return;
        }
        
        int nearBombs = getNearBombs(x, y);
        
        if (nearBombs != 0) {
            matrix[x][y].setEnabled(false);
            matrix[x][y].setText(String.valueOf(nearBombs));
            casuteRamase--;
            checkVictory();
            return;
        }
        
        discover(x, y);
    }
    
    private void discover(int x, int y) {
        if (x < 0 || x >= dimN) {
            return;
        }
            
        if (y < 0 || y >= dimM) {
            return;
        }
        
        if (!matrix[x][y].isEnabled()) {
            return;
        }
        
        matrix[x][y].setEnabled(false);
        casuteRamase--;
        checkVictory();
        
        int bombsCount = getNearBombs(x, y);
        if (bombsCount != 0) {
            matrix[x][y].setText(String.valueOf(bombsCount));
            return;
        }
        
        for (int index = 0; index < I_MOVE.length; index++) {
            int newX = x + I_MOVE[index];
            int newY = y + J_MOVE[index];
            
            discover(newX, newY);
        }
    }
    
    private void checkVictory() {
        if (casuteRamase == 0) {
            showBombs();
            JOptionPane.showMessageDialog(null, "Ai castigat");
            initGame(dimN, dimM);            
        }
    }
    
    private final static int[] I_MOVE = {-1, -1, 0, 1, 1, 1, 0, -1};
    private final static int[] J_MOVE = {0, 1, 1, 1, 0, -1, -1, -1};
    
    private int getNearBombs(int x, int y) {
        int bombsCount = 0;
        
        for (int index = 0; index < I_MOVE.length; index++) {
            int newX = x + I_MOVE[index];
            int newY = y + J_MOVE[index];
            
            if (newX < 0 || newX >= dimN) {
                continue;
            }
            
            if (newY < 0 || newY >= dimM) {
                continue;
            }
            
            if (bombs[newX][newY]) {
                bombsCount++;
            }
        }
        
        return bombsCount;
    }
    
    private void generateBombs(int n, int m) {
        int bombsCount = n * m / 7;
        casuteRamase = n * m - bombsCount;
        int generatedBombs = 0;
        Random r = new Random();
        
        while (generatedBombs < bombsCount) {
            int x = r.nextInt(n);
            int y = r.nextInt(m);
            
            if (!bombs[x][y]) {
                bombs[x][y] = true;
                generatedBombs++;
            }
        }
    }
    
    private void showBombs() {
        for (int i = 0; i < dimN; i++) {
            for (int j = 0; j < dimM; j++) {
                if (bombs[i][j]) {
                    matrix[i][j].setBackground(Color.RED);
                }
            }
        }
    }
    
    private void gameOver() {
        showBombs();
        resetButton.setIcon(ico2);
        JOptionPane.showMessageDialog(null, "Booooom");
        initGame(dimN, dimM);
    }
    
    
    
    
    
    
    
}







