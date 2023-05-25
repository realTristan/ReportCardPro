package Pages.StudentPage.Components.SaveButton;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Pages.Manager;
import Pages.StudentPage.Components.SubjectInput;
import Pages.StudentPage.Components.GradeInput;

/**
 * A class for the save button listener.
 */
public class Listener {
  /**
   * Constructs a new Listener object.
   *
   * @param manager       the manager to use for the student page
   * @param id            the id of the student
   * @param subjectInputs the subject inputs
   * @param gradeInputs   the grade inputs
   */
  public static void onClick(Manager manager, String id, SubjectInput[] subjectInputs, GradeInput[] gradeInputs) {
    // Get the courses
    List<Map<String, Object>> courses = Listener.mergeToMapList(subjectInputs, gradeInputs);

    // Update the student
    manager.cache.updateStudentCourses(id, courses);
  }

  /**
   * Checks if the event is valid.
   *
   * @param e the event
   * @return true, if the event is valid
   */
  public static boolean isValidEvent(ActionEvent e) {
    return e.getActionCommand().equals("Save Changes");
  }

  /**
   * Converts the inputs to an array of objects.
   *
   * @param subjectInputs the subject inputs
   * @param gradeInputs   the grade inputs
   * @return the array of objects
   */
  private static List<Map<String, Object>> mergeToMapList(SubjectInput[] subjectInputs, GradeInput[] gradeInputs) {
    // Add them to an array
    List<Map<String, Object>> courses = new ArrayList<>();

    // Add the inputs to the array
    for (int i = 0; i < 4; i++) {
      // Get the subject
      String subject = subjectInputs[i].getText();

      // Get the grade
      String grade = gradeInputs[i].getText();

      // Create the subject object
      Map<String, Object> obj = new HashMap<String, Object>();
      obj.put("subject", subject);
      obj.put("grade", toDouble(grade));

      // Add the subject object to the array
      courses.add(obj);
    }
    return courses;
  }

  /**
   * Converts a string to a double.
   *
   * @param v the string
   * @return the double
   */
  private static double toDouble(String v) {
      try {
        return Double.parseDouble(v);
      } catch (NumberFormatException e) {
        return 0;
      }
  }
}
