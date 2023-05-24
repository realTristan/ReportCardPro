package Pages;

import Components.Button;
import Components.Canvas;
import Components.Input;

public class StudentPage {
  public StudentPage(Canvas canvas) {
    // Make the import grades and new subject buttons
    Button.addSubject(canvas, 10, 180);

    // Make the new subject input
    Input.subjectField(canvas, 10, 60);
    Input.subjectField(canvas, 10, 90);
    Input.subjectField(canvas, 10, 120);
    Input.subjectField(canvas, 10, 150);
  }
}
