package Pages.StudentPage.Components;

import Components.Input.Input;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for creating subject inputs.
 */
public class SubjectInput extends Input {
  /**
 * Constructs a new SubjectInput object and sets its bounds to the specified location and size.
 *
 * @param panel the panel to use for adding the input to the canvas
 * @param x the x-coordinate of the input
 * @param y the y-coordinate of the input
 */
  public SubjectInput(Panel panel, String subject) {
    super(0, 0, 15);

    // Set the placeholder text for the input
    super.setPlaceholder("Subject");

    // Set the text of the input
    super.setText(subject);

    // Add the input to the canvas
    panel.add(this);
  }
}
