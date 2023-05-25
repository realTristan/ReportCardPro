package Pages.StudentPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Pages.StudentPage.Components.*;

/**
 * A class for creating student pages.
 */
public class StudentPage extends JFrame {
  // The frame
  public JFrame frame;

  /**
   * Constructs a new StudentPage object.
   *
   */
  public StudentPage() {
    super();
    super.setBackground(Color.WHITE);

    // Set the frame properties
    this.frame = new JFrame("Report Card Pro");
    this.frame.setSize(400, 400);
    this.frame.setLayout(null);
    this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.frame.setVisible(true);
    this.frame.setResizable(false);
  }

  /**
   * Sets the content of the student page.
   *
   * @param manager the manager to use for the student page
   */
  public void setContent() {
    Panel panel = new Panel();
    this.frame.setContentPane(panel);
  }

  /**
   * A class for creating panels.
   */
  public class Panel extends JPanel {
    /**
     * Constructs a new Panel object.
     */
    public Panel() {
      super();

      // Make the import grades and new subject buttons
      new SubjectButton(this);
      // new StudentIDHeader(manager, id);

      // Make the new subject input
      new SubjectInput(this, 10, 60);
      new SubjectInput(this, 10, 90);
      new SubjectInput(this, 10, 120);
      new SubjectInput(this, 10, 150);
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
}
