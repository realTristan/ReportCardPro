package Components.Inputs;

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
   * @param w the width of the input
   * @param h the height of the input
   */
  public Input(int x, int y, int w, int h) {
    super();
    super.setBounds(x, y, w, h);
  }
}
