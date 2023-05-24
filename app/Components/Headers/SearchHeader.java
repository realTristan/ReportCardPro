package Components.Headers;

import java.awt.Font;

import javax.swing.JLabel;

import Components.Canvas;

public class SearchHeader {
  public SearchHeader(Canvas canvas) {
    // Create the label
    JLabel label = new Text("Search for Student", 125, 70, 300, 30);

    // Set the label font
    Font font = new Font("Arial", Font.PLAIN, 15);
    label.setFont(font);
    
    // Add the label to the canvas
    canvas.add(label);
  }
}
