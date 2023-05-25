package Components.Text;

import java.awt.Font;

import Components.Canvas;

/**
 * A class for creating text headers.
 */
public class Footer extends Text {
  /**
   * Constructs a new Footer object and sets its bounds to the specified location
   * and size.
   *
   * @param canvas the canvas to add the header to
   */
  public Footer(Canvas canvas) {
    // Create the label
    super("v1.0.0 made by Tristan, Jagger, Jett", 198, 330);
    super.setSize(300, 30);
    
    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 11);
    super.setFont(font);

    // Add the label to the canvas
    canvas.add(this);
  }
}
