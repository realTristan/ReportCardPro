package Components;

import javax.swing.*;

class Text {
    public static JLabel Header(Canvas canvas) {
        JLabel label = new JLabel();
        label.setText("Report Card Pro");
        label.setBounds(150, 0, 100, 30);
        canvas.add(label);
        return label;
    }
}