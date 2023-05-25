package Pages.StudentPage.Components;

import Components.Input;
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
  public SubjectInput(Panel panel, int x, int y) {
    super(x, y, 15);
    
    // Set the bounds of the input
    super.setSize(150, 30);

    // Set the placeholder text for the input
    super.setPlaceholder("Subject");

    // Add the input to the canvas
    panel.add(this);
  }
}
