package Pages.SearchPage.Components;

import java.util.List;

import javax.swing.JScrollPane;

import org.json.simple.JSONObject;

import Pages.Manager;

/**
 * A class representing a list of results.
 */
public class ResultsList extends JScrollPane {
  /**
   * Constructs a new ResultsList object and adds it to the search page canvas at
   * the specified location.
   *
   * @param manager the manager to use for adding the results list to the search
   *                page canvas
   */
  public ResultsList(Manager manager) {
    super();

    // Set the location of the results list
    super.setLocation(150, 150);

    // Add the results list to the canvas
    manager.searchPage.add(this);
  }

  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param manager the manager to use for getting the students and adding the
   *                buttons to the results list
   * @param value   the search value to use for filtering the students
   */
  public void setStudents(Manager manager, String value) {
    // Remove all the buttons
    super.removeAll();

    // Get the students
    List<JSONObject> students = manager.cache.getStudents(value);

    // Iterate over the students
    int ysep = 0;
    for (JSONObject student : students) {
      // Get the students name
      String last_name = (String) student.get("last_name");
      String first_name = (String) student.get("first_name");
      String full_name = last_name + ", " + first_name;

      // Get the students id
      String id = (String) student.get("id");

      // Create the button
      StudentButton button = new StudentButton(manager, full_name, id, ysep);
      super.add(button);

      // Increment the separator
      ysep += 30;
    }

    // Update the results list
    super.repaint();
  }
}