package Pages.StudentPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for creating the main header
 */
public class MainHeader extends Text {
  /**
   * Constructs a new MainHeader object and adds it to the student page canvas at
   * the specified location and size.
   *
   * @param panel the panel to use for adding the header to the canvas
   */
  public MainHeader(Panel panel) {
    // Create the label
    super("Report Card Pro", 100, 20);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    super.setFont(font);

    // Add the label to the canvas
    panel.add(this);
  }
}
