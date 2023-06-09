package pages.studentPage.components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import components.Button;
import pages.Manager;
import pages.studentPage.StudentPage.Panel;

/**
 * Delete student button.
 */
public class DeleteStudentButton extends Button {
  /**
   * Constructs a new DeleteStudentButton object and adds it to the student page
   * canvas.
   *
   * @param manager the page manager
   * @param panel the panel to use for adding the button to the student page
   * @param frame the frame to dispose
   * @param id the student id
   */
  public DeleteStudentButton(Manager manager, Panel panel, JFrame frame, String id) {
    super("Delete Student", 0, 0);
    super.addActionListener(e -> this.onClick(manager, frame, id));
    panel.add(this);
  }

  /**
   * Handles the button click event.
   * @param manager the page manager
   * @param frame the frame to dispose
   * @param id the student id
   * @return void
   */
  public void onClick(Manager manager, JFrame frame, String id) {
    // Get the id from the user
    Object res = this.idDialog(id);
    if (this.clickedCancel(res)) {
      return;
    }

    // If the id's match, delete the student
    if (!id.equals((String) res)) {
      this.errorDialog();
      return;
    }

    // Delete the student and dispose the frame
    manager.cache.deleteStudent(id);

    // Clear the search page search input
    manager.searchPage.searchInput.clear();

    // Dispose the student page frame
    frame.dispose();
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

  /**
   * Displays an error dialog.
   * @return void
   */
  public void errorDialog() {
    JOptionPane.showMessageDialog(this,
        "The ID you entered does not match the student's ID.",
        "Error",
        JOptionPane.ERROR_MESSAGE);
  }

  /**
   * The student id dialog.
   *
   * @param id the student id
   * @return the id dialog result
   */
  public Object idDialog(String id) {
    return JOptionPane.showInputDialog(this,
        "Type the student's ID to delete:\n" + id,
        "Are you sure?",
        JOptionPane.PLAIN_MESSAGE);
  }
}
