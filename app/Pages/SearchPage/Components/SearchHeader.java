package Pages.SearchPage.Components;

import java.awt.Font;

import Components.Text;
import Pages.SearchPage.SearchPage;

/**
 * A class for creating text headers.
 */
public class SearchHeader extends Text {
  /**
   * Constructs a new SearchHeader object and sets its bounds to the specified
   * location and size.
   *
   * @param searchPage the canvas to add the header to
   */
  public SearchHeader(SearchPage searchPage) {
    // Create the label
    super("Search for Student", searchPage.center - 60, 70);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 15);
    super.setFont(font);
    
    // Add the label to the canvas
    searchPage.add(this);
  }
}
