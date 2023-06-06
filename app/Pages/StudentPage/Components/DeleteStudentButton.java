package Pages.StudentPage.Components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Components.Button;
import Pages.Manager;
import Pages.StudentPage.StudentPage.Panel;

/**
 * Delete student button.
 */
public class DeleteStudentButton extends Button {
  /**
   * Constructs a new DeleteStudentButton object and adds it to the student page
   * canvas.
   *
   * @param manager the manager to use for adding the button to the student page
   *                canvas
   */
  public DeleteStudentButton(Manager manager, Panel panel, JFrame frame, String id) {
    super("Delete Student", 0, 0);
    super.addActionListener(e -> this.onClick(manager, frame, id));
    panel.add(this);
  }

  /**
   * Handles the button click event.
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

    // Remove the student and dispose the frame
    manager.cache.removeStudent(id);

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
   * @return the id dialog result
   */
  public Object idDialog(String id) {
    return JOptionPane.showInputDialog(this,
        "Type the student's ID to delete:\n" + id,
        "Are you sure?",
        JOptionPane.PLAIN_MESSAGE);
  }
}
