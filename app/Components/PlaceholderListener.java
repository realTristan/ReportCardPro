package Components;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * A class for creating placeholder listeners.
 */
public class PlaceholderListener implements FocusListener {
    // Declare the input variable
    private Input input;

    // Declare the placeholder variable
    private String placeholder;

    /**
     * Constructs a new PlaceholderListener object.
     *
     * @param input       the input to add the listener to
     * @param placeholder the placeholder text to use
     */
    public PlaceholderListener(Input input, String placeholder) {
        super();
        this.input = input;
        this.placeholder = placeholder;
    }

    /**
     * Sets the placeholder text for the input.
     *
     * @param e the focus event to use
     */
    @Override
    public void focusGained(FocusEvent e) {
        if (this.input.getText().equals(this.placeholder)) {
          this.input.setText("");
          this.input.setForeground(Color.BLACK);
        }
    }

    /**
     * Sets the placeholder text for the input.
     *
     * @param e the focus event to use
     */
    @Override
    public void focusLost(FocusEvent e) {
        if (this.input.getText().isEmpty()) {
          this.input.setForeground(Color.GRAY);
          this.input.setText(this.placeholder);
        }
    }
}
