package Pages.SearchPage.Components;

import javax.swing.JOptionPane;

import Components.Button;
import Pages.SearchPage.SearchPage;

/**
 * A class for creating buttons.
 */
public class NewStudentButton extends Button {
    /**
     * Constructs a new NewStudent object and sets its bounds to the specified
     * location and size.
     *
     * @param canvas the canvas to add the button to
     */
    public NewStudentButton(SearchPage searchPage) {
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
        searchPage.add(this);
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
