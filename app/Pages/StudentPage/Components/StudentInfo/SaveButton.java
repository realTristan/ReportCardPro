package Pages.StudentPage.Components.StudentInfo;

import Components.Button;
import Pages.Manager;
import Pages.StudentPage.Components.SubjectInput;
import Pages.StudentPage.Components.GradeInput;
import Pages.StudentPage.Components.StudentNameHeader;
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
  public SaveButton(Manager manager, Panel panel, String id, SubjectInput[] subjectInputs, GradeInput[] gradeInputs,
      StudentNameHeader studentNameHeader) {
    super("Save Changes", 0, 0);

    // Add the button to the canvas
    panel.add(this);

    // Button click listener
    this.addActionListener(e -> {
      if (Listener.isValidEvent(e)) {
        Listener.onClick(manager, id, subjectInputs, gradeInputs);
        studentNameHeader.update(manager, id);
      }
    });
  }
}
