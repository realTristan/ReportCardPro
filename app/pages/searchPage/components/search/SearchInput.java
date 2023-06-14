package pages.searchPage.components.search;

import javax.swing.event.DocumentEvent;

import components.input.Input;
import components.input.InputListener;
import pages.Manager;

/**
 * A class for creating search inputs.
 */
public class SearchInput extends Input {
  /**
   * Constructs a new SearchInput object and adds it to the search page canvas at
   * the specified location and size.
   *
   * @param manager the page manager
   */
  public SearchInput(Manager manager) {
    super(61, 100, 14);

    // Set the placeholder text for the input
    super.setPlaceholder("Search for student");

    // Set the size of the input
    super.setSize(190, 30);

    // Add the input to the canvas
    manager.searchPage.searchInput = this;
    manager.searchPage.add(manager.searchPage.searchInput);
  }

  /**
   * Clears the search input.
   * @return void
   */
  public void clear() {
    this.setText("");
  }

  /**
   * Sets a document listener on the search input to update the results list when
   * the input value changes.
   *
   * @param manager   the page manager
   * @param scrollPane the scroll pane update when the input value changes
   * @return void
   */
  public void setListener(Manager manager, StudentScrollPane scrollPane) {
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
        scrollPane.updateStudentList(manager, value);
      }
    });
  }
}
