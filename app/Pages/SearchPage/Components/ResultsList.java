package Pages.SearchPage.Components;

import java.util.List;

import javax.swing.JScrollPane;

import org.json.simple.JSONObject;

import Components.Button;
import Pages.SearchPage.SearchPage;

/**
 * A class representing a list of results.
 */
public class ResultsList extends JScrollPane {
  /**
   * Constructs a new ResultsList object and adds it to the given canvas at the
   * specified location and size.
   *
   * @param searchPage the canvas to add the results list to
   * @param x      the x-coordinate of the results list
   * @param y      the y-coordinate of the results list
   */
  public ResultsList(SearchPage searchPage) {
    super();

    // Set the location of the results list
    super.setLocation(searchPage.center - 150, 150);

    // Set the students
    this.setStudents(searchPage, "");

    // Add the results list to the canvas
    searchPage.add(this);
  }

  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param searchPage the canvas to use for the results list
   * @param value  the search value to use for filtering the students
   */
  public void setStudents(SearchPage searchPage, String value) {
    super.removeAll();

    // Get the students
    List<JSONObject> students = searchPage.cache.getStudents(value);

    // Iterate over the students
    int sep = 0;
    for (JSONObject student : students) {
      // Get the students name
      String last_name = (String) student.get("last_name");
      String first_name = (String) student.get("first_name");
      String full_name = last_name + ", " + first_name;

      // Create the button
      Button button = new Button(full_name, 0, sep);
      button.setSize(300, 30);
      super.add(button);

      // Increment the separator
      sep += 30;
    }

    // Update the results list
    super.repaint();
  }
}