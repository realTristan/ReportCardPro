package Pages.SearchPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.Manager;

/**
 * A class for creating the main header
 */
public class MainHeader extends Text {
  /**
   * Constructs a new MainHeader object and adds it to the search page canvas at
   * the specified location and size.
   *
   * @param manager the manager to use for adding the header to the search page
   *                canvas
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
