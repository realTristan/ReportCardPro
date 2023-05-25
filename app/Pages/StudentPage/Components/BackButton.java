package Pages.StudentPage.Components;

import Components.Button;
import Pages.StudentPage.StudentPage;

/**
 * A class for creating back buttons.
 */
public class BackButton extends Button {
    /**
     * Constructs a new Back object and sets its bounds to the specified location
     * and size.
     *
     * @param canvas the canvas to add the button to
     */
    public BackButton(StudentPage p) {
        // Create the button
        super("Back", 20, 250);

        // Set the button size
        super.setSize(120, 30);

        // Add the action listener
        super.addActionListener(e -> {
        });

        // Add the button to the canvas
        p.add(this);
    }
}
