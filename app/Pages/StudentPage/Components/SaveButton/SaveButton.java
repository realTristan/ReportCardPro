package Pages.StudentPage.Components.SaveButton;

import Components.Button;
import Pages.Manager;
import Pages.StudentPage.Components.SubjectInput;
import Pages.StudentPage.Components.GradeInput;
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
   * @param x     the x-coordinate of the button
   * @param y     the y-coordinate of the button
   */
  public SaveButton(Manager manager, Panel panel, String id, SubjectInput[] subjectInputs, GradeInput[] gradeInputs) {
    super("Save Changes", 0, 0);

    // Add the button to the canvas
    panel.add(this);

    // Button click listener
    this.addActionListener(e -> {
      // Check if the event is valid
      if (!Listener.isValidEvent(e)) {
        return;
      }

      // Execute the button click listener
      Listener.onClick(manager, id, subjectInputs, gradeInputs);
    });
  }
}
