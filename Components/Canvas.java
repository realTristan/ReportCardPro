package Components;
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

        // Make the import grades and new subject buttons
        // Button.importGrades(this);
        Button.addSubject(this, 10, 180);

        // Make the new subject input
        Input.newSubject(this, 10, 60);
        Input.newSubject(this, 10, 90);
        Input.newSubject(this, 10, 120);
        Input.newSubject(this, 10, 150);
        Text.Header(this);
    }
}