package Pages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import org.json.simple.JSONObject;

import Components.*;
import Components.Buttons.SubjectButton;
import Components.Inputs.SubjectInput;

/**
 * A class for creating student pages.
 */
public class StudentPage extends Canvas {
  // The student data
  public JSONObject student;

  // The center width
  public int center;
  
  /**
   * Constructs a new StudentPage object and initializes it with the necessary
   * components.
   *
   * @param student the student data
   */
  public StudentPage(JFrame frame, Utils.Cache cache, JSONObject student) {
    super(frame, cache);

    // Set the cache
    this.student = student;

    // Set the background color
    super.setBackground(Color.WHITE);

    // Set the content pane
		super.frame.setContentPane(this);
  }

  /**
   * Paints the components on the canvas.
   *
   * @param student the student data
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Set the center width
    this.center = super.getWidth() / 2;

    // Starting page
    // Make the import grades and new subject buttons
    new SubjectButton(this, 10, 10);

    // Make the new subject input
    new SubjectInput(this, 10, 60);
    new SubjectInput(this, 10, 90);
    new SubjectInput(this, 10, 120);
    new SubjectInput(this, 10, 150);
  }
}
