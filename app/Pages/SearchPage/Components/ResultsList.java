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
   * Constructs a new ResultsList object and adds it to the given canvas at the
   * specified location and size.
   *
   * @param p the canvas to add the results list to
   */
  public ResultsList(Manager manager) {
    super();

    // Set the location of the results list
    super.setLocation(150, 150);

    // Set the students
    this.setStudents(manager, "");

    // Add the results list to the canvas
    manager.searchPage.add(this);
  }

  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param p the canvas to use for the results list
   * @param value  the search value to use for filtering the students
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

      // Create the button
      StudentButton button = new StudentButton(manager, full_name, ysep);
      super.add(button);

      // Increment the separator
      ysep += 30;
    }

    // Update the results list
    super.repaint();
  }
}