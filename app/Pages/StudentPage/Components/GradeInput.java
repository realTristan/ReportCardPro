package pages.studentPage.components;

import components.input.Input;
import pages.studentPage.StudentPage.Panel;

/**
 * A class for grade input
 */
public class GradeInput extends Input {
  /**
   * Constructs a new GradeInput object and adds it to the student page canvas at
   * the specified location and size.
   *
   * @param panel the panel to use for adding the input to the canvas
   */
  public GradeInput(Panel panel, String grade) {
    super(0, 0, 5);
    super.setPlaceholder("Grade");
    super.setText(grade);
    panel.add(this);
  }
}
