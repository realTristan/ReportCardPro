package Components;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Input {
  //
  public static JTextField newField(int x, int y, int w, int h) {
    // Create a new input field
    JTextField field = new JTextField();

    // Set the bounds
    field.setBounds(x, y, w, h);

    // Return the field
    return field;
  }

  //
  public static void setListener(JTextField field, Runnable fn) {
    // Add a listener to the field
    field.getDocument().addDocumentListener(new DocumentListener() {
      // When a key is added to the field
      public void insertUpdate(DocumentEvent e) {
        fn.run();
      }

      // When a key is removed from the field
      public void removeUpdate(DocumentEvent e) {
        fn.run();
      }

      // When a key is changed in the field
      public void changedUpdate(DocumentEvent e) {
        fn.run();
      }
    });
  }

  //
  public static void subjectField(Canvas canvas, int x, int y) {
    // Create a new input field
    JTextField field = Input.newField(x, y, 150, 30);

    // Add the field to the canvas
    canvas.add(field);
  }
}
