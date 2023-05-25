package Pages.StudentPage.Components;

import Components.Input;

public class GradeInput extends Input {
    /**
     * Constructs a new GradeInput object and adds it to the student page canvas at
     * the specified location and size.
     *
     * @param panel the panel to use for adding the input to the canvas
     */
    public GradeInput(Pages.StudentPage.StudentPage.Panel panel) {
        // Create the input
        super(0, 0, 5);
        super.setPlaceholder("Grade");
    
        // Set the input size
        super.setSize(150, 30);
    
        // Add the input to the canvas
        panel.add(this);
    }
}
