package Pages.StudentPage.Components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Components.Button;
import Pages.Manager;
import Pages.StudentPage.StudentPage.Panel;

public class DeleteStudentButton extends Button {
  public DeleteStudentButton(Manager manager, Panel panel, JFrame frame, String id) {
    super("Delete Student", 0, 0);
    super.addActionListener(e -> {
      Object res = this.getIdDialog(id);
      if (res == null) {
        return;
      }

      // If the id's match, delete the student
      if (this.doIdsMatch(id, (String) res)) {
        manager.cache.removeStudent(id);
        frame.dispose();
      } else {
        this.errorDialog();
      }
    });
    panel.add(this);
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
  public Object getIdDialog(String id) {
    return JOptionPane.showInputDialog(this,
        "Type the student's ID to delete:\n" + id,
        "Are you sure?",
        JOptionPane.PLAIN_MESSAGE);
  }

  /**
   * Checks if the ids match.
   *
   * @param id1 the first id
   * @param id2 the second id
   * @return true if the ids match, false otherwise
   */
  public boolean doIdsMatch(String id1, String id2) {
    return id1.equals(id2);
  }
}
