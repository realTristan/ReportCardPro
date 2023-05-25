package Pages.StudentPage.Components;

import Components.Button;
import Pages.Manager;

/**
 * A class for creating back buttons.
 */
public class BackButton extends Button {
    /**
     * Constructs a new BackButton object and sets its bounds to the specified
     * location and size.
     *
     * @param manager the manager to use for adding the button to the canvas
     */
    public BackButton(Manager manager) {
        // Create the button
        super("Back", 20, 250);

        // Set the button size
        super.setSize(120, 30);

        // Add the action listener
        super.addActionListener(e -> {
            manager.toSearchPage();
        });

        // Add the button to the canvas
        manager.studentPage.add(this);
    }
}
