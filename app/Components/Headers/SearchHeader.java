package Components.Headers;

import java.awt.Font;

import Components.Canvas;

/**
 * A class for creating text headers.
 */
public class SearchHeader extends Text {
  /**
   * Constructs a new SearchHeader object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the header to
   */
  public SearchHeader(Canvas canvas) {
    // Create the label
    super("Search for Student", 125, 70, 300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 15);
    super.setFont(font);
    
    // Add the label to the canvas
    canvas.add(this);
  }
}
