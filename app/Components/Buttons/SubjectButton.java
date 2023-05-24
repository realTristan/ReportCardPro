package Components.Buttons;

import Components.Canvas;

/**
 * A class for creating buttons.
 */
public class SubjectButton extends Button {
  /**
   * Constructs a new SubjectButton object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the button to
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   * @param w the width of the button
   * @param h the height of the button
   */
  public SubjectButton (Canvas canvas, int x, int y, int w, int h) {
    super("Add Subject", x, y, w, h);
    canvas.add(this);
  }
}
