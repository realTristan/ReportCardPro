package Pages.SearchPage.Components.ResultList;

import java.util.List;

import org.json.simple.JSONObject;

import Pages.Manager;
import Pages.SearchPage.Components.StudentButton;

/**
 * A class for managing the students in the results list.
 */
public class Students {
  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param manager the manager to use for getting the students and adding the
   *                buttons to the results list
   * @param value   the search value to use for filtering the students
   */
  public static void updateStudentList(ResultsList list, Manager manager, String value) {
    // Remove all the buttons
    list.removeAll();

    // Get the students
    List<JSONObject> students = manager.cache.getStudents(value);

    // Iterate over the students
    int ysep = 0;
    for (JSONObject student : students) {
      // Get the students name
      String first = Students.getFirstName(student);
      String last = Students.getLastName(student);
      String fullName = Students.toFullName(first, last);

      // Get the students id
      String id = Students.getId(student);

      // Create the button
      StudentButton button = new StudentButton(manager, fullName, id, ysep);
      list.add(button);

      // Increment the separator
      ysep += 30;
    }

    // Update the results list
    list.repaint();
  }

  /**
   * Returns the full name of the student.
   *
   * @param first the first name of the student
   * @param last  the last name of the student
   * @return the full name of the student
   */
  public static String toFullName(String first, String last) {
    return last + ", " + first;
  }

  /**
   * Returns the last name of the student.
   *
   * @param student the student to get the last name of
   * @return the last name of the student
   */
  public static String getLastName(JSONObject student) {
    return (String) student.get("last_name");
  }

  /**
   * Returns the first name of the student.
   *
   * @param student the student to get the first name of
   * @return the first name of the student
   */
  public static String getFirstName(JSONObject student) {
    return (String) student.get("first_name");
  }

  /**
   * Returns the id of the student.
   *
   * @param student the student to get the id of
   * @return the id of the student
   */
  public static String getId(JSONObject student) {
    return (String) student.get("id");
  }
}
