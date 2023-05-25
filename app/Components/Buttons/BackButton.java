package Components.Buttons;

import Components.Canvas;

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
    public BackButton(Canvas canvas) {
        // Create the button
        super("Back", canvas.center - 60, 250);

        // Set the button size
        super.setSize(120, 30);

        // Add the action listener
        super.addActionListener(e -> {
            // Remove all components from the canvas
            canvas.removeAll();

            // Move to the search page
            new Pages.SearchPage(canvas);
        });

        // Add the button to the canvas
        canvas.add(this);
    }
}
