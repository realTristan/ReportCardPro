package pages.searchPage.components.search;

import components.Button;
import pages.Manager;

/**
 * A class for creating buttons.
 */
public class StudentButton extends Button {
  /**
   * Constructs a new StudentButton object and adds it to the search page canvas
   * at the specified location and size.
   *
   * @param manager the page manager
   * @param name    the name of the student to open the page for
   * @param id      the id of the student to open the page for
   * @param ysep    the y-coordinate of the button
   */
  public StudentButton(Manager manager, String name, String id, int ysep) {
    super(name, 0, ysep);
    super.setSize(300, 30);
    super.addActionListener(e -> manager.openStudentPage(id, name));
  }
}
