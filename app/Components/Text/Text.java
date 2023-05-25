package Components.Text;

import javax.swing.JLabel;

/**
 * A class for creating text.
 */
public class Text extends JLabel {
  /**
   * Constructs a new Text object and sets its bounds to the specified location
   * and size.
   *
   * @param text the text to display
   * @param x the x-coordinate of the text
   * @param y the y-coordinate of the text
   */
  public Text(String text, int x, int y) {
    super(text);

    // Set the location of the text
    super.setLocation(x, y);
  }
}