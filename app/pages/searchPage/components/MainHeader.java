package pages.searchPage.components;

import java.awt.Font;

import components.Text;
import pages.Manager;

/**
 * A class for creating the main header
 */
public class MainHeader extends Text {
  /**
   * Constructs a new MainHeader object and adds it to the search page canvas at
   * the specified location and size.
   *
   * @param manager the page manager
   */
  public MainHeader(Manager manager) {
    super("Report Card Pro", 100, 20);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    super.setFont(font);

    // Add the label to the canvas
    manager.searchPage.add(this);
  }
}
