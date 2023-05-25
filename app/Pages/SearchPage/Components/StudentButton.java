package Pages.SearchPage.Components;

import Components.Button;
import Pages.Manager;

/**
 * A class for creating buttons.
 */
public class StudentButton extends Button {
    /**
     * Constructs a new StudentButton object and sets its bounds to the specified
     * location and size.
     *
     * @param s the text to display on the button
     * @param ysep the y-coordinate of the button
     */
    public StudentButton(Manager manager, String s, int ysep) {
        super(s, 0, ysep);
        super.setSize(300, 30);
        
        // On button click, open the student page
        super.addActionListener(e -> {
            manager.toStudentPage();
        });
    }
}
