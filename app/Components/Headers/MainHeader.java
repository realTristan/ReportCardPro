package Components.Headers;

import java.awt.Font;

import Components.Canvas;

public class MainHeader extends Text {
  public MainHeader(Canvas canvas) {
    // Create the label
    super("Report Card Pro", 75, 20, 300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    super.setFont(font);

    // Add the label to the canvas
    canvas.add(this);
  }
}
