import java.awt.*;
import javax.swing.*;

public class Canvas extends JPanel {
    // Constructor
    public Canvas() {
        setBackground(Color.WHITE);
    }

    // Paint components
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // make a button
        JButton button = new JButton("Click me!");
        button.setBounds(100, 100, 100, 100);
        add(button);
    }
}