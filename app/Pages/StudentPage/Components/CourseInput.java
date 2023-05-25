package Pages.StudentPage.Components;

import Components.Input.Input;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for creating subject inputs.
 */
public class CourseInput extends Input {
  /**
 * Constructs a new CourseInput object and sets its bounds to the specified location and size.
 *
 * @param panel the panel to use for adding the input to the canvas
 * @param x the x-coordinate of the input
 * @param y the y-coordinate of the input
 */
  public CourseInput(Panel panel, int x, int y, String subject) {
    super(x, y, 15);
    
    // Set the bounds of the input
    super.setSize(150, 30);

    // Set the placeholder text for the input
    super.setPlaceholder("Course");

    // Set the text of the input
    super.setText(subject);

    // Add the input to the canvas
    panel.add(this);
  }
}
