package Components.Headers;

import java.awt.Font;

import Components.Canvas;

public class SearchHeader extends Text {
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
