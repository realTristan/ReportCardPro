package Pages.SearchPage.Components;

import javax.swing.event.DocumentEvent;

import Components.Input;
import Pages.SearchPage.SearchPage;

/**
 * A class for creating search inputs.
 */
public class SearchInput extends Input {
  /**
   * Constructs a new SearchInput object and sets its bounds to the specified
   * location and size.
   *
   * @param searchPage the canvas to add the input to
   */
  public SearchInput(SearchPage searchPage) {
    super(searchPage.center - 1, 100);

    // Set the placeholder text for the input
    super.setPlaceholder("Search for student");

    // Set the size of the input
    super.setSize(200, 30);

    // Add the input to the canvas
    searchPage.add(this);
  }

  /**
   * Sets the listener for the search input.
   *
   * @param searchPage the canvas to use for the search input
   * @param rl     the results list to use for the search input
   */
  public void setListener(SearchPage searchPage, ResultsList rl) {
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
        rl.setStudents(searchPage, value);
      }
    });
  }
}
