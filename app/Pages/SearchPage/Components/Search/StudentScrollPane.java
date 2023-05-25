package Pages.SearchPage.Components.Search;

import javax.swing.JScrollPane;

import Pages.Manager;

/**
 * A class representing a list of results.
 */
public class StudentScrollPane extends JScrollPane {
  /**
   * Constructs a new ResultsList object and adds it to the search page canvas at
   * the specified location.
   *
   * @param manager the manager to use for adding the results list to the search
   *                page canvas
   */
  public StudentScrollPane(Manager manager) {
    super();

    // Set the location of the results list
    super.setLocation(65, 150);

    // Add the results list to the canvas
    manager.searchPage.add(this);
  }

  /**
   * Sets the students in the results list.
   *
   * @param manager the manager to use for getting the students
   * @param value   the value to use for filtering the students
   */
  public void updateStudentList(Manager manager, String value) {
    StudentButtonList.updateList(this, manager, value);
  }
}