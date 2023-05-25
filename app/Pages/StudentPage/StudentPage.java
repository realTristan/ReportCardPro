package Pages.StudentPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Pages.Manager;
import Pages.StudentPage.Components.*;
import Pages.StudentPage.Components.SaveButton.NewSaveButton;

/**
 * A class for creating student pages.
 */
public class StudentPage extends JFrame {
  // The frame
  public JFrame frame;

  // Student id
  public String id;

  /**
   * Constructs a new StudentPage object.
   *
   */
  public StudentPage(String id) {
    super();

    // Set the background color
    super.setBackground(Color.WHITE);

    // Set the student id
    this.id = id;

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
  public void setContent(Manager manager) {
    // Create the panel
    Panel panel = new Panel(manager);

    // Set the content pane
    this.frame.setContentPane(panel);
  }

  /**
   * A class for creating panels.
   */
  public class Panel extends JPanel {
    /**
     * Constructs a new Panel object.
     */
    public Panel(Manager manager) {
      super();

      // Main Header
      new MainHeader(this);

      // Add the save button
      new NewSaveButton(this, manager, id);
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
