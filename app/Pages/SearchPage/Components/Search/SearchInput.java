package Pages.SearchPage.Components.Search;

import javax.swing.event.DocumentEvent;

import Components.Input.Input;
import Components.Input.InputListener;
import Pages.Manager;

/**
 * A class for creating search inputs.
 */
public class SearchInput extends Input {
  /**
   * Constructs a new SearchInput object and adds it to the search page canvas at
   * the specified location and size.
   *
   * @param manager the manager to use for adding the input to the search page
   *                canvas
   */
  public SearchInput(Manager manager) {
    super(110, 100, 15);

    // Set the placeholder text for the input
    super.setPlaceholder("Search for student");

    // Set the size of the input
    super.setSize(200, 30);

    // Add the input to the canvas
    manager.searchPage.add(this);
  }

  /**
   * Sets a document listener on the search input to update the results list when
   * the input value changes.
   *
   * @param manager the manager to use for getting the students and updating the
   *                results list
   * @param rl      the results list to update when the input value changes
   */
  public void setListener(Manager manager, ScrollPane rl) {
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
        rl.updateStudentList(manager, value);
      }
    });
  }
}
