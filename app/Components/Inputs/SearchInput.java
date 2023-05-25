package Components.Inputs;

import javax.swing.event.DocumentEvent;

import Components.Canvas;
import Components.Lists.ResultsList;

/**
 * A class for creating search inputs.
 */
public class SearchInput extends Input {
  /**
   * Constructs a new SearchInput object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the input to
   * @param x      the x-coordinate of the input
   * @param y      the y-coordinate of the input
   */
  public SearchInput(Canvas canvas, int x, int y) {
    super(x, y);
    super.setPlaceholder("Search for student");
    super.setSize(150, 30);
    canvas.add(this);
  }

  /**
   * Sets the listener for the search input.
   *
   * @param canvas the canvas to use for the search input
   * @param rl     the results list to use for the search input
   */
  public void setListener(Canvas canvas, ResultsList rl) {
    SearchInput si = this;
    super.getDocument().addDocumentListener(new Listener() {
      @Override
      public void update(DocumentEvent e) {
        String value = si.getText();
        rl.setStudents(canvas, value);
      }
    });
  }
}
