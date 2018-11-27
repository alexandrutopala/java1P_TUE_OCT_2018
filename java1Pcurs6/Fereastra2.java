import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra2 extends JFrame {
    private JPanel colorPanel;
    private JPanel buttonsPanel;
    private JLabel colorLabel;
    private JButton red;
    private JButton green;
    private JButton blue; 
    
    public Fereastra2() {
        super("Frame2");
        
        initComponents();
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        colorPanel = new JPanel();
        buttonsPanel = new JPanel();
        colorLabel = new JLabel();
        red = new JButton("red");
        green = new JButton("green");
        blue = new JButton("blue");
        
        //colorPanel.add(colorLabel);
        
        buttonsPanel.setLayout(new FlowLayout());
        
        buttonsPanel.add(red);
        buttonsPanel.add(green);
        buttonsPanel.add(blue);
        
        red.setForeground(Color.RED);
        green.setForeground(Color.GREEN);
        blue.setForeground(Color.BLUE);
        
        red.addActionListener(ev -> colorPanel.setBackground(Color.RED));
        green.addActionListener(ev -> colorPanel.setBackground(Color.GREEN));
        blue.addActionListener(ev -> colorPanel.setBackground(Color.BLUE));
        
        add(colorPanel);
        add(buttonsPanel, BorderLayout.SOUTH);
    }
    
    
    
    
    
    
    
    
}