package Pages.SearchPage.Components.Search;

import java.util.List;

import org.json.simple.JSONObject;

import Pages.Manager;

/**
 * A class for managing the students in the results list.
 */
public class StudentButtonList {
  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param manager the manager to use for getting the students and adding the
   *                buttons to the results list
   * @param value   the search value to use for filtering the students
   */
  public static void updateList(Manager manager, StudentScrollPane list, String value) {
    // Remove all the buttons
    list.removeAll();

    // Get the students
    List<JSONObject> students = manager.cache.searchStudents(value);

    // Iterate over the students
    int ysep = 0;
    for (JSONObject student : students) {
      // Get the students name
      String first = StudentButtonList.getFirstName(student);
      String last = StudentButtonList.getLastName(student);
      String fullName = StudentButtonList.toFullName(first, last);

      // Get the students id
      String id = StudentButtonList.getId(student);

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
