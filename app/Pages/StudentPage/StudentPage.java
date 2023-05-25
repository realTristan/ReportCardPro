package Pages.StudentPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Pages.Manager;
import Pages.StudentPage.Components.SubjectButton;
import Pages.StudentPage.Components.SubjectInput;

/**
 * A class for creating student pages.
 */
public class StudentPage extends JPanel {
  /**
   * Constructs a new StudentPage object and initializes it with the necessary
   * components.
   *
   * @param p the canvas to add the components to
   */
  public StudentPage() {
    super();
    super.setBackground(Color.WHITE);
  }

  /**
   * Sets the content of the student page.
   *
   * @param manager the manager to use for the student page
   */
  public void setContent(Manager manager) {
    // Make the import grades and new subject buttons
    new SubjectButton(manager, 10, 10);

    // Make the new subject input
    new SubjectInput(manager, 10, 60);
    new SubjectInput(manager, 10, 90);
    new SubjectInput(manager, 10, 120);
    new SubjectInput(manager, 10, 150);
  }

  /**
   * Paints the components on the canvas.
   *
   * @param g the graphics object to use for painting
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
}
