package Pages.SearchPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.Manager;

/**
 * A class for creating text headers.
 */
public class MainHeader extends Text {
  /**
   * Constructs a new MainHeader object and sets its bounds to the specified
   * location and size.
   *
   * @param p the canvas to add the header to
   */
  public MainHeader(Manager manager) {
    // Create the label
    super("Report Card Pro", 100, 20);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    super.setFont(font);

    // Add the label to the canvas
    manager.searchPage.add(this);
  }
}
