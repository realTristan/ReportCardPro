package Components.Inputs;

import javax.swing.event.DocumentEvent;

import Components.Canvas;
import Components.Lists.ResultsList;
import Components.Listeners.InputListener;

/**
 * A class for creating search inputs.
 */
public class SearchInput extends Input {
  /**
   * Constructs a new SearchInput object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the input to
   */
  public SearchInput(Canvas canvas) {
    super(canvas.center - 1, 100);

    // Set the placeholder text for the input
    super.setPlaceholder("Search for student");

    // Set the size of the input
    super.setSize(200, 30);

    // Add the input to the canvas
    canvas.add(this);
  }

  /**
   * Sets the listener for the search input.
   *
   * @param canvas the canvas to use for the search input
   * @param rl     the results list to use for the search input
   */
  public void setListener(Canvas canvas, ResultsList rl) {
    // Create a reference to the search input
    SearchInput searchInput = this;

    // Add a listener to the document
    super.getDocument().addDocumentListener(new InputListener() {
      // When the document is updated
      @Override
      public void update(DocumentEvent e) {
        // Get the value of the input
        String value = searchInput.getText();

        // Update the results list
        rl.setStudents(canvas, value);
      }
    });
  }
}
