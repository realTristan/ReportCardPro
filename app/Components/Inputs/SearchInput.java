package Components.Inputs;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Components.Canvas;
import Components.ResultsList;

public class SearchInput {
  public SearchInput(Canvas canvas, int x, int y, ResultsList rl) {
    // Create a new input field
    Input input = new Input(x, y, 150, 30);

    // Set the listener
    this.setListener(canvas, input, rl);

    // Add the input to the canvas
    canvas.add(input);
  }

  // Set the listener
  public void setListener(Canvas canvas, Input input, ResultsList rl) {
    input.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        String value = input.getText();
        rl.setStudents(canvas, value);
      }

      @Override
      public void removeUpdate(DocumentEvent e) {
        String value = input.getText();
        rl.setStudents(canvas, value);
      }

      @Override
      public void changedUpdate(DocumentEvent e) {
        String value = input.getText();
        rl.setStudents(canvas, value);
      }
    });
  }
}
