package Components;

import javax.swing.JButton;

public class Button {
    public static void importGrades(Canvas canvas) {
        JButton importGrades = new JButton("Import Grades");
        importGrades.setBounds(10, 10, 200, 30);
        canvas.add(importGrades);
    }

    public static void newSubject(Canvas canvas) {
        JButton newSubject = new JButton("New Subject");
        newSubject.setBounds(10, 50, 200, 30);
        canvas.add(newSubject);
    }
}
