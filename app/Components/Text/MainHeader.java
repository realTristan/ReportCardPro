package Components.Text;

import java.awt.Font;

import Components.Canvas;

/**
 * A class for creating text headers.
 */
public class MainHeader extends Text {
  /**
   * Constructs a new MainHeader object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the header to
   */
  public MainHeader(Canvas canvas) {
    // Create the label
    super("Report Card Pro", canvas.center - 115, 20);
    super.setSize(300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    super.setFont(font);

    // Add the label to the canvas
    canvas.add(this);
  }
}
