package Components.Input;

import javax.swing.JTextField;

/**
 * A class for creating input fields.
 */
public class Input extends JTextField {
  /**
   * Constructs a new Input object and sets its bounds to the specified location
   * and size.
   *
   * @param x the x-coordinate of the input
   * @param y the y-coordinate of the input
   */
  public Input(int x, int y, int columns) {
    super(columns);
    super.setLocation(x, y);
  }

  /**
   * Sets the placeholder text for the input.
   *
   * @param placeholder the placeholder text to use
   */
  public void setPlaceholder(String placeholder) {
    // Create a listener for the input
    PlaceholderListener listener = new PlaceholderListener(this, placeholder);

    // Add the listener to the input
    super.addFocusListener(listener);
    super.setText(placeholder);
  }
}
