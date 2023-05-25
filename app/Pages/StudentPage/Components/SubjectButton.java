package Pages.StudentPage.Components;

import Components.Button;
import Pages.Manager;

/**
 * A class for creating buttons.
 */
public class SubjectButton extends Button {
  /**
   * Constructs a new SubjectButton object and sets its bounds to the specified
   * location and size.
   *
   * @param manager the manager to use for adding the button to the canvas
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   */
  public SubjectButton (Manager manager, int x, int y) {
    super("Add Subject", x, y);

    // Set the button size
    super.setSize(150, 30);

    // Add the button to the canvas
    manager.studentPage.add(this);
  }
}
