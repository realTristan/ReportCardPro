package Components.Inputs;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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
    Input input = this;
    super.addFocusListener(new FocusListener() {
      @Override
      public void focusGained(FocusEvent e) {
        if (input.getText().equals("Search")) {
          input.setText("");
          input.setForeground(Color.BLACK);
        }
      }

      @Override
      public void focusLost(FocusEvent e) {
        if (input.getText().isEmpty()) {
          input.setForeground(Color.GRAY);
          input.setText("Search");
        }
      }
    });
  }
}
