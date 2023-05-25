package Components;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * A functional interface for listening to changes in a document.
 */
@FunctionalInterface
public interface InputListener extends DocumentListener {
  /**
   * Updates the listener with the given document event.
   *
   * @param e the document event to update the listener with
   */
  void update(DocumentEvent e);

  @Override
  default void insertUpdate(DocumentEvent e) {
    update(e);
  }

  @Override
  default void removeUpdate(DocumentEvent e) {
    update(e);
  }

  @Override
  default void changedUpdate(DocumentEvent e) {
    update(e);
  }
}