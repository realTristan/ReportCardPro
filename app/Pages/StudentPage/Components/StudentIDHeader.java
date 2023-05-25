package Pages.StudentPage.Components;

import Components.Text;
import Pages.Manager;

/**
 * A class for creating student id headers.
 */
public class StudentIDHeader extends Text {
    /**
     * Constructs a new StudentIDHeader object and sets its bounds to the specified
     * location and size.
     *
     * @param id the id of the student
     */
    public StudentIDHeader(Manager manager, String id) {
        super(id, 10, 20);

        // Set the header size
        super.setSize(300, 30);

        // Add the header to the canvas
        manager.studentPage.add(this);
    }
}
