package pages.searchPage.components;

import java.awt.Font;

import components.Text;
import pages.Manager;

/**
 * A class for creating text headers.
 */
public class Footer extends Text {
  /**
   * Constructs a new Footer object and adds it to the search page canvas at the
   * specified location and size.
   *
   * @param manager the manager to use for adding the footer to the search page
   *                canvas
   */
  public Footer(Manager manager) {
    super("v1.0.0 made by Tristan, Jagger, Jett", 198, 330);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 11);
    super.setFont(font);

    // Add the label to the canvas
    manager.searchPage.add(this);
  }
}
