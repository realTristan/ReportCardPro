package Pages.SearchPage.Components;

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
        // Create the button
        super("New Student", 0, 250);

        // Set the button size
        super.setSize(120, 30);

        // Add the action listener
        super.addActionListener(e -> {
            // Pop up dialog to get the student's name (first and last)
            Object res = this.getNameDialog();

            // Print the result
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
        return JOptionPane.showInputDialog(
                this,
                "Enter the student's name:",
                "last; first",
                JOptionPane.PLAIN_MESSAGE);
    }
}
