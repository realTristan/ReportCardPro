package Pages.SearchPage.Components.Search;

import Components.Button;
import Pages.Manager;

/**
 * A class for creating buttons.
 */
public class StudentButton extends Button {
  /**
   * Constructs a new StudentButton object and adds it to the search page canvas
   * at the specified location and size.
   *
   * @param manager the manager to use for opening the student page when the
   *                button is clicked
   * @param s       the text to display on the button
   * @param id      the id of the student to open the page for
   * @param ysep    the y-coordinate of the button
   */
  public StudentButton(Manager manager, String s, String id, int ysep) {
    super(s, 0, ysep);
    super.setSize(300, 30);
    super.addActionListener(e -> manager.openStudentPage(id));
  }
}
