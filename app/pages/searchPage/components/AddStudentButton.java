package pages.searchPage.components;

import javax.swing.JOptionPane;

import components.Button;
import pages.Manager;

/**
 * A class for creating buttons.
 */
public class AddStudentButton extends Button {
  /**
   * Constructs a new NewStudentButton object and adds it to the search page
   * canvas.
   *
   * @param manager the page manager
   */
  public AddStudentButton(Manager manager) {
    super("Add Student", 250, 100);
    super.setSize(120, 30);
    super.addActionListener(e -> this.onClick(manager));
    manager.searchPage.add(this);
  }

  /**
   * Handles the button click event.
   * @return void
   */
  public void onClick(Manager manager) {
    Object res = this.nameDialog();
    if (this.clickedCancel(res)) {
      return;
    }

    // Get the students name
    String name = (String) res;

    // Try adding the student to the cache
    try {
      String id = manager.cache.addStudent(name);
      manager.openStudentPage(id, name);
    } catch (Exception err) {
      this.errorDialog();
    }
  }

  /**
   * Displays an error dialog.
   * @return void
   */
  public void errorDialog() {
    JOptionPane.showMessageDialog(this,
        "An error occurred while adding the student.",
        "Error", JOptionPane.ERROR_MESSAGE);
  }

  /**
   * Gets the name dialog.
   *
   * @return the name dialog result
   */
  public Object nameDialog() {
    // Pop up dialog to get the student's name (first and last)
    return JOptionPane.showInputDialog(this,
        "Enter the student's name (last; first):",
        "Add Student",
        JOptionPane.PLAIN_MESSAGE);
  }

  /**
   * Checks if the cancel button was clicked.
   *
   * @param res the result of the dialog
   * @return true if the cancel button was clicked, false otherwise
   */
  public boolean clickedCancel(Object res) {
    return res == null;
  }
}
