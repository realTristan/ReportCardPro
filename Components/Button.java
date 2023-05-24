package Components;

import javax.swing.JButton;

public class Button {
    public static JButton make(String t, int x, int y, int w, int h) {
        JButton b = new JButton(t);
        b.setBounds(x, y, w, h);
        return b;
    }
    
    public static void importGrades(Canvas canvas, int x, int y) {
        JButton b = Button.make("Import Grades", x, y, 200, 30);
        canvas.add(b);
    }

    public static void addSubject(Canvas canvas, int x, int y) {
        JButton b = Button.make("New Subject", x, y, 150, 30);
        canvas.add(b);
    }
}
