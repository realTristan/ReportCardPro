package Pages.StudentPage.Components;

import Components.Button;
import Pages.StudentPage.StudentPage;

/**
 * A class for creating buttons.
 */
public class SubjectButton extends Button {
  /**
   * Constructs a new SubjectButton object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the button to
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   */
  public SubjectButton (StudentPage p, int x, int y) {
    super("Add Subject", x, y);

    // Set the button size
    super.setSize(150, 30);

    // Add the button to the canvas
    p.add(this);
  }
}
