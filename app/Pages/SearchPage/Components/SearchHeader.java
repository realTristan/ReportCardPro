package Pages.SearchPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.Manager;

/**
 * A class for creating text headers.
 */
public class SearchHeader extends Text {
  /**
   * Constructs a new SearchHeader object and sets its bounds to the specified
   * location and size.
   *
   * @param p the canvas to add the header to
   */
  public SearchHeader(Manager manager) {
    // Create the label
    super("Search for Student", 60, 70);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 15);
    super.setFont(font);
    
    // Add the label to the canvas
    manager.searchPage.add(this);
  }
}
