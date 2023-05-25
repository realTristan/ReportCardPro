package Pages.StudentPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Pages.Manager;
import Pages.StudentPage.Components.*;
import Pages.StudentPage.Components.StudentInfo.CoursesAndGrades;
import Pages.StudentPage.Components.StudentInfo.SaveButton;

/**
 * A class for creating student pages.
 */
public class StudentPage extends JFrame {
  public JFrame frame;
  public String id;

  /**
   * Constructs a new StudentPage object.
   */
  public StudentPage(String id) {
    super();
    super.setBackground(Color.WHITE);

    // Local variables
    this.id = id;
    this.frame = new JFrame(id);
    this.frame.setSize(300, 250);
    this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.frame.setVisible(true);
  }

  /**
   * Sets the content of the student page.
   *
   * @param manager the manager to use for the student page
   */
  public void setContent(Manager manager) {
    this.frame.setContentPane(new Panel(manager));
  }

  /**
   * A class for the student page panel.
   */
  public class Panel extends JPanel {
    public Panel(Manager manager) {
      super();
      new MainHeader(this);

      // Store the student info
      SubjectInput[] subjectInputs = new SubjectInput[4];
		  GradeInput[] gradeInputs = new GradeInput[4];

      // Add the student info
      new CoursesAndGrades(manager, this, id, subjectInputs, gradeInputs);
		  new SaveButton(manager, this, id, subjectInputs, gradeInputs);
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
