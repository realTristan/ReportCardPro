package Pages.SearchPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.Manager;

/**
 * A class for creating text headers.
 */
public class SearchHeader extends Text {
  /**
   * Constructs a new SearchHeader object and adds it to the search page canvas at
   * the specified location and size.
   *
   * @param manager the manager to use for adding the header to the search page
   *                canvas
   */
  public SearchHeader(Manager manager) {
    super("Search for Student", 150, 70);
    super.setSize(200, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 15);
    super.setFont(font);

    // Add the label to the canvas
    manager.searchPage.add(this);
  }
}
