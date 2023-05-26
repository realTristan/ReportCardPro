package Pages.StudentPage.Components;

import Components.Text.Text;
import Pages.StudentPage.StudentPage.Panel;

import java.awt.Font;

/**
 * A class for the student name header.
 */
public class StudentNameHeader extends Text {
    /**
     * Constructs a new StudentNameHeader object.
     *
     * @param panel the panel to add the component to
     * @param name  the name of the student
     */
    public StudentNameHeader(Panel panel, String name, double average) {
        super(name + ": " + average + "%", 0, 50);

        // Set the font
        Font font = new Font("Arial", Font.BOLD, 15);
        super.setFont(font);

        // Add the component to the panel
        panel.add(this);
    }
}
