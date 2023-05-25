package Pages.StudentPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Pages.StudentPage.Components.SubjectButton;
import Pages.StudentPage.Components.SubjectInput;

/**
 * A class for creating student pages.
 */
public class StudentPage extends JPanel {
  public int center;

  /**
   * Constructs a new StudentPage object and initializes it with the necessary
   * components.
   *
   * @param canvas the canvas to add the components to
   */
  public StudentPage() {
    super();

    // Set the background color
    super.setBackground(Color.WHITE);
  }

  // Paint components
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Set the center width
    this.center = super.getWidth() / 2;

    // Make the import grades and new subject buttons
    new SubjectButton(this, 10, 10);

    // Make the new subject input
    new SubjectInput(this, 10, 60);
    new SubjectInput(this, 10, 90);
    new SubjectInput(this, 10, 120);
    new SubjectInput(this, 10, 150);
  }
}
