package Pages.SearchPage.Components.NewStudent;

import javax.swing.JOptionPane;

import Components.Button;
import Pages.Manager;

/**
 * A class for creating buttons.
 */
public class NewStudentButton extends Button {
  /**
   * Constructs a new NewStudentButton object and adds it to the search page
   * canvas.
   *
   * @param manager the manager to use for adding the button to the search page
   *                canvas
   */
  public NewStudentButton(Manager manager) {
    super("New Student", 0, 250);
    super.setSize(120, 30);
    super.addActionListener(e -> {
      Object res = this.getNameDialog();
      System.out.println(res);
    });

    // Add the button to the canvas
    manager.searchPage.add(this);
  }

  /**
   * Gets the name dialog.
   *
   * @return the name dialog result
   */
  public Object getNameDialog() {
    // Pop up dialog to get the student's name (first and last)
    return JOptionPane.showInputDialog(this,
        "Enter the student's name:",
        "last; first",
        JOptionPane.PLAIN_MESSAGE);
  }
}
