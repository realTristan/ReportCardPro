package Components.Inputs;

import javax.swing.JTextField;

import Components.Listeners.PlaceholderListener;

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
  public Input(int x, int y) {
    super();
    super.setLocation(x, y);
  }

  /**
   * Sets the placeholder text for the input.
   *
   * @param placeholder the placeholder text to use
   */
  public void setPlaceholder(String placeholder) {
    // Create a reference to the input
    Input input = this;

    // Create a listener for the input
    PlaceholderListener listener = new PlaceholderListener(input, placeholder);

    // Add the listener to the input
    super.addFocusListener(listener);
  }
}
