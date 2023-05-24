package Pages;

import Components.*;
import Components.Buttons.SubjectButton;
import Components.Inputs.SubjectInput;

public class StudentPage {
  public StudentPage(Canvas canvas) {
    // Make the import grades and new subject buttons
    new SubjectButton(canvas, 10, 10, 150, 30);

    // Make the new subject input
    new SubjectInput(canvas, 10, 60);
    new SubjectInput(canvas, 10, 90);
    new SubjectInput(canvas, 10, 120);
    new SubjectInput(canvas, 10, 150);
  }
}
