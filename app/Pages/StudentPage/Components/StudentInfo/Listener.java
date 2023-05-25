package Pages.StudentPage.Components.StudentInfo;

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
    manager.cache.updateStudentCourses(id,
        Listener.mergeToMapList(subjectInputs, gradeInputs));
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
    List<Map<String, Object>> res = new ArrayList<>();

    // Add the inputs to the array
    for (int i = 0; i < 4; i++) {
      // Get the subject and grade
      String subject = subjectInputs[i].getText();
      String grade = gradeInputs[i].getText();

      // Add them to the array
      Map<String, Object> obj = new HashMap<String, Object>();
      obj.put("subject", subject);
      obj.put("grade", toDouble(grade));
      res.add(obj);
    }
    return res;
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
