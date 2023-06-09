package pages.studentPage.components.coursesAndGrades;

import components.Button;
import pages.Manager;
import pages.studentPage.StudentPage.Panel;
import pages.studentPage.components.GradeInput;
import pages.studentPage.components.StudentNameHeader;
import pages.studentPage.components.SubjectInput;

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
    super("Save", 0, 0);

    // Add the button to the canvas
    panel.add(this);

    // Button click listener
    this.addActionListener(e -> {
      if (ButtonListener.isValidEvent(e)) {
        ButtonListener.onClick(manager, id, subjectInputs, gradeInputs);
        studentNameHeader.update(manager, id);
      }
    });
  }
}