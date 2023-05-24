package Components.Headers;

import java.awt.Font;

import Components.Canvas;

public class MainHeader {
  public MainHeader(Canvas canvas) {
    // Create the label
    Text label = new Text("Report Card Pro", 75, 20, 300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.BOLD, 30);
    label.setFont(font);

    // Add the label to the canvas
    canvas.add(label);
  }
}
