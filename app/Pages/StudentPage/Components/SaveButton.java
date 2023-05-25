package Pages.StudentPage.Components;

import Components.Button;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for creating buttons.
 */
public class SaveButton extends Button {
  /**
   * Constructs a new SaveButton object and sets its bounds to the specified
   * location and size.
   *
   * @param panel the manager to use for adding the button to the canvas
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   */
  public SaveButton (Panel panel) {
    super("Save Changes", 0, 0);

    // Add the button to the canvas
    panel.add(this);
  }
}
