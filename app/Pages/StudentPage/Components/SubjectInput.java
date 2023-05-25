package Pages.StudentPage.Components;

import Components.Input;
import Pages.Manager;

/**
 * A class for creating subject inputs.
 */
public class SubjectInput extends Input {
  /**
 * Constructs a new SubjectInput object and sets its bounds to the specified location and size.
 *
 * @param manager the manager to use for adding the input to the canvas
 * @param x the x-coordinate of the input
 * @param y the y-coordinate of the input
 */
  public SubjectInput(Manager manager, int x, int y) {
    super(x, y);

    // Set the bounds of the input
    super.setBounds(x, y, 150, 30);

    // Set the placeholder text for the input
    super.setPlaceholder("Subject");

    // Add the input to the canvas
    manager.studentPage.add(this);
  }
}
