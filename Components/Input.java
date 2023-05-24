package Components;

import javax.swing.JTextField;

public class Input {
    public static JTextField newSubject(Canvas canvas, int x, int y) {
        // make a new jtextfield
        JTextField field = new JTextField();
        field.setBounds(x, y, 150, 30);
        canvas.add(field);
        return field;
    }
}
