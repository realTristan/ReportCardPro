package Pages.StudentPage.Components;

import Components.Input;
import Pages.StudentPage.StudentPage.Panel;

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
    // Create the input
    super(0, 0, 5);

    // Set the input size
    super.setSize(150, 30);

    // Set the placeholder text for the input
    super.setPlaceholder("Grade");

    // Set the text of the input
    super.setText(grade);

    // Add the input to the canvas
    panel.add(this);
  }
}
