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
  public StudentPage(String id) {
    super();
    super.setBackground(Color.WHITE);

    // Set the frame properties
    this.frame = new JFrame("Student: " + id);
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

      // Main Header
      new MainHeader(this);

      // Inputs array
      SubjectInput[] subjectInputs = new SubjectInput[4];
      GradeInput[] gradeInputs = new GradeInput[4];

      // Add the inputs to the canvas
      for (int i = 0; i < 4; i++) {
        // Create the subject input
        subjectInputs[i] = new SubjectInput(this, 10, 60 + (i * 30));

        // Create the grade input
        gradeInputs[i] = new GradeInput(this);
      }

      // Make the add new subject button
      new SaveButton(this);
      // new StudentIDHeader(manager, id);
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
