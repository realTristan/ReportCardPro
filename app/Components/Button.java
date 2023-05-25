package Components;

import javax.swing.JButton;

/**
 * A class for creating buttons.
 */
public class Button extends JButton {
  /**
   * Constructs a new Button object and sets its bounds to the specified location
   * and size.
   *
   * @param text the text to display on the button
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   */
  public Button(String text, int x, int y) {
    super(text);
    super.setLocation(x, y);
  }
}
